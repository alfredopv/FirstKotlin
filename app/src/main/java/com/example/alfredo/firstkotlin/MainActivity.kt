package com.example.alfredo.firstkotlin

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : Activity() {

    var rvlue: Int = 0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun random(view : View){
        val r = Random()
        rvlue = r.nextInt(100)
        val text = findViewById<TextView>(R.id.textView);
        text.setText(rvlue.toString())
    }

    fun next(view : View){
        val intent = Intent(this, SegundaActivity::class.java)
        intent.putExtra("numero", rvlue)
        startActivity(intent)
    }
}
