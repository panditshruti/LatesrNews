package com.example.latestnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.latestnews.databinding.ActivityMainBinding
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    private lateinit var db:DatabaseReference

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        db = FirebaseDatabase.getInstance().reference.child("Latest News")

        binding.addbtn.setOnClickListener {

            checkBox()
            var title = binding.edTitle.text.toString()
            var discription = binding.edDiscription.text.toString()
            db.push().setValue(newsitem(title,discription))
        }
    }
    var checkBox = ""
    fun checkBox(){
        if (binding.checkBoxEducation.isChecked){
            checkBox = "Education"
        }
        if (binding.checkBoxBusiness.isChecked){
            checkBox = "Business"
        }
        if (binding.checkBoxGame.isChecked){
            checkBox = "Game"
        }
        if (binding.checkBoxGeneral.isChecked){
            checkBox = "General"
        }
        if (binding.checkBoxTechnalogy.isChecked){
            checkBox = "Technalogy"
        }
        if (binding.checkBoxMovies.isChecked){
            checkBox = "Movies"
        }

    }



}




