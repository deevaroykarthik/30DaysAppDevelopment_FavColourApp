package com.example.interactiveapp_2ndchallenge

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonSweet= findViewById<Button>(R.id.btnsweet);
        val buttonLove= findViewById<Button>(R.id.btnlove);
        val buttonAblaze=findViewById<Button>(R.id.btnablaze);
        val buttonBright=findViewById<Button>(R.id.btnbright);
        val buttonVivid= findViewById<Button>(R.id.btnvivid);
        val buttonPure=findViewById<Button>(R.id.btnpure);
        val layout=findViewById<LinearLayout>(R.id.linearLayout);

        buttonSweet.setOnClickListener{
            layout.setBackgroundResource(R.color.yellow)
            Toast.makeText(applicationContext,"Your today's color is Yellow...",Toast.LENGTH_SHORT).show()
        }
        buttonLove.setOnClickListener {
            layout.setBackgroundResource(R.color.pink)
            Toast.makeText(applicationContext,"Your today's color is Pink...",Toast.LENGTH_SHORT).show()
        }
        buttonAblaze.setOnClickListener {
            layout.setBackgroundResource(R.color.orange)
            Toast.makeText(applicationContext,"Your today's color is Orange...",Toast.LENGTH_SHORT).show()
        }
        buttonBright.setOnClickListener {
            layout.setBackgroundResource(R.color.cyan)
            Toast.makeText(applicationContext,"Your today's color is Cyan...",Toast.LENGTH_SHORT).show()
        }
        buttonPure.setOnClickListener {
            layout.setBackgroundResource(R.color.blue)
            Toast.makeText(applicationContext,"Your today's color is Blue...",Toast.LENGTH_SHORT).show()
        }
        buttonVivid.setOnClickListener {
            layout.setBackgroundResource(R.color.purple_200)
            Toast.makeText(applicationContext,"Your today's color is Purple...",Toast.LENGTH_SHORT).show()
        }

    }
}