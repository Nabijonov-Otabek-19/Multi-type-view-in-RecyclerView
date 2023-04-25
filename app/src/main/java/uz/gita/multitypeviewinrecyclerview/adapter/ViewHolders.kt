package uz.gita.multitypeviewinrecyclerview.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import uz.gita.multitypeviewinrecyclerview.databinding.ItemButtonBinding
import uz.gita.multitypeviewinrecyclerview.databinding.ItemPhotoBinding
import uz.gita.multitypeviewinrecyclerview.databinding.ItemTitleBinding
import uz.gita.multitypeviewinrecyclerview.model.ButtonItem
import uz.gita.multitypeviewinrecyclerview.model.PhotoItem
import uz.gita.multitypeviewinrecyclerview.model.TitleItem
import uz.gita.multitypeviewinrecyclerview.model.Type

abstract class BaseViewHolder<in Type>(rootView: View) : ViewHolder(rootView) {
    abstract fun bind(item: Type)
}

class PhotoViewHolder(private val itemPhotoBinding: ItemPhotoBinding) : BaseViewHolder<Type>(itemPhotoBinding.root) {
    override fun bind(item: Type) {
        itemPhotoBinding.imgAvatar.setImageResource((item as PhotoItem).avatar)
    }
}


class TitleViewHolder(private val titleBinding: ItemTitleBinding) : BaseViewHolder<Type>(titleBinding.root) {
    override fun bind(item: Type) {
        titleBinding.txtTitle.text = (item as TitleItem).title
    }
}

class ButtonViewHolder(private val itemButtonBinding: ItemButtonBinding) : BaseViewHolder<Type>(itemButtonBinding.root) {
    override fun bind(item: Type) {
        itemButtonBinding.btnNext.text = (item as ButtonItem).btnText
    }
}