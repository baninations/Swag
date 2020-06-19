package com.example.swag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.GridLayout
import androidx.recyclerview.widget.GridLayoutManager
import com.example.swag.Adapters.ProductsAdapter
import com.example.swag.Model.Services.DataService
import com.example.swag.R
import com.example.swag.untilities.EXTRA_CATEGORY
import kotlinx.android.synthetic.main.activity_products.*

class ProductsActivity : AppCompatActivity() {

    lateinit var adapter: ProductsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        adapter = ProductsAdapter(this,DataService.getProducts(categoryType))

        val layoutManager = GridLayoutManager(this,2)
        productsListView.layoutManager = layoutManager
        productsListView.adapter = adapter

    }
}