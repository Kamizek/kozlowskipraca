package com.tutorialwing.kozlowskipraca

import android.R.attr.button
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.view.View;
import android.widget.Button;
import android.widget.ImageView
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // uproszczenie przyciskow
        val obraz1 = findViewById<ImageView>(R.id.imageView)
        val obraz2 = findViewById<ImageView>(R.id.imageView2)
        val obraz3 = findViewById<ImageView>(R.id.imageView3)
        val sliderx1 = findViewById<SeekBar>(R.id.seekBar)
        val slidery1 = findViewById<SeekBar>(R.id.seekBar2)
        val sliderx2 = findViewById<SeekBar>(R.id.seekBar3)
        val slidery2 = findViewById<SeekBar>(R.id.seekBar4)
        val sliderx3 = findViewById<SeekBar>(R.id.seekBar5)
        val slidery3 = findViewById<SeekBar>(R.id.seekBar6)
        val reset = findViewById<Button>(R.id.button)

        //ustawianie skali x i y
        //obraz 1
            obraz1.scaleX = sliderx1.progress.toFloat();
            obraz1.scaleY = slidery1.progress.toFloat();
        //obraz 2
            obraz2.scaleX = sliderx2.progress.toFloat();
            obraz2.scaleY = slidery2.progress.toFloat();
        //obraz 3
            obraz3.scaleX = sliderx3.progress.toFloat();
            obraz3.scaleY = slidery3.progress.toFloat();
        //reset button
        reset.setOnClickListener {
            obraz1.scaleX = 0F
            obraz1.scaleY = 0F
            obraz2.scaleX = 0F
            obraz2.scaleY = 0F
            obraz3.scaleX = 0F
            obraz3.scaleY = 0F
        }
        //reset button
    }
}