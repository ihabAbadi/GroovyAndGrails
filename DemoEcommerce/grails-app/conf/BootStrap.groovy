import demoecommerce.RequestMap
import formation.listener.CustomPersistenceListener
import org.codehaus.groovy.grails.commons.GrailsApplication

class BootStrap {
    GrailsApplication grailsApplication
    def init = { servletContext ->
        def a = grailsApplication.mainContext
        a.eventTriggeringInterceptor.datastores.each {i,datastore ->
            grailsApplication.mainContext.addApplicationListener(new CustomPersistenceListener(datastore))
        }

        new RequestMap( urlRequest: '/login/auth', roleRequest: 'permitAll').save()
    }
    def destroy = {
    }


}
