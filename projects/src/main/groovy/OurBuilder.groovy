import groovy.transform.builder.Builder

class Product {
    String name
    double price
    String description

    Product(String name) {
        this.name = name
    }
}
@Builder
class Shop {
    List products
    String name

    Shop(String name) {
        this.name = name
        products = new ArrayList()
    }
}

class ShopBuilder extends BuilderSupport {

    @Override
    protected void setParent(Object parent, Object child) {

    }

    @Override
    protected Object createNode(Object name, Object value) {
        switch (name) {
            case 'shop' : return createShop(value)
            case 'product' : return createProduct(value)
            case 'price' : return setPrice(value)
            case 'description' : return setDescription(value)
            default: throw new IllegalArgumentException("Erreur node name")
        }
    }

    @Override
    protected Object createNode(Object name) {
        return null
    }

    @Override
    protected Object createNode(Object name, Map attributes) {
        return null
    }

    @Override
    protected Object createNode(Object name, Map attributes, Object value) {
        return null
    }

    private Shop createShop(String name) {
        Shop s = new Shop(name)
        return  s
    }


    private Product createProduct(String name) {
        Product p = new Product(name)
        if(current instanceof Shop) {
            current.products << p
        }
        return p
    }

    private void setPrice(double price) {
        if(current instanceof Product) {
            current.price = price
        }
        else {
            throw new IllegalArgumentException("Erreur node name")
        }
    }

    private void setDescription(String description) {
        if(current instanceof Product) {
            current.description = description
        }
        else {
            throw new IllegalArgumentException("Erreur node name")
        }
    }
}

ShopBuilder shopBuilder = new ShopBuilder()
def shop = shopBuilder.shop("shop 1") {
    product("product 1") {
        price(20)
        description("descrition product 1")
    }
    product("product 2") {
        price(40)
        description("descrition product 2")
    }
}