package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val roll : Button = findViewById(R.id.roll)
        val dice_image : ImageView = findViewById(R.id.dice)

//        var dice_id : Int = R.drawable.empty_dice

        roll.setOnClickListener {
            dice_image.setImageResource(when (generate_random_num()){
                1 -> R.drawable.dice_1
                2 -> R.drawable.dice_2
                3 -> R.drawable.dice_3
                4 -> R.drawable.dice_4
                5 -> R.drawable.dice_5
                6 -> R.drawable.dice_6
                else -> R.drawable.empty_dice })
//            dice_image.setImageResource(dice_id)
        }
    }

    fun generate_random_num() : Int{
        return (1..6).random()
    }
}