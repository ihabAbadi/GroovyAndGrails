package formation.viewModels

class ProductViewModel<T> {
    String title
    String decription
    double price

    static ProductViewModel build(T a) {
        ProductViewModel p = new ProductViewModel()
        //Extract data from T
        p
    }
}
