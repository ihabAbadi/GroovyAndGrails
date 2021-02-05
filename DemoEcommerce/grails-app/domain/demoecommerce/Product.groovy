package demoecommerce

import groovy.transform.Canonical


class Product {
    String title
    Double price
    String description

    static hasMany = [categories:Category, reviews:Review, orders:Order]
    static belongsTo = [Category, Order]
    static constraints = {
    }

    List<Image> getImages() {
        ProductImage.findAllByProduct(this).collect({it.image})
    }
    static  mapping = {

    }

    def beforeInsert() {

    }

    def afterInsert() {

    }

    def onLoad() {

    }

    def afterLoad() {

    }

}
