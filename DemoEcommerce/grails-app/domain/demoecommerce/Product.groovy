package demoecommerce

import groovy.transform.Canonical


class Product {
    String title
    Double price
    String description
    static hasMany = [images:Image, categories:Category, reviews:Review, orders:Order]
    static belongsTo = [Category, Order]
    static constraints = {
    }
}
