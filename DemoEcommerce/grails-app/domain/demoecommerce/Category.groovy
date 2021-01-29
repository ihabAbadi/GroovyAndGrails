package demoecommerce

class Category {
    String title
    //Image image
    //static hasOne = [image:Image]
    static hasMany = [products:Product]
    static constraints = {
    }
}
