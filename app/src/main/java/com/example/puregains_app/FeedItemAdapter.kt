package com.example.puregains_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FeedItemAdapter(val items : List<FeedItem>) : RecyclerView.Adapter<FeedItemAdapter.FeedItemHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FeedItemHolder {
        val item : View = LayoutInflater.from(parent.context).inflate(R.layout.feed_item, parent, false)
        return FeedItemHolder(item)
    }

    override fun onBindViewHolder(holder: FeedItemHolder, position: Int) {
        val currentItem = items[position]

        holder.image.setImageResource(currentItem.image)
        holder.name.text = currentItem.name
        holder.username.text = currentItem.username
        holder.message.text = currentItem.message
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class FeedItemHolder(item : View) : RecyclerView.ViewHolder(item) {
        val image : ImageView = item.findViewById(R.id.feed_item_avatar)
        val name : TextView = item.findViewById(R.id.feed_item_name)
        val username : TextView = item.findViewById(R.id.feed_item_username)
        val message : TextView = item.findViewById(R.id.feed_item_message)
    }

    companion object {
        fun generateFeed( name : String? ) : List<FeedItem> {
            val fullList = listOf<FeedItem>(
                FeedItem(R.drawable.avatar_android,"Steve","Steve12","Like the gains 24/7 my friends. You gotta do some stretches"),
                FeedItem(R.drawable.avatar_baby,"Bob","Bob7","MAXIMUM WEIGHT BOIS AND GALS, MAXIMUM WEIGHT"),
                FeedItem(R.drawable.avatar_man,"Sam","Sam19","GET those quads working and stretching and drop it down low"),
                FeedItem(R.drawable.avatar_baby,"Harry","Harry1","Did someone say SPIN class?"),
                FeedItem(R.drawable.avatar_man,"Ross","Ross1923","We all know a Ross is a chad. Just do what I do, and then you can get the MAD gainzz"),
                FeedItem(R.drawable.avatar_android,"Rowland","rowland.19","They see me rowlin', they hatin', patrollin' and tryna catch me ridin' dirty"),
                FeedItem(R.drawable.avatar_android,"Steve","Steve12","Like the gains 24/7 my friends. You gotta do some stretches"),
                FeedItem(R.drawable.avatar_baby,"Bob","Bob7","MAXIMUM WEIGHT BOIS AND GALS, MAXIMUM WEIGHT"),
                FeedItem(R.drawable.avatar_man,"Sam","Sam19","GET those quads working and stretching and drop it down low"),
                FeedItem(R.drawable.avatar_baby,"Harry","Harry1","Did someone say SPIN class?"),
                FeedItem(R.drawable.avatar_man,"Ross","Ross1923","We all know a Ross is a chad. Just do what I do, and then you can get the MAD gainzz"),
                FeedItem(R.drawable.avatar_android,"Rowland","rowland.19","They see me rowlin', they hatin', patrollin' and tryna catch me ridin' dirty"),
                FeedItem(R.drawable.avatar_android,"Steve","Steve12","Like the gains 24/7 my friends. You gotta do some stretches"),
                FeedItem(R.drawable.avatar_baby,"Bob","Bob7","MAXIMUM WEIGHT BOIS AND GALS, MAXIMUM WEIGHT"),
                FeedItem(R.drawable.avatar_man,"Sam","Sam19","GET those quads working and stretching and drop it down low"),
                FeedItem(R.drawable.avatar_baby,"Harry","Harry1","Did someone say SPIN class?"),
                FeedItem(R.drawable.avatar_man,"Ross","Ross1923","We all know a Ross is a chad. Just do what I do, and then you can get the MAD gainzz"),
                FeedItem(R.drawable.avatar_android,"Rowland","rowland.19","They see me rowlin', they hatin', patrollin' and tryna catch me ridin' dirty"),
                FeedItem(R.drawable.avatar_android,"Steve","Steve12","Like the gains 24/7 my friends. You gotta do some stretches"),
                FeedItem(R.drawable.avatar_baby,"Bob","Bob7","MAXIMUM WEIGHT BOIS AND GALS, MAXIMUM WEIGHT"),
                FeedItem(R.drawable.avatar_man,"Sam","Sam19","GET those quads working and stretching and drop it down low"),
                FeedItem(R.drawable.avatar_baby,"Harry","Harry1","Did someone say SPIN class?"),
                FeedItem(R.drawable.avatar_man,"Ross","Ross1923","We all know a Ross is a chad. Just do what I do, and then you can get the MAD gainzz"),
                FeedItem(R.drawable.avatar_android,"Rowland","rowland.19","They see me rowlin', they hatin', patrollin' and tryna catch me ridin' dirty")
            )

            //Basic temporary feed generation
            return if(name == null) fullList else fullList.filter { it.name == name }
        }
    }
}