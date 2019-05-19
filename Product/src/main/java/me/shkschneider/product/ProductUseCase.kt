package me.shkschneider.product

import me.shkschneider.entities.AbstractProduct
import org.koin.standalone.KoinComponent
import org.koin.standalone.inject

class ProductUseCase : KoinComponent {

    private val productRepository by inject<ProductRepository>()

    fun getProduct(name: String) = productRepository.getProduct(name) as AbstractProduct

}
