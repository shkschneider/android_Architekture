package me.shkschneider.architekture.usecases

import me.shkschneider.architekture.repositories.ProductRepository

class ProductUseCase(
    private val productRepository: ProductRepository
) {

    fun getProduct(name: String) = productRepository.getProduct(name)

}