package uz.gita.multitypeviewinrecyclerview.adapter

import android.view.View
import uz.gita.multitypeviewinrecyclerview.R
import uz.gita.multitypeviewinrecyclerview.databinding.ItemButtonBinding
import uz.gita.multitypeviewinrecyclerview.databinding.ItemPhotoBinding
import uz.gita.multitypeviewinrecyclerview.databinding.ItemTitleBinding
import uz.gita.multitypeviewinrecyclerview.model.PhotoItem
import uz.gita.multitypeviewinrecyclerview.model.TitleItem
import uz.gita.multitypeviewinrecyclerview.model.Type

class TypeViewHolderFactoryImpl : TypeViewHolderFactory {
    override fun type(item: Type): Int {
        return when (item) {
            is PhotoItem -> R.layout.item_photo
            is TitleItem -> R.layout.item_title
            else -> R.layout.item_button
        }
    }

    override fun create(parent: View, viewType: Int): BaseViewHolder<Type> {
        return when (viewType) {
            R.layout.item_photo -> PhotoViewHolder(ItemPhotoBinding.bind(parent))
            R.layout.item_title -> TitleViewHolder(ItemTitleBinding.bind(parent))
            else -> ButtonViewHolder(ItemButtonBinding.bind(parent))
        }
    }
}