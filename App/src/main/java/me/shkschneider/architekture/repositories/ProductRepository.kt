package me.shkschneider.architekture.repositories

import me.shkschneider.architekture.entities.Product

class ProductRepository {

    fun getProduct(name: String) = Product(name = name)

}
