package demoecommerce

import formation.exceptions.NotFoundProductsException
import formation.repositories.ProductRepository
import grails.gorm.DetachedCriteria
import grails.transaction.Transactional
import org.hibernate.FetchMode
import org.springframework.web.multipart.commons.CommonsMultipartFile
import groovy.sql.Sql

import javax.sql.DataSource

@Transactional
class ProductService {
    ProductRepository productRepository
    UploadService uploadService
    DataSource dataSource
    def searchProducts(String search) {
       [products : productRepository.searchByAllField(search), message : search]

    }

    def findProductsByCategory(int category) {
        [products :  productRepository.getProductByCategory(category), message : category]
    }

    def findProducts() {
       [products :  productRepository.readAll(null)]
       //[products: findProductsSql()]
    }

    def saveProduct(Product product, def files) {
        //Validation du Product et Save du product à l'aide du repository
        if(product.validate()) {
            productRepository.create(product)
            files.eachWithIndex {image, index ->
              //product.addToImages(uploadService.upload(image))
                ProductImage.create(product,uploadService.upload(image))
            }
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
    /*private def searchProductByContent(String content) {
        Product.findAllByTitleLikeOrDescriptionLike('%'+content+'%', '%'+content+'%')
    }*/

    def findProductsSql() {
        String request = "SELECT * from product"
        def sql = new Sql(dataSource: dataSource)
        def result = sql.call("PROCEDURE")
        result
    }

}
