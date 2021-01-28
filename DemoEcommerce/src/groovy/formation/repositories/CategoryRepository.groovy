package formation.repositories

import demoecommerce.Category
import formation.interfaces.IRepository

class CategoryRepository implements IRepository<Category> {
    @Override
    void create(Category element) {

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
        [
                new Category(title: 'cat 1'),
                new Category(title: 'cat 2'),
                new Category(title: 'cat 3')
        ]
    }
}
