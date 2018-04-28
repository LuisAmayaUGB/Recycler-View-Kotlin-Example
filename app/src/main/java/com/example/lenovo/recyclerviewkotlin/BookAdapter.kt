package com.example.lenovo.recyclerviewkotlin

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast


class BookAdapter(val bookList: List<Book>) : RecyclerView.Adapter<BookAdapter.MyViewHolder>() {


    class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val authorName: TextView = view.findViewById(R.id.author_name)
        val bookName: TextView = view.findViewById(R.id.book_name)
        val imageView: ImageView = view.findViewById(R.id.img_book)

        fun bindItems(item: Book) {

            authorName.setText(item.authorName)
            bookName.setText(item.bookName)
            imageView.setImageResource(item.imageResource)

            //setting onclicklistener on each item
            itemView.setOnClickListener({

                Toast.makeText(itemView.context, item.bookName + " " + " book is Clicked", Toast.LENGTH_SHORT).show()
            })
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.book_list_row, parent, false)
        return MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        holder.bindItems(bookList.get(position));


    }

    override fun getItemCount(): Int {
        return bookList.size
    }


}

