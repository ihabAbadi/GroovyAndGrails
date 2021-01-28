package demoecommerce

import grails.transaction.Transactional
import org.springframework.web.context.request.RequestContextHolder

@Transactional
class BasketService {
    ProductService productService
    def addProduct(int id) {
        if(id) {
            def product = productService.findProduct(id)
            if(product) {
                handleAddProductToCart(product)
                getCartFromSession().size()
            }
            else
                throw new Exception("")
        }
        else throw new Exception("")
    }


    private def handleAddProductToCart(def product) {
            def cart = getCartFromSession()
            cart.add(product)
            setCartToSession(cart)
    }

    private ArrayList getCartFromSession() {
        def cart = RequestContextHolder.currentRequestAttributes().getSession().cart
        if(cart) {
            cart
        }
        else {
            []
        }
    }


    private void setCartToSession(def cart) {
        RequestContextHolder.currentRequestAttributes().getSession().cart = cart
    }
}
