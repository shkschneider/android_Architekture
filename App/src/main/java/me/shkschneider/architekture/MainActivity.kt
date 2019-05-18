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

        val shopUser = shopViewModel.getUser("John Doe")
        Tracker.track(shopUser)
        val shopProduct = shopViewModel.getProduct("Coffee")
        Tracker.track(shopProduct)
        val shopOrder = shopViewModel.getOrder(shopUser, shopProduct)
        Tracker.track(shopOrder)
    }

}
