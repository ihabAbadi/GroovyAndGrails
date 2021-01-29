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
        return new Product(title: 'product 1', description: 'description 1', price: 10)
    }

    @Override
    List<Product> readAll(Object closure) {
        return [
            new Product(title: 'product 1', description: 'description 1', price: 10),
            new Product(title: 'product 2', description: 'description 2', price: 30),
        ]
    }
}
