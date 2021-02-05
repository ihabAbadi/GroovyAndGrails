package demoecommerce

import formation.repositories.ReviewRepository
import grails.transaction.Transactional

@Transactional
class ReviewService {
    ReviewRepository reviewRepository
    ProductService productService
    List<Review> getReviewsByProductId(int id) {
        //test 1-> Product Not Exist
        //test 2-> Product Exist
        throw new Exception()
    }

    boolean saveReview(Review review) {
        throw new Exception()
    }
}
