package com.example.passingdataintents

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnNext.setOnClickListener {
            val name=etName.text.toString()
            val person=Person(name)
            Intent(this,MainActivity2::class.java).also {
                //it.putExtra("EXTRA_NAME",name)
                it.putExtra("person",person)
                startActivity(it)
            }
        }
    }
}