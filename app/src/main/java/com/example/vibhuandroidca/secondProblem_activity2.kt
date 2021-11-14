package com.example.vibhuandroidca

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.TextView
import android.widget.Toast

class secondProblem_activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_problem2)
        val disp:TextView = findViewById(R.id.textView5)
        val chk1:CheckBox = findViewById(R.id.cb1)
        val chk2:CheckBox = findViewById(R.id.cb2)
        val chk3:CheckBox = findViewById(R.id.cb3)
        val chk4:CheckBox = findViewById(R.id.cb4)
        val f_btn:Button = findViewById(R.id.button5)
        val intent : Intent = getIntent()
        val name = intent.getStringExtra("Name")
        val dept = intent.getStringExtra("Department")
        if(name=="")
            disp.setText("NAME : Enter Name")
        else
            disp.setText("NAME : $name \nDepartment : $dept")


        chk1.setOnClickListener{
            if (chk1.isChecked){
                Toast.makeText(this,"${chk1.text.toString()} Selected & ${chk2.text.toString()} disabled", Toast.LENGTH_LONG).show()
                chk2.setEnabled(false)}
            else {
                Toast.makeText(this,"${chk1.text.toString()} Unselected ", Toast.LENGTH_LONG).show()
                chk2.setEnabled(true)}
        }
        chk2.setOnClickListener{
            if (chk2.isChecked){
                Toast.makeText(this,"${chk2.text.toString()} Selected & ${chk1.text.toString()} disabled", Toast.LENGTH_LONG).show()
                chk1.setEnabled(false)}
            else{
                Toast.makeText(this,"${chk2.text.toString()} Unselected ", Toast.LENGTH_LONG).show()
                chk1.setEnabled(true)}
        }
        chk3.setOnClickListener{
            if (chk3.isChecked)
                Toast.makeText(this,"${chk3.text.toString()} Selected", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this,"${chk3.text.toString()} Unselected ", Toast.LENGTH_LONG).show()
        }
        chk4.setOnClickListener{
            if (chk4.isChecked)
                Toast.makeText(this,"${chk4.text.toString()} Selected", Toast.LENGTH_LONG).show()
            else
                Toast.makeText(this,"${chk4.text.toString()} Unselected ", Toast.LENGTH_LONG).show()
        }

        f_btn.setOnClickListener {
            disp.setText("Thank You")
            chk1.setChecked(false)
            chk2.setChecked(false)
            chk3.setChecked(false)
            chk4.setChecked(false)
            Toast.makeText(this,"Registration Successful", Toast.LENGTH_LONG).show()
            val back = Intent(this, secondProblem_activity1::class.java)
            startActivity(back)
        }

    }
}