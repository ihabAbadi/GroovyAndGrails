package demoecommerce

import formation.commands.CategoryCommand
import formation.repositories.CategoryRepository
import grails.transaction.Transactional
import grails.validation.ValidationErrors
import org.springframework.validation.Errors

@Transactional
class CategoryService {
    CategoryRepository categoryRepository
    def findCategories() {
        [categories: categoryRepository.readAll(null)]
    }
    boolean saveCategory(CategoryCommand categoryCommand) {

        if(!categoryCommand.validate()) {
            ValidationErrors customErrors = new ValidationErrors(categoryCommand)
            customErrors.putAt('title', 'Notre erreur title')
            categoryCommand.errors = customErrors
            return  false
        }
        else {
            return true
        }
    }
}
