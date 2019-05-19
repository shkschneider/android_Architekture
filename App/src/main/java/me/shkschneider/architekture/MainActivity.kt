package me.shkschneider.architekture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.shkschneider.entities.shop.ShopOrder
import me.shkschneider.shop.ShopViewModel
import org.koin.android.ext.android.inject

class MainActivity : AppCompatActivity() {

    private val shopViewModel by inject<ShopViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val order: ShopOrder = shopViewModel.order(userName = "John Doe", productName = "Coffee")
    }

}
