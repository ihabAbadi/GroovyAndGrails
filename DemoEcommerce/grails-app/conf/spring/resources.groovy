import formation.repositories.CategoryRepository
import formation.repositories.ProductRepository

// Place your Spring DSL code here
beans = {
    productRepository(ProductRepository)
    categoryRepository(CategoryRepository)

}
