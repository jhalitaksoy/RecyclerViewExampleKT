package hlt.recyclerviewexamplekt

import android.support.v7.widget.CardView
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.squareup.picasso.Picasso

class MyAdapter(val items : ArrayList<Item>) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false) as View
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.textView?.setText(item.name)
        Picasso.get().load(item.id).into(holder.imageView)
    }

    class ViewHolder(itemView: View?) : RecyclerView.ViewHolder(itemView) {
        val textView = itemView?.findViewById<TextView>(R.id.textView)
        val cardView = itemView?.findViewById<CardView>(R.id.cardView)
        val imageView = itemView?.findViewById<ImageView>(R.id.imageView)
    }

    data class Item(val name : String, val id:Int)
}

