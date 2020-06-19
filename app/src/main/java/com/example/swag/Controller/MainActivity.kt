package com.example.swag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.LinearLayout
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.swag.Adapters.CategoryAdapter
import com.example.swag.Adapters.CategoryRecycleAdapter
import com.example.swag.Model.Category
import com.example.swag.Model.Services.DataService
import com.example.swag.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    lateinit var adapter : CategoryRecycleAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        adapter = CategoryRecycleAdapter(this, DataService.categories)
        categoryListView.adapter = adapter
        val layoutManager = LinearLayoutManager(this)
        categoryListView.layoutManager = layoutManager
        //If we know it is static
        categoryListView.setHasFixedSize(true)



            /* This will not work for recyclerViews
            categoryListView.setOnItemClickListener { adapterView, view, i, l ->
            val category = DataService.categories[i]
            Toast.makeText(this,"You clicked on the ${category.title} cell", Toast.LENGTH_LONG).show()
*/

        }
    }
