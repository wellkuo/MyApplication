package com.example.well.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var totalCount : Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun click(v: View?) {
        when (v?.id) {
            R.id.btn_click ->
                Toast.makeText(this, "追加", Toast.LENGTH_SHORT).show()
        }
        val tmpNum : String = inp_num.text.toString()
        totalCount += tmpNum.toInt()
        txt_hello.text = totalCount.toString()
    }

    fun nextClick(v: View?) {
        println("the next")
        val intent = Intent(this,DataActivity::class.java)
        startActivity(intent)
    }

}
