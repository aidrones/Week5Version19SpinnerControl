package com.usingspinnercontrol.week5version19spinnercontrol

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    //Spinner Control
        val edit1 = findViewById<EditText>(R.id.edit1)
        val edit2 = findViewById<EditText>(R.id.edit2)

    }
}
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget. *

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
// coding180.com
        val et1 = findViewById(R.id.et1) as EditText
        val et2 = findViewById(R.id.et2) as EditText
        val sp1 = findViewById(R.id.spinner) as Spinner
        val tv1 = findViewById(R.id.tv1) as TextView
        val list = arrayOf("sum", "subtract", "multiply", "divide")
        val adaptador1 = ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, lista)
        sp1.adapter = adaptador1
        val boton1 = findViewById(R.id.button) as Button
        boton1.setOnClickListener {
            when (sp1.selectedItem.toString()) {
                "sum" -> tv1.text = "Result: ${et1.text.toString().toInt() + et2.text.toString().toInt()}"
                "subtract" -> tv1.text = "Result: ${et1.text.toString().toInt() - et2.text.toString().toInt()}"
                "multiply" -> tv1.text = "Result: ${et1.text.toString().toInt() * et2.text.toString().toInt()}"
                "divide" -> tv1.text = "Result: ${et1.text.toString().toInt() / et2.text.toString().toInt()}"
            }
        }
    }
}