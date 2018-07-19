package com.example.well.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlin.math.log

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun clickCounting(v: View?) {
        println("click the counting button")
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
}
