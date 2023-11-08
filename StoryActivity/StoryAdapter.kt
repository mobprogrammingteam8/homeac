package com.example.storyactivity

import android.net.Uri
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoryAdapter(val storyList: ArrayList<Story>) : RecyclerView.Adapter<StoryAdapter.CustomViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): StoryAdapter.CustomViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return CustomViewHolder(view).apply {
            itemView.setOnClickListener {
                val curPos : Int = adapterPosition
                val story: Story = storyList.get(curPos)
            }
        }
    }

    override fun getItemCount(): Int {
        return storyList.size
    }
    override fun onBindViewHolder(holder: StoryAdapter.CustomViewHolder, position: Int) {
        val feed_uri : Uri = Uri.parse(storyList.get(position).imageurl)
        holder.feed.setImageURI(feed_uri)
        holder.userimage.setImageResource(R.mipmap.ic_launcher)
        holder.date.text = storyList.get(position).date
        holder.content.text = storyList.get(position).text
    }

    class CustomViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val userimage = itemView.findViewById<ImageView>(R.id.iv_userimage)
        val feed = itemView.findViewById<ImageView>(R.id.iv_feed)
        val date = itemView.findViewById<TextView>(R.id.tv_date)
        val content = itemView.findViewById<TextView>(R.id.tv_text)
        val tag = itemView.findViewById<TextView>(R.id.tv_tag)
        // tag도 넣기
    }
}