package uz.gita.multitypeviewinrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import uz.gita.multitypeviewinrecyclerview.adapter.MainAdapter
import uz.gita.multitypeviewinrecyclerview.databinding.ActivityMainBinding
import uz.gita.multitypeviewinrecyclerview.model.ButtonItem
import uz.gita.multitypeviewinrecyclerview.model.PhotoItem
import uz.gita.multitypeviewinrecyclerview.model.TitleItem
import uz.gita.multitypeviewinrecyclerview.model.Type

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val adapter = MainAdapter()

        val photoData = arrayListOf(
            PhotoItem(R.drawable.pic1),
            PhotoItem(R.drawable.pic2),
            PhotoItem(R.drawable.pic3),
            PhotoItem(R.drawable.pic1),
            PhotoItem(R.drawable.pic2),
            PhotoItem(R.drawable.pic1),
            PhotoItem(R.drawable.pic2),
            PhotoItem(R.drawable.pic3),
            PhotoItem(R.drawable.pic1),
            PhotoItem(R.drawable.pic2),
            PhotoItem(R.drawable.pic1),
            PhotoItem(R.drawable.pic2),
            PhotoItem(R.drawable.pic3),
            PhotoItem(R.drawable.pic1),
            PhotoItem(R.drawable.pic2)
        )
        val titleData = arrayListOf(
            TitleItem("Dilmurod"),
            TitleItem("Sherali"),
            TitleItem("Shoxjahon"),
            TitleItem("Bekzod"),
            TitleItem("Sardor"),
            TitleItem("Dilmurod"),
            TitleItem("Sherali"),
            TitleItem("Shoxjahon"),
            TitleItem("Bekzod"),
            TitleItem("Sardor"),
            TitleItem("Dilmurod"),
            TitleItem("Sherali"),
            TitleItem("Shoxjahon"),
            TitleItem("Bekzod"),
            TitleItem("Sardor")
        )
        val buttonData = arrayListOf(
            ButtonItem("Samandar"),
            ButtonItem("Otabek"),
            ButtonItem("Xo'jaakbar"),
            ButtonItem("Muhammadali")
        )

        val data = arrayListOf<Type>().apply {
            addAll(photoData)
            addAll(titleData)
            addAll(buttonData)
        }

        data.shuffle()
        adapter.submitItems(data)
        binding.recycler.adapter = adapter
        binding.recycler.layoutManager = LinearLayoutManager(this)

    }
}