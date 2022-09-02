package com.EngSarahSalameh.Agecalcultor

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

          // To do action when button click
          btnYear.setOnClickListener({
              // To get the data entered by user from numBoxYear
              val yearOfBirth:Int = numBoxYear.text.toString().toInt() // Can't convert it to Int direclty, so have to convert it to string first
              //To get current year
              val currentYear:Int = Calendar.getInstance().get(Calendar.YEAR)
              val age = currentYear - yearOfBirth
              //To show age in textView "txtShowAge"
              txtShowAge.text = "Your Age Is :  $age"
          })



    }
}
