package formation.repositories

import demoecommerce.Category
import formation.interfaces.IRepository

class CategoryRepository implements IRepository<Category> {
    @Override
    void create(Category element) {
        element.save()
    }

    @Override
    void update(Category element) {

    }

    @Override
    void delete(Category element) {

    }

    @Override
    Category read(int id) {
        return null
    }

    @Override
    List<Category> readAll(Object closure) {
       Category.list()
    }
}
