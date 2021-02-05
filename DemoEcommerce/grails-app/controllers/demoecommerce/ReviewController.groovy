package demoecommerce

import grails.web.RequestParameter

class ReviewController {
    ReviewService reviewService
    def index() { }

    def reviewByProduct(@RequestParameter("id") id) {
        //test1 -> Product not exist => Exception
        //test2 -> Product Exist ->view review
        //test3 -> Product Exist -> Model
    }

    def form() {

    }

    def submitForm() {

    }

    def handleTypeException() {

    }
}
