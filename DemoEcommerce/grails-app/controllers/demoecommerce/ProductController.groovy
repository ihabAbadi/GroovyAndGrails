package demoecommerce

import formation.exceptions.NotFoundProductsException
import grails.web.RequestParameter

class ProductController {

    ProductService productService
    //Action to get All Products to Index, And Products by Category
    def index() {
        def response = productService.findProductsByCategory(params.categoryId)
        flash.message = response.message
        render(view: 'products', model: response)
    }

    //Action for searching products
    def search(@RequestParameter("search") String search) {
        def response = productService.searchProducts(params.search)
        flash.message = response.message
        render(view: 'products', model: response)
    }

    //Action to get Product
    def detail(@RequestParameter("id") def id) {
        render(view: 'product', model: productService.findProduct(id))
    }

    def form() {

    }

    def submitForm() {

    }

    def handleNotFoundProductsException(NotFoundProductsException e) {
        render(view: 'products', model: productService.findProducts())
    }
}
