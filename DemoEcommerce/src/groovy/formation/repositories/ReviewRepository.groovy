package formation.repositories

import demoecommerce.Review
import formation.interfaces.IRepository

class ReviewRepository implements IRepository<Review> {
    @Override
    void create(Review element) {

    }

    @Override
    void update(Review element) {

    }

    @Override
    void delete(Review element) {

    }

    @Override
    Review read(int id) {
        return null
    }

    @Override
    List<Review> readAll(Object closure) {
        return null
    }
}
