package com.example.myfirstrecyclerview.Model

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.myfirstrecyclerview.R
import kotlinx.android.synthetic.main.layout_news_list.view.*

class NewsListAdapter : RecyclerView.Adapter<RecyclerView.ViewHolder>()
{
    private var items : List<NewsList> = ArrayList()

    override fun getItemCount(): Int {
        return items.size
    }
    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when(holder) {
            is NewsListViewHolder -> {
                holder.Bind(items.get(position))
            }
        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return NewsListViewHolder(
            LayoutInflater.from(parent.context).inflate(R.layout.layout_news_list, parent, false)
        )
    }

    fun submitList(newsList: List<NewsList>){
        items = newsList
    }
}

class NewsListViewHolder constructor(itemView : View):RecyclerView.ViewHolder(itemView)
{
    val newsImage = itemView.newsImage
    val newsTitle = itemView.newsTitle

    fun Bind(newsList: NewsList)
    {
        newsTitle.setText(newsList.NewsTitle)

        val requestOption = RequestOptions()
            .placeholder(R.drawable.ic_launcher_background)
            .error(R.drawable.ic_launcher_background)

        Glide.with(itemView.context)
            .applyDefaultRequestOptions(requestOption)
            .load(newsList.NewsImage)
            .into(newsImage)

    }
}