package com.example.dice_roller

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dice_roller.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {


    private lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.zarButton.setOnClickListener {

            ZarAt()

        }

    }

    fun ZarAt(){

        val z1=(1..6).random()
        val z2=(1..6).random()

        when(z1){

            1->binding.dice1.setImageResource(R.drawable.d1)
            2->binding.dice1.setImageResource(R.drawable.d2)
            3->binding.dice1.setImageResource(R.drawable.d3)
            4->binding.dice1.setImageResource(R.drawable.d4)
            5->binding.dice1.setImageResource(R.drawable.d5)
            6->binding.dice1.setImageResource(R.drawable.d6)
        }

        when(z1){

            1->binding.z1text.text="1"
            2->binding.z1text.text="2"
            3->binding.z1text.text="3"
            4->binding.z1text.text="4"
            5->binding.z1text.text="5"
            6->binding.z1text.text="6"
        }

        when(z2){

           1->binding.dice2.setImageResource(R.drawable.d1)
           2->binding.dice2.setImageResource(R.drawable.d2)
           3->binding.dice2.setImageResource(R.drawable.d3)
           4->binding.dice2.setImageResource(R.drawable.d4)
           5->binding.dice2.setImageResource(R.drawable.d5)
           6->binding.dice2.setImageResource(R.drawable.d6)
        }
        when(z2){

            1->binding.z2text.text="1"
            2->binding.z2text.text="2"
            3->binding.z2text.text="3"
            4->binding.z2text.text="4"
            5->binding.z2text.text="5"
            6->binding.z2text.text="6"

        }







    }

}