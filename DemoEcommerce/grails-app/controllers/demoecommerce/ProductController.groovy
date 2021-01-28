package demoecommerce

import grails.web.RequestParameter

class ProductController {

    ProductService productService
    //Action to get All Products to Index, And Products by Category
    def index() {
        render(view: 'products', model: productService.findProductsByCategory(params.categoryId))
    }

    //Action for searching products
    def search(@RequestParameter("search") search) {
        render(view: 'products', model: productService.searchProducts(search))
    }

    //Action to get Product
    def detail(@RequestParameter("id") id) {
        render(view: 'product', model: productService.findProduct(id))
    }

    def form() {

    }

    def submitForm() {

    }

    def handleNotFoundProductsException() {
        render(view: 'products', model: productService.findProducts())
    }
}
