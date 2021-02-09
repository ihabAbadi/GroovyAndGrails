package demoecommerce

import grails.gorm.DetachedCriteria
import groovy.transform.ToString

import org.apache.commons.lang.builder.HashCodeBuilder

@ToString(cache=true, includeNames=true, includePackage=false)
class AuthUserAuthRole implements Serializable {

	private static final long serialVersionUID = 1

	AuthUser authUser
	AuthRole authRole

	AuthUserAuthRole(AuthUser u, AuthRole r) {
		this()
		authUser = u
		authRole = r
	}

	AuthUserAuthRole() {

	}

	@Override
	boolean equals(other) {
		if (!(other instanceof AuthUserAuthRole)) {
			return false
		}

		other.authUser?.id == authUser?.id && other.authRole?.id == authRole?.id
	}

	@Override
	int hashCode() {
		def builder = new HashCodeBuilder()
		if (authUser) builder.append(authUser.id)
		if (authRole) builder.append(authRole.id)
		builder.toHashCode()
	}

	static AuthUserAuthRole get(long authUserId, long authRoleId) {
		criteriaFor(authUserId, authRoleId).get()
	}

	static boolean exists(long authUserId, long authRoleId) {
		criteriaFor(authUserId, authRoleId).count()
	}

	private static DetachedCriteria criteriaFor(long authUserId, long authRoleId) {
		AuthUserAuthRole.where {
			authUser == AuthUser.load(authUserId) &&
			authRole == AuthRole.load(authRoleId)
		}
	}

	static AuthUserAuthRole create(AuthUser authUser, AuthRole authRole, boolean flush = false) {
		def instance = new AuthUserAuthRole(authUser: authUser, authRole: authRole)
		instance.save(flush: flush, insert: true)
		instance
	}

	static boolean remove(AuthUser u, AuthRole r, boolean flush = false) {
		if (u == null || r == null) return false

		int rowCount = AuthUserAuthRole.where { authUser == u && authRole == r }.deleteAll()

		if (flush) { AuthUserAuthRole.withSession { it.flush() } }

		rowCount
	}

	static void removeAll(AuthUser u, boolean flush = false) {
		if (u == null) return

		AuthUserAuthRole.where { authUser == u }.deleteAll()

		if (flush) { AuthUserAuthRole.withSession { it.flush() } }
	}

	static void removeAll(AuthRole r, boolean flush = false) {
		if (r == null) return

		AuthUserAuthRole.where { authRole == r }.deleteAll()

		if (flush) { AuthUserAuthRole.withSession { it.flush() } }
	}

	static constraints = {
		authRole validator: { AuthRole r, AuthUserAuthRole ur ->
			if (ur.authUser == null || ur.authUser.id == null) return
			boolean existing = false
			AuthUserAuthRole.withNewSession {
				existing = AuthUserAuthRole.exists(ur.authUser.id, r.id)
			}
			if (existing) {
				return 'userRole.exists'
			}
		}
	}

	static mapping = {
		id composite: ['authUser', 'authRole']
		version false
	}
}
