package demoecommerce

import formation.exceptions.NotFoundProductsException
import formation.repositories.ProductRepository
import grails.transaction.Transactional

@Transactional
class ProductService {
    ProductRepository productRepository

    def searchProducts(def search) {
        [products : getProducts({}), message : search]
    }

    def findProductsByCategory(def category) {
        [products :  getProducts(null), message : category]
    }
    def findProducts() {
        [products :  productRepository.readAll(null)]
    }

    def saveProduct(def product) {
        //Validation du Product et Save du product à l'aide du repository
    }

    def updateProduct(def product) {

    }

    def findProduct(def id) {
        if(id) {
            [product:productRepository.read(id)]
        }
        else {
            throw new Exception("Product not found")
        }
    }

    private def getProducts(def closure) {
        if(closure) {
            productRepository.readAll({or{}})
        }
        else {
            throw new NotFoundProductsException("miss closure")
        }
    }
}
