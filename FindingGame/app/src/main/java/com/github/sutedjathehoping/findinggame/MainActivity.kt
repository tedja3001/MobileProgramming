package com.github.sutedjathehoping.findinggame

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.github.sutedjathehoping.findinggame.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var selectedView: View
    private var selectedId = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val boxesId: List<Int> = listOf(
            binding.textBox1.id,
            binding.textBox3.id,
            binding.textBox4.id,
            binding.textBox5.id,
            binding.textBox6.id
        )
        selectedId = boxesId[Random.nextInt(0, 5)]
        Log.d("ActivityMain :: ", "SelectedID: ${selectedId}; From: ${boxesId}")
        setListeners()
    }

    private fun setBehavior(view: View) {
        if(view.id == selectedId) {
            setButtonBackground(view, android.R.drawable. btn_star_big_on)
            selectedView = view
            winHandler()
        } else setButtonBackground(view, android.R.drawable.btn_star_big_off)
    }

    private fun setButtonBackground(view: View, buttonIcon: Int) {
        view.setBackgroundResource(buttonIcon)
    }

    private fun winHandler() {
        Toast.makeText(this, "Tap the shining star to restart the game !.", Toast.LENGTH_LONG).show()
        selectedView.setOnClickListener {
            resetAll()
        }
    }

    private fun resetAll() {
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        val boxesId: List<Int> = listOf(
            binding.textBox1.id,
            binding.textBox3.id,
            binding.textBox4.id,
            binding.textBox5.id,
            binding.textBox6.id
        )
        selectedId = boxesId[Random.nextInt(0, 5)]
        Log.d("ActivityMain :: ", "SelectedID: ${selectedId}; From: ${boxesId}")

        binding.apply {
            val boxOneText = textBox1
            val boxTwoText = textBox2
            val boxThreeText = textBox3
            val boxFourText = textBox4
            val boxFiveText = textBox5
            val boxSixText = textBox6

            val clickableViews: List<View> =
                listOf(boxOneText, boxTwoText, boxThreeText,
                    boxFourText, boxFiveText, boxSixText)

            for (item in clickableViews) {
                item.setOnClickListener {
                    setBehavior(it)
                }
                item.setBackgroundColor(Color.WHITE)
            }
        }
    }

    private fun setListeners() {
        binding.apply {
            val boxOneText = textBox1
            val boxTwoText = textBox2
            val boxThreeText = textBox3
            val boxFourText = textBox4
            val boxFiveText = textBox5
            val boxSixText = textBox6

            val clickableViews: List<View> =
                listOf(boxOneText, boxTwoText, boxThreeText,
                    boxFourText, boxFiveText,boxSixText)

            for (item in clickableViews) {
                item.setOnClickListener {
                    setBehavior(it)
                }
            }
        }
    }
}