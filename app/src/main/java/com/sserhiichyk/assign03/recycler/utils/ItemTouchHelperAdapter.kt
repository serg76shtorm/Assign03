package com.sserhiichyk.assign03.recycler.utils

interface ItemTouchHelperAdapter {

    fun onItemClick(position: Int)
    fun onItemButtonClick(position: Int)
    fun onLongItemClick()
    fun onItemDismiss(positionAdapter: Int)

}