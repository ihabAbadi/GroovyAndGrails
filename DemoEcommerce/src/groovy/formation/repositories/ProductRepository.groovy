package formation.repositories

import demoecommerce.Product
import formation.interfaces.IRepository

class ProductRepository implements IRepository<Product> {
    @Override
    void create(Product element) {

    }

    @Override
    void update(Product element) {

    }

    @Override
    void delete(Product element) {

    }

    @Override
    Product read(int id) {
        return null
    }

    @Override
    List<Product> readAll(Object closure) {
        return null
    }
}
