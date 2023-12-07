package com.example.latestnews

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latestnews.databinding.ActivityViewNewsBinding
import com.google.firebase.database.DataSnapshot
import com.google.firebase.database.DatabaseError
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.ValueEventListener

class ViewNews : AppCompatActivity() {
    private lateinit var binding: ActivityViewNewsBinding
    private lateinit var db : DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityViewNewsBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_view_news)

        db = FirebaseDatabase.getInstance().reference.child("Latest News")



        val intents = getIntent()
        intents.getStringExtra(title)


        db.addValueEventListener(object :ValueEventListener{
            override fun onDataChange(snapshot: DataSnapshot) {

                if (snapshot:DataSnapshot){
                    val title = snapshot.child("title").value as String
                    val discription = snapshot.child("discription").value as String


                }
            }

            override fun onCancelled(error: DatabaseError) {
                TODO("Not yet implemented")
            }


        })



    }
}