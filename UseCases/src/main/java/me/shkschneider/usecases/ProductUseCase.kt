package me.shkschneider.usecases

import me.shkschneider.repositories.ProductRepository

class ProductUseCase(
    private val productRepository: ProductRepository
) {

    fun getProduct(name: String) = productRepository.getProduct(name)

}