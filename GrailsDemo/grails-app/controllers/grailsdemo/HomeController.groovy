package grailsdemo

import com.utopios.controller.BaseController
import com.utopios.entities.Person
import com.utopios.factories.HomeFactory
import com.utopios.traits.ExceptionHandler
import com.utopios.traits.OurControllerTrait
import grails.web.RequestParameter


class HomeController extends BaseController implements OurControllerTrait, ExceptionHandler {
    /*static scope = "prototype"*/

    //def beforeInterceptor = {-> ''}
    
    FirstService firstService
    HomeFactory homeFactory
    def index() {
        render(grailsApplication.config.ourConfig.props)
    }

    def testScopeRequest() {
        render params.test
    }
    def testScopeFlash() {
        flash.erreur = "Voici l'erreur"

        redirect(action: 'getFlashScope', params: [])
    }

    def getFlashScope() {
        render flash.erreur
    }

    def actionWithRespond() {
        respond([name : 'abadi ihab'])
    }

    def actionWithFormat() {
        withFormat {
            json{
                respond([name : 'abadi ihab'])
            }
            form {
                [name : 'abadi ihab']
            }

        }
    }


    //Test injection de service
    def testService() {
//        render firstService.method1()
        firstService.method1()
        redirect(action: 'testSessionService')
    }

    //test injection de service après redirection
    def testSessionService() {
       render firstService.method2()
    }

    private actionToRun() {

    }

    //Gestion exception
   /* def handleRuntimeException(RuntimeException e) {
        *//*RuntimeException ex = new RuntimeException()
        ex.properties = params*//*
        render e.message
    }*/

    def testDataBinding(Person p) {
        /*Person.metaClass.properties = params
        Person p = new Person()*/
        render p
    }

    def testDataBinding2(@RequestParameter('name') String firstName) {

    }


}
