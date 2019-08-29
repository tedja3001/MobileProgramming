package com.github.sutedjathehoping.flipcoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import java.util.*


class MainActivity : AppCompatActivity() {
    lateinit var flip_Coin: ImageView
    lateinit var flip_Info: TextView
    lateinit var flip_Button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        flip_Coin = findViewById(R.id.iv_coin) as ImageView
        flip_Info = findViewById(R.id.headortail) as TextView
        flip_Button = findViewById(R.id.b_flip) as Button

        flip_Button.setOnClickListener {
            flip_Coin()
            Toast.makeText(this, "Ocin Flipped!", Toast.LENGTH_SHORT).show()
        }
    }
    private fun flip_Coin(){
        val randomInt= Random().nextInt(2) + 1
        if(randomInt==1){
            flip_Info.text="HEAD"
            flip_Coin.setImageResource(R.drawable.heads)
        }
        else{
            flip_Info.text="TAIL"
            flip_Coin.setImageResource(R.drawable.tails)
        }
    }
}