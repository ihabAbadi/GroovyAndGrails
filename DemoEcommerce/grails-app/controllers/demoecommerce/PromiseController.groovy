package demoecommerce

import grails.plugin.springsecurity.annotation.Secured
import static grails.async.Promises.*
@Secured(['permitAll'])
class PromiseController {
    ProductAsyncService productAsyncService
    def index() {
        def promise = task {
            //Action executed on own thread
            sleep(5000)
            'result of promise'
        }
//   def result = waitAll(promise)
        promise.onComplete { result ->
            println result
        }

        promise.onError {err ->
            println err
        }
        render 'hello from promise '
    }


    def products() {
        def asy = startAsync()
        asy.start {
            /*def p = productAsyncService.findListProducts()
        def result = waitAll(p)*/
            def result = Product.findAll()

            //render
            render result
            asy.dispatch()
        }

    }

}
