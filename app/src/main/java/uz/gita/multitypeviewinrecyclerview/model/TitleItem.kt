package uz.gita.multitypeviewinrecyclerview.model

import uz.gita.multitypeviewinrecyclerview.adapter.TypeViewHolderFactory


data class TitleItem(
    val title: String
) : Type {
    override fun type(typeViewHolderFactory: TypeViewHolderFactory): Int =
        typeViewHolderFactory.type(this)
}
