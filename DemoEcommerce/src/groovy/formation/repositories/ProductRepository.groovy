package formation.repositories

import demoecommerce.Product
import formation.interfaces.IRepository

class ProductRepository implements IRepository<Product> {
    @Override
    void create(Product element) {
        element.save()
    }

    @Override
    void update(Product element) {

    }

    @Override
    void delete(Product element) {

    }

    @Override
    Product read(int id) {
        Product.findById(id)
    }

    @Override
    List<Product> readAll(Object closure) {
        Product.findAll()
    }
}
