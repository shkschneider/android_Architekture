package me.shkschneider.product

class ProductUseCase(
    private val productRepository: ProductRepository
) {

    fun getProduct(name: String) = productRepository.getProduct(name)

}