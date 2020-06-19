package com.example.swag.Model.Services

import com.example.swag.Model.Category
import com.example.swag.Model.Product

object DataService {

    val categories = listOf(

        Category("Shirts","shirtimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Digital", "digitalgoodsimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage"),
        Category("Hoodies", "hoodieimage"),
        Category("Hats", "hatimage")

    )


    val hats = listOf(

        Product("Devslopes Graphic Beanie", "$18", "hat1"),
        Product("Devslopes Black", "$14", "hat2"),
        Product("Devslopes White", "$17", "hat3"),
        Product("Devslopes Snapback", "$12", "hat4")
    )

    val hoodies = listOf(

        Product("Devslopes Graphic hoodie", "$28", "hoodie1"),
        Product("Devslopes Black hoodie", "$24", "hoodie2"),
        Product("Devslopes White hoodie", "$27", "hoodie3"),
        Product("Devslopes Snapback hoodie", "$22", "hoodie4")
    )

    val shirts = listOf(

        Product("Devslopes Graphic Shirt", "$18", "shirt1"),
        Product("Devslopes Shirt", "$14", "shirt2"),
        Product("Devslopes Shirt", "$17", "shirt3"),
        Product("Devslopes Snapback Shirt", "$12", "shirt4")
    )


}