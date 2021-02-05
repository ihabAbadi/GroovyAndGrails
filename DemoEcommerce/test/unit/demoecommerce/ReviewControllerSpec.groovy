package demoecommerce

import formation.repositories.ReviewRepository
import grails.test.mixin.Mock
import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * See the API for {@link grails.test.mixin.web.ControllerUnitTestMixin} for usage instructions
 */
@TestFor(ReviewController)
@Mock([ProductService, Product])
class ReviewControllerSpec extends Specification {
    def reviewServiceMock
    def setupSpec() {

    }
    def setup() {
        reviewServiceMock = mockFor(ReviewService)
    }

    def cleanup() {
    }

    def "Product not Exist"() {
        given:
        controller.reviewService = reviewServiceMock.createMock()
        when:
            controller.reviewByProduct(0)
        then:
            Exception e = thrown()
            e.message == 'Product not Exist'
    }

    def "Product Exist test View"() {
        given:
        reviewServiceMock.demand.getReviewsByProductId{int id -> [new Review(content: 'content')]}
        controller.reviewService = reviewServiceMock.createMock()
        when:
            controller.reviewByProduct(1)
        then:
        views == "/review/reviews"
    }

    def "Test Model when Product exist"() {
        given:
        reviewServiceMock.demand.getReviewsByProductId {int id -> [new Review(content:'content 1'), new Review(content: 'content 2')]}
        controller.reviewService = reviewServiceMock.createMock()
        when:
        controller.reviewByProduct(1)
        then :
        model.reviews.size() == 2
    }
}
