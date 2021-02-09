package demoecommerce
import static grails.async.Promises.*
import grails.async.DelegateAsync
import grails.async.Promise
import grails.transaction.Transactional

@Transactional
class ProductAsyncService {
    @DelegateAsync ProductService
    /*Promise<List<Product>> findListProducts() {
        task {
            productRepository.readAll(null)
        }
    }*/
}
