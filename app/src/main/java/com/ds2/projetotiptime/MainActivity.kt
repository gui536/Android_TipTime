package com.ds2.projetotiptime

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.ds2.projetotiptime.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_main)
        binding.calculateButton.setOnClickListener{CalculateTip()}
    }

    fun CalculateTip(){
        val stringInEdit = binding.costOfService.toString()
        val cost = stringInEdit.toDouble()

    }
}