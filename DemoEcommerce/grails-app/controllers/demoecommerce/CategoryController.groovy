package demoecommerce

class CategoryController {

    CategoryService categoryService
    //Get all categories to sideBar
    def index() {
        render(view: 'categories', model: categoryService.findCategories())
    }

    def form() {

    }

    def submitForm() {

    }
}
