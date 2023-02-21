package com.example.viewmodelproject.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.bumptech.glide.Glide
import com.example.viewmodelproject.Customer
import com.example.viewmodelproject.R
import com.example.viewmodelproject.databinding.ItemCustomerBinding

class CustomerViewHolder(private val view: View): ViewHolder(view) {
    val binding = ItemCustomerBinding.bind(view);

    val customerName = binding.customerName
    val customerPhone = binding.customerPhone
    val customerRol = binding.customerRol
    val customerImage = binding.customerImage


    fun render(customerModel: Customer) {
        customerImage.setImageResource(R.drawable.ic_launcher_background)

        customerName.text = "${customerModel.name} - ${customerModel.accountNumber}";
        customerPhone.text = "Phone number: ${customerModel.phoneNumber}";
        customerRol.text = "Rol: ${customerModel.rol}"

        Glide
            .with(binding.root)
            .load(customerModel.photo)
            .centerCrop()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)
            .into(customerImage);
    }
}