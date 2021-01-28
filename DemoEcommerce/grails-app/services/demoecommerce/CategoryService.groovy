package demoecommerce

import formation.commands.CategoryCommand
import formation.repositories.CategoryRepository
import grails.transaction.Transactional
import org.springframework.validation.Errors

@Transactional
class CategoryService {
    CategoryRepository categoryRepository
    def findCategories() {
        [categories: categoryRepository.readAll(null)]
    }
    boolean saveCategory(CategoryCommand categoryCommand) {
        categoryCommand.validate()
    }
}
