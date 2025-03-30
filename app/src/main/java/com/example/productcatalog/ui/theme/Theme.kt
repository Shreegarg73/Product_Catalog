package com.example.productcatalog.ui.theme

import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun ProductCatalogTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = PrimaryColor,
            secondary = SecondaryColor
        ),
        typography = Typography,
        content = content
    )
}

@Preview(showBackground = true)
@Composable
fun PreviewTheme() {
    ProductCatalogTheme {
        Text("Hello, Theme!")
    }
}
