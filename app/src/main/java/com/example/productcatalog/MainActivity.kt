package com.example.productcatalog

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.compose.ui.Modifier
import com.example.productcatalog.UserInterface.ProductList
import com.example.productcatalog.viewmodel.ProductView
import com.example.productcatalog.ui.theme.ProductCatalogTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val viewModel: ProductView = viewModel()
            ProductCatalogTheme {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = { NavBar() }
                ) { innerPadding ->
                                                                                                                                                 ProductList(viewModel, Modifier.padding(innerPadding))
                }
            }
        }
    }
}
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun NavBar() {
    TopAppBar(title = { Text("Product Catalog") })
}


