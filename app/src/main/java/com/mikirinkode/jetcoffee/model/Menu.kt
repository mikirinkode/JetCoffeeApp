package com.mikirinkode.jetcoffee.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.mikirinkode.jetcoffee.R

data class Menu(
    @DrawableRes val image: Int,
    val title: String,
    val price: Double
)

val dummyMenu = listOf(
    R.drawable.menu1 to "Tiramisu Coffee Milk" to 28000.0,
    R.drawable.menu2 to "Pumpkin Spice Latte" to 18000.0,
    R.drawable.menu3 to "Choco Creamy Latte" to 18000.0,
    R.drawable.menu4 to "Light Cappuccino" to 18000.0,
).map { Menu(it.first.first, it.first.second, it.second) }

val dummyFavoriteMenu = listOf(
    R.drawable.menu2 to "Pumpkin Spice Latte" to 18000.0,
    R.drawable.menu1 to "Tiramisu Coffee Milk" to 28000.0,
    R.drawable.menu4 to "Light Cappuccino" to 18000.0,
    R.drawable.menu3 to "Choco Creamy Latte" to 18000.0,
).map { Menu(it.first.first, it.first.second, it.second) }
