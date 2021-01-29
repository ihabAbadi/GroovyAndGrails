package demoecommerce

class Order {
    double total
    static hasMany = [products:Product]
    static constraints = {
    }
}
