package demoecommerce

class ProductImage {
    Product product
    Image image

    static ProductImage create(Product product, Image image) {
        new ProductImage(product:product, image:image).save()
    }

    static boolean remove(Product product, Image image) {
       /* ProductImage.remove(product, image)*/
        ProductImage pi = ProductImage.findAllByProductAndImage(product, image)
        pi ? pi?.delete() : false
    }
    static constraints = {
    }
}
