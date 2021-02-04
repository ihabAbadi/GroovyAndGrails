package demoecommerce

import formation.exceptions.NotFoundProductsException
import grails.converters.JSON
import grails.web.RequestParameter

class ProductController {

    ProductService productService
    CategoryService categoryService
    //Action to get All Products to Index,
    def index() {
        def response = productService.findProducts()
        render(view: 'products', model: response)
    }


    //get Produt By Category
    def indexAjax() {

        def response = productService.findProductsByCategory(Integer.parseInt(params.categoryId))
        flash.message = response.message
        render(template: 'partialProducts', model: response)
        //render response as JSON
    }

    //Action for searching products
    def search(@RequestParameter("search") String search) {
        def response = productService.searchProducts(search as String)
        flash.message = response.message
        render(view: 'products', model: response)
    }

    //Action to get Product
    def detail(@RequestParameter("id") int id) {
        render(view: 'product', model: productService.findProduct(id))
    }

    def form() {
        def categories = categoryService.findCategories()
        render(view: 'form', model: [categories:categories.categories])
    }

    def submitForm() {
        Product product = new Product()
        product.properties = params
        if(productService.saveProduct(product, request.getFiles('imgs'))) {
            redirect(action: 'index')
        }
        else {
            render(view: 'form', model: [product:product])
        }
    }

    def handleNotFoundProductsException(NotFoundProductsException e) {
        render(view: 'products', model: productService.findProducts())
    }
}
