package grailsdemo

import com.utopios.traits.OurControllerTrait


class HomeController implements OurControllerTrait {
    /*static scope = "prototype"*/

    //def beforeInterceptor = {-> ''}
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

    private actionToRun() {

    }
}
