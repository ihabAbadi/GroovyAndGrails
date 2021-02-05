import formation.repositories.CategoryRepository
import formation.repositories.ProductRepository
import formation.repositories.ReviewRepository

// Place your Spring DSL code here
beans = {
    productRepository(ProductRepository)
    categoryRepository(CategoryRepository)
    reviewRepository(ReviewRepository)
}
