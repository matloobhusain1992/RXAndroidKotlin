package com.zmq.rxandroidkotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.zmq.rxandroidkotlin.observable.OwnObservable

class MainActivity : AppCompatActivity() {

    private lateinit var count : Button
    private lateinit var display : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        inti()
        OwnObservable.create()
        println("hii")
        println("Hello")
    }

    private fun inti(){
        display = findViewById<TextView>(R.id.display) as TextView
        count = findViewById<Button>(R.id.counter) as Button
        count.setOnClickListener(object : View.OnClickListener{
            override fun onClick(v: View?) {

            }
        })
    }

    fun sum(a : Int,b : Int):Int{
        return a*b;
    }
}
