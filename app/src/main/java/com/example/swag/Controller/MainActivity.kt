package com.example.swag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Toast
import com.example.swag.Adapters.CategoryAdapter
import com.example.swag.Model.Category
import com.example.swag.Model.Services.DataService
import com.example.swag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryAdapter(this, DataService.categories)
        categoryListView.adapter = adapter

            /* This will not work for recyclerViews
            categoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this,"You clicked on the ${category.title} cell", Toast.LENGTH_LONG).show()
*/

        }
    }
}