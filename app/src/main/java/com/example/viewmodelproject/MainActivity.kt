package com.example.viewmodelproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.viewmodelproject.adapter.CustomerAdapter
import com.example.viewmodelproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater);
        setContentView(binding.root);
        initRecyclerView()
    }

    private fun initRecyclerView() {
        val recyclerView = binding.customerList;
        recyclerView.layoutManager = LinearLayoutManager(this);
        recyclerView.adapter = CustomerAdapter(CustomerProvider.customers)
    }
}