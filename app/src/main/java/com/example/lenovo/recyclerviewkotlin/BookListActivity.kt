package com.example.lenovo.recyclerviewkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.DividerItemDecoration
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import java.util.ArrayList

class BookListActivity : AppCompatActivity() {

    private var recyclerView: RecyclerView? = null
    private val bookList = ArrayList<Book>()
    private val mAdapter: BookAdapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.booklist)
        val recyclerView: RecyclerView = findViewById(R.id.recycler_view)

        prepareBookData()


        //vertical RecyclerView
        recyclerView!!.layoutManager = LinearLayoutManager(applicationContext)

        //horizontal RecyclerView
        //recyclerView.setLayoutManager(new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL,false));

        //provides basic animations on remove, add, and move events that happen to the items in a RecyclerView.
        //RecyclerView uses a DefaultItemAnimator by default.
        recyclerView!!.itemAnimator = DefaultItemAnimator()

        // adding inbuilt divider line
        recyclerView!!.addItemDecoration(DividerItemDecoration(this, LinearLayoutManager.VERTICAL))

        val adapter = BookAdapter(bookList)

        //now adding the adapter to recyclerview
        recyclerView!!.adapter = adapter

    }

    //preparing bookList data
    private fun prepareBookData() {
        var book = Book("Munshi Premchand", "Nirmala", R.drawable.nirmala)
        bookList.add(book)
        book = Book("Harivansh Rai Bachchan", "Madhushala", R.drawable.madhushala2)
        bookList.add(book)
        book = Book("Ramdhari Singh Dinkar", "Rashmirathi", R.drawable.rashmirathi)
        bookList.add(book)
        book = Book("Dharamvir Bharti", "Gunahon Ka Devta", R.drawable.gunahokedevta2)
        bookList.add(book)
        book = Book("Munshi Premchand", "Shatranj Ke Khiladi", R.drawable.shatranj2)
        bookList.add(book)
        book = Book("Bhisham Sahni", "Tamas", R.drawable.tamas)
        bookList.add(book)
        book = Book("Dharamvir Bharti", "Suraj Ka Satva Ghoda", R.drawable.suraj)
        bookList.add(book)
        book = Book("Munshi Premchand", "Karmabhumi", R.drawable.karmabhumi)
        bookList.add(book)
        book = Book("Kashinath Singh", "Kassi Ka Assi", R.drawable.kashi_ka_assi)
        bookList.add(book)
        book = Book("Bhagwati Charan Verma", "Chitralekha", R.drawable.chitralekha)
        bookList.add(book)

    }

}

