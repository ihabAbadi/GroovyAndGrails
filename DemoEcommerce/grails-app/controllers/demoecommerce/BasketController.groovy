package demoecommerce

import grails.web.RequestParameter

class BasketController {
    BasketService basketService
    def index() { }

    def addProduct(@RequestParameter("id") int id) {
        render(text: basketService.addProduct(id))
    }
}
