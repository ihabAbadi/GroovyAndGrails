package demoecommerce

import formation.repositories.ReviewRepository
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.services.ServiceUnitTestMixin} for usage instructions
 */
@TestFor(ReviewService)
@Mock([Product, Review])
class ReviewServiceSpec extends Specification {
    def reviewReposMock
    def productServiceMock
    def setup() {
        reviewReposMock = mockFor(ReviewRepository)
        productServiceMock = mockFor(ProductService)
    }

    def cleanup() {
    }

    void "Product Not Exist"() {
        given:
        productServiceMock.demand.findProduct{int id-> throw new Exception("Product not found")}
        service.productService = productServiceMock.createMock()
        when:
        def result = service.getReviewsByProductId(1)
        then:
        Exception e = thrown()
        e.message == "Product not exist"
    }

    void "Reviews when Product Exist"() {
        given:
        Product p = new Product(title: 'test', id: 1)
        productServiceMock.demand.findProduct{int id-> p}
        reviewReposMock.demand.getReviewByProductId {id -> [new Review(content: 'content 1', product: p)]}
        when:
        def result = service.getReviewsByProductId(1)
        then:
        result.size() == 1
    }
}
