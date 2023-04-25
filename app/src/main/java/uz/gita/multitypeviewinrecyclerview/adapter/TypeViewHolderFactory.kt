package uz.gita.multitypeviewinrecyclerview.adapter

import android.view.View
import uz.gita.multitypeviewinrecyclerview.model.Type

interface TypeViewHolderFactory {
    fun type(item: Type): Int
    fun create(parent: View, viewType: Int): BaseViewHolder<Type>
}