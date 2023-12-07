package com.example.latestnews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.latestnews.databinding.ActivityNewsCatagoryBinding

class NewsCatagory : AppCompatActivity() {
    private lateinit var binding:ActivityNewsCatagoryBinding
    private lateinit var arrayList: ArrayList<String>
    private lateinit var arrayAdapter: ArrayAdapter<String>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityNewsCatagoryBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_news_catagory)

        arrayList = arrayListOf()
        arrayList.add("Education")
        arrayList.add("Technalogy")
        arrayList.add("General")
        arrayList.add("Movies")
        arrayList.add("Business")
        arrayList.add("Game")

        arrayAdapter = ArrayAdapter(this,android.R.layout.simple_list_item_1,arrayList)
        binding.listview.adapter = arrayAdapter

        binding.listview.setOnItemClickListener { parent, view, id, long ->

            val intent = Intent(this,ViewNews)
            startActivity(intent)
            intent.putExtra(arrayList)


        }



    }
}

private fun Intent.putExtra(toString: ArrayList<String>) {

}

