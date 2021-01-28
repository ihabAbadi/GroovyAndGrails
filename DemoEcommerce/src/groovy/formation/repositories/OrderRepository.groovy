package formation.repositories

import demoecommerce.Order
import formation.interfaces.IRepository

class OrderRepository implements IRepository<Order> {
    @Override
    void create(Order element) {

    }

    @Override
    void update(Order element) {

    }

    @Override
    void delete(Order element) {

    }

    @Override
    Order read(int id) {
        return null
    }

    @Override
    List<Order> readAll(Object closure) {
        return null
    }
}
