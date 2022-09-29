package com.example.counter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import com.example.counter.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private lateinit var vm :CounterViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        onClick()
       vm =  ViewModelProvider(this)[CounterViewModel::class.java]
        vm.result.observe(this){
            binding.counterTv.text = it.toString()
        }
    }

    private fun onClick() {

        binding.incrementBtn.setOnClickListener{
            vm.increment()

        }
        binding.decrementBtn.setOnClickListener{

            vm.decrement()

        }
    }
}