package demoecommerce

class Review {
    Date date
    String content
    static hasOne = [product:Product]
    static constraints = {
    }
}
