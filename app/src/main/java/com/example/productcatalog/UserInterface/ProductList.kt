package com.example.productcatalog.UserInterface

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.productcatalog.viewmodel.ProductView

@Composable
fun ProductList(viewModel: ProductView, modifier: Modifier = Modifier) {
    val products by viewModel.products.collectAsState()

    LazyColumn(modifier = modifier.fillMaxSize().padding(16.dp)) {
        items(products) { product ->
            ProductItem(product)
        }
    }
}
