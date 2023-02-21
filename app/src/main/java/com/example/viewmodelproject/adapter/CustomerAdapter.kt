package com.example.viewmodelproject.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.viewmodelproject.Customer
import com.example.viewmodelproject.R

class CustomerAdapter(private val customerList: List<Customer>): RecyclerView.Adapter<CustomerViewHolder>() {
    // return at view holder the layout to modified
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomerViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context);
        return CustomerViewHolder(layoutInflater.inflate(R.layout.item_customer, parent, false));
    }

    // Total items to show
    override fun getItemCount(): Int = customerList.size

    override fun onBindViewHolder(holder: CustomerViewHolder, position: Int) {
        var item = customerList[position]
        holder.render(item)
    }
}