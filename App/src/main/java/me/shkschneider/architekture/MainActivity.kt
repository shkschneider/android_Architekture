package me.shkschneider.architekture

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import me.shkschneider.shop.ShopViewModel
import org.koin.androidx.viewmodel.ext.android.viewModel

class MainActivity : AppCompatActivity() {

    private val shopViewModel by viewModel<ShopViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val order = shopViewModel.order(userName = "John Doe", productName = "Coffee")
        Tracker.track(order)
    }

}
