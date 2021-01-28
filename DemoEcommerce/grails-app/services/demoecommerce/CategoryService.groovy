package demoecommerce

import formation.repositories.CategoryRepository
import grails.transaction.Transactional

@Transactional
class CategoryService {
    CategoryRepository categoryRepository
    def findCategories() {
        [categories: categoryRepository.readAll(null)]
    }
}
