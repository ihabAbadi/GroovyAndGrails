package demoecommerce

import formation.repositories.ReviewRepository
import grails.transaction.Transactional

@Transactional
class ReviewService {
    ReviewRepository reviewRepository

    List<Review> getReviewsByProductId(int id) {
        throw new Exception()
    }
}
