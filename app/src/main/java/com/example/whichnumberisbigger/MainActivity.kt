package com.example.whichnumberisbigger

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    // if you need instance variables, you can make them here
    private var score = 0
    private var leftNumber = 0
    private var rightNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // do your initial setup here in the onCreate
        // generate two random numbers
        // assign those numbers to the buttons
        // set the  initial score to 0
        newNumbers()
    }

    fun checkValue(view: View)
    {
        if (button_main_left.isPressed && leftNumber > rightNumber ||
            button_main_right.isPressed && rightNumber > leftNumber)
        {
            Toast.makeText(this, "Correct!", Toast.LENGTH_SHORT).show()
            score++
        }
        else
        {
            score = 0
            Toast.makeText(this, "Wrong bruh", Toast.LENGTH_SHORT).show()
        }
        textView_main_score.text = score.toString()
        newNumbers()
    }

    private fun newNumbers() {
        leftNumber = (Math.random() * 100 + 1).toInt()
        button_main_left.text = leftNumber.toString()

        rightNumber = (Math.random() * 100 + 1).toInt()
        button_main_right.text = rightNumber.toString()
    }
}

