package demoecommerce

import formation.exceptions.NotFoundProductsException
import formation.repositories.ProductRepository
import grails.transaction.Transactional
import org.springframework.web.multipart.commons.CommonsMultipartFile

@Transactional
class ProductService {
    ProductRepository productRepository
    UploadService uploadService
    def searchProducts(String search) {
        [products : searchProductByContent(search), message : search]
    }

    def findProductsByCategory(def category) {
        [products :  getProducts(null), message : category]
    }
    def findProducts() {
        [products :  productRepository.readAll(null)]
    }

    def saveProduct(Product product, def files) {
        //Validation du Product et Save du product à l'aide du repository
        if(product.validate()) {
            files.eachWithIndex {image, index ->
                product.addToImages(uploadService.upload(image))
            }
            productRepository.create(product)
            return true
        }
        return false
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
    private def searchProductByContent(String content) {
        Product.findAllByTitleLikeOrDescriptionLike('%'+content+'%', '%'+content+'%')
    }
    private def getProducts(def closure) {
        /*if(closure) {
            productRepository.readAll({or{}})
        }
        else {
            throw new NotFoundProductsException("miss closure")
        }*/
        productRepository.readAll({or{}})
    }
}
