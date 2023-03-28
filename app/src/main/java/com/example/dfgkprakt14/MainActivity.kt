package com.example.dfgkprakt14

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.Gravity
import android.view.View
import android.widget.Button
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private lateinit var trueButton: Button
    private lateinit var falseButton: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trueButton = findViewById(R.id.true_button)
        falseButton = findViewById(R.id.false_button)


        trueButton.setOnClickListener{view: View ->
            Toast.makeText(this,R.string.correct_toast,Toast.LENGTH_SHORT).show()}

       falseButton.setOnClickListener{view: View ->
           val toast =   Toast.makeText(this,R.string.icorect_toast,Toast.LENGTH_SHORT)
           toast.setGravity(Gravity.TOP,0 , 5)
           toast.show()


       }



    }

    fun next(view: View)
    {
    val intent= Intent(this@MainActivity,MainActivity2::class.java)
        startActivity(intent)
        finish()
    }
}