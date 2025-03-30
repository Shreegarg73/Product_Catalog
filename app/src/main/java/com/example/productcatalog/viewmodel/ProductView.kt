package com.example.productcatalog.viewmodel

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import com.example.productcatalog.model.Product

class ProductView : ViewModel() {
    private val _products = MutableStateFlow(
        listOf(
            Product("Laptop", "High Performance laptops with best SSD", 120000.00, "https://sm.pcmag.com/t/pcmag_au/review/m/microsoft-/microsoft-surface-laptop-go-2_6ypz.1920.jpg"),
            Product("Tablets", "Best Quality Tablets with efficient working", 38999.90, "https://www.lifewire.com/thmb/hLdUzPj_aNGgf3T4QY5qFf-l5yI=/1318x878/filters:fill(auto,1)/ipad-pro-10.5-5a943d051d640400365137e6.jpg"),
            Product("Headphones", "Wireless noise cancellation headphones", 999.00, "https://pisces.bbystatic.com/image2/BestBuy_US/images/products/6383/6383126_sd.jpg"),
            Product("Smart Phones", "Best smartphones with EMI facility.", 37999.00, "https://contentstatic.techgig.com/photo/105032777/5-best-smartphones-under-rs-35000-in-india.jpg?44244"),
            Product("Gaming Console", "Next-gen best GPU's gaming console", 45000.00, "https://cdn.thewirecutter.com/wp-content/media/2020/10/playstation5-2048px-1011018.jpg?auto=webp&quality=75&width=480&dpr=2")
        )
    )
    val products: StateFlow<List<Product>> = _products
}
