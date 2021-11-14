package com.example.vibhuandroidca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*


class secondProblem_activity1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_problem1)
        var radioGroup: RadioGroup = findViewById(R.id.rb)
        val radio_btn1: RadioButton = findViewById(R.id.rb1)
        val radio_btn2: RadioButton = findViewById(R.id.rb2)
        val radio_btn3: RadioButton = findViewById(R.id.rb3)
        val name:EditText = findViewById(R.id.editTextTextPersonName)

        radio_btn1.setOnClickListener{
            var from_btn: String = radio_btn1.text.toString()
            var txt = from_btn + " is selected PRESS NEXT"
            Toast.makeText(this, txt,Toast.LENGTH_LONG).show()
        }
        radio_btn2.setOnClickListener{
            var from_btn: String = radio_btn2.text.toString()
            var txt = from_btn + " is selected PRESS NEXT"
            Toast.makeText(this,txt,Toast.LENGTH_LONG).show()
        }
        radio_btn3.setOnClickListener{
            var from_btn: String = radio_btn3.text.toString()
            var txt = from_btn + " is selected PRESS NEXT"
            Toast.makeText(this,txt,Toast.LENGTH_LONG).show()
        }
        var from_btn = ""




    val bt:Button = findViewById(R.id.button4)
        bt.setOnClickListener {
            if (radio_btn1.isChecked())
                from_btn = radio_btn1.text.toString()
            else if (radio_btn2.isChecked())
                from_btn = radio_btn2.text.toString()
            else if (radio_btn3.isChecked())
                from_btn = radio_btn3.text.toString()
            val intent = Intent(this, secondProblem_activity2::class.java)
            intent.putExtra("Name",name.text.toString())
            intent.putExtra("Department",from_btn)
            startActivity(intent)
        }

    }
}