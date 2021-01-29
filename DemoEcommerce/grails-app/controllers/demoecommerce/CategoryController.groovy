package demoecommerce

import formation.commands.CategoryCommand
import grails.web.RequestParameter

class CategoryController {

    CategoryService categoryService
    //Get all categories to sideBar
    def index() {
        render(view: 'categories', model: categoryService.findCategories())
    }

    def form() {
        render(view: 'form')
    }

    def submitForm() {
        CategoryCommand categoryCommand = new CategoryCommand(title: params.title)
        if(categoryService.saveCategory(categoryCommand, request.getFile('image'))){
            redirect(action: 'index', controller: 'product')
        }
        else {
            render(view: 'form', model: [categoryCommand:categoryCommand])
        }
    }
}
