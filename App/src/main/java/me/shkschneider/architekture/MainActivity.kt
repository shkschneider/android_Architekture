package me.shkschneider.architekture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.shkschneider.entities.Order
import me.shkschneider.entities.Product
import me.shkschneider.entities.User
import me.shkschneider.order.OrderUseCase
import me.shkschneider.product.ProductUseCase
import me.shkschneider.user.UserUseCase
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val orderUseCase by inject<OrderUseCase>()
    private val productUseCase by inject<ProductUseCase>()
    private val userUseCase by inject<UserUseCase>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = User.fromPayload(userUseCase.getUser("John Doe").toPayload())
        val product = Product.fromPayload(productUseCase.getProduct("Coffee").toPayload())
        val order = Order.fromPayload(orderUseCase.getOrder(user, product).toPayload())
    }

}
