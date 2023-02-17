package com.arash.altafi.staggeredgridlayout

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.arash.altafi.staggeredgridlayout.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var myAdapter: Adapter
    private var list: ArrayList<Int> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        init()
    }

    private fun init() = binding.apply {
        list.add(R.drawable.adi)
        list.add(R.drawable.avatar)
        list.add(R.drawable.black)
        list.add(R.drawable.brahma)
        list.add(R.drawable.gray)
        list.add(R.drawable.groot)
        list.add(R.drawable.infinite)
        list.add(R.drawable.liger)
        list.add(R.drawable.pathan)
        myAdapter = Adapter(list)

        recyclerView.apply {
            setHasFixedSize(true)
            adapter = myAdapter
            layoutManager =
                StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)
        }
    }

}