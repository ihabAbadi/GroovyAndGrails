package demoecommerce

import formation.repositories.ProductRepository
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import groovy.mock.interceptor.MockFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ProductController)
@Mock([Product, ProductService, CategoryService])
class ProductControllerSpec extends Specification {

    def setup() {

    }

    def cleanup() {
    }

    void "test view index methode"() {
        //Arrange
        //Instanciation du oontroller
        /*def controller = new ProductController()*/

        //Act
        //Démarrer la méthode
        /*def result = controller.index()*/
        //Assert
        //Comparer le resultat de la méthode avec le resultat attendu
        given:
        /*controller.productService = new ProductService()
        controller.categoryService = new CategoryService()*/
        def reposMock = mockFor(ProductRepository)
        reposMock.demand.readAll {[new Product(title: 'test')]}
        controller.productService.productRepository = reposMock.createMock()
        when:

            controller.index()
        then:
            //view == "/product/products"
            response.redirectUrl == '/product/index'
    }
}
