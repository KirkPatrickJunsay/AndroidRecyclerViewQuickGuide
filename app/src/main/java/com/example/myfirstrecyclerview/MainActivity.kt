package com.example.myfirstrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfirstrecyclerview.Model.DataSource
import com.example.myfirstrecyclerview.Model.NewsListAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var newsListAdapter: NewsListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerview_sample.apply {
            layoutManager = LinearLayoutManager(this@MainActivity)
            newsListAdapter = NewsListAdapter()
            adapter = newsListAdapter
        }

        val data = DataSource.CreateDataSource()
        newsListAdapter.submitList(data)
    }
}