package uz.gita.multitypeviewinrecyclerview.model

import uz.gita.multitypeviewinrecyclerview.adapter.TypeViewHolderFactory

data class PhotoItem(
    val avatar: Int
) : Type {
    override fun type(typeViewHolderFactory: TypeViewHolderFactory): Int =
        typeViewHolderFactory.type(this)
}
