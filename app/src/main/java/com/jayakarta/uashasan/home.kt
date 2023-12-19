package com.jayakarta.uashasan

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import com.jayakarta.uashasan.databinding.ActivityHomeBinding

class home : AppCompatActivity(), View.OnClickListener {
    lateinit var binding : ActivityHomeBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val move : Button = findViewById(R.id.next)
        move.setOnClickListener(this)

        val move2 : Button = findViewById(R.id.next2)
        move2.setOnClickListener(this)
    }



    override fun onClick(v: View?) {
        if (v !=null)
            when(v.id){
                R.id.next -> {
                    val onepage = Intent(this,MainActivity::class.java)
                    startActivity(onepage)
                }
                R.id.next2 -> {
                    val twopage = Intent(this, ListMovies::class.java)
                    startActivity(twopage)
                }
            }
    }

}