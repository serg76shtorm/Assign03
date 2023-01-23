package com.sserhiichyk.assign03.recycler.utils

import androidx.recyclerview.widget.DiffUtil
import com.sserhiichyk.assign03.data.DataUser

class DiffCallback : DiffUtil.ItemCallback<DataUser>() {
    override fun areItemsTheSame(oldItem: DataUser, newItem: DataUser): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: DataUser, newItem: DataUser): Boolean {
        return when {
            oldItem.id != newItem.id -> false
            oldItem.inContacts != newItem.inContacts -> false
            else -> true
        }
    }

}