import formation.listener.CustomPersistenceListener
import org.codehaus.groovy.grails.commons.GrailsApplication

class BootStrap {
    GrailsApplication grailsApplication
    def init = { servletContext ->
        def a = grailsApplication.mainContext
        a.eventTriggeringInterceptor.datastores.each {i,datastore ->
            grailsApplication.mainContext.addApplicationListener(new CustomPersistenceListener(datastore))
        }
    }
    def destroy = {
    }


}
