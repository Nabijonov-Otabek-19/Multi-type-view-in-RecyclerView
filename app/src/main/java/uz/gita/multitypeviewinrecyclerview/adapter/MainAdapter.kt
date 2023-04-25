package uz.gita.multitypeviewinrecyclerview.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView.Adapter
import uz.gita.multitypeviewinrecyclerview.model.Type

class MainAdapter : Adapter<BaseViewHolder<Type>>() {
    private val data: ArrayList<Type> = arrayListOf()

    private val typeViewHolderFactory = TypeViewHolderFactoryImpl()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseViewHolder<Type> {
        return typeViewHolderFactory.create(
            LayoutInflater.from(parent.context).inflate(viewType, parent, false), viewType
        )
    }

    fun submitItems(items: List<Type>) {
        data.clear()
        data.addAll(items)
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: BaseViewHolder<Type>, position: Int) {
        holder.bind(data[position])
    }

    override fun getItemViewType(position: Int): Int = typeViewHolderFactory.type(data[position])
}