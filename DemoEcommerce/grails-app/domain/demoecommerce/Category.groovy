package demoecommerce

class Category {
    String title
    Image image
    static hasMany = [products:Product]
    static constraints = {
    }
}
