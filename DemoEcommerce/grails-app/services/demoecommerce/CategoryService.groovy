package demoecommerce

import formation.commands.CategoryCommand
import formation.repositories.CategoryRepository
import grails.transaction.Transactional
import grails.validation.ValidationErrors
import org.springframework.validation.Errors
import org.springframework.web.multipart.commons.CommonsMultipartFile


class CategoryService {
    CategoryRepository categoryRepository
    UploadService uploadService
    def findCategories() {
        [categories: categoryRepository.readAll(null)]
    }
    boolean saveCategory(CategoryCommand categoryCommand, def file) {
        if(!categoryCommand.validate()) {
            ValidationErrors customErrors = new ValidationErrors(categoryCommand)
            customErrors.putAt('title', 'Notre erreur title')
            categoryCommand.errors = customErrors
            return  false
        }
        else {
            Category category = new Category(title: categoryCommand.title)
            category.image = uploadService.upload(file)
            categoryRepository.create(category)
            return true
        }
    }
}
