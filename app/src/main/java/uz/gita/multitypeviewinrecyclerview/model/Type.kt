package uz.gita.multitypeviewinrecyclerview.model

import uz.gita.multitypeviewinrecyclerview.adapter.TypeViewHolderFactory


interface Type {
    fun type(typeViewHolderFactory: TypeViewHolderFactory): Int
}