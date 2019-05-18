package me.shkschneider.architekture

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import me.shkschneider.usecases.OrderUseCase
import me.shkschneider.usecases.ProductUseCase
import me.shkschneider.usecases.UserUseCase
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val orderUseCase by inject<OrderUseCase>()
    private val productUseCase by inject<ProductUseCase>()
    private val userUseCase by inject<UserUseCase>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val user = userUseCase.getUser("John Doe")
        Tracker.track(user)
        val product = productUseCase.getProduct("Coffee")
        Tracker.track(product)
        val order = orderUseCase.getOrder(user, product)
        Tracker.track(order)
    }

}
