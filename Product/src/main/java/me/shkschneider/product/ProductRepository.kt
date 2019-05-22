package me.shkschneider.product

import me.shkschneider.entities.Product

class ProductRepository {

    fun getProduct(name: String) = Product(name = name)

}
