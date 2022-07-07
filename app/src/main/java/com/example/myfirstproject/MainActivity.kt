package com.example.myfirstproject

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Toast
import androidx.core.widget.addTextChangedListener
import com.example.myfirstproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)




        onCheckBoxClick()

        binding.button.setOnClickListener {
            val check = binding.checkboxEsfahan.isChecked
            binding.checkboxEsfahan.isChecked = true
            if (check) {
                binding.checkboxEsfahan.isChecked = false
            }
        }

        binding.radioGroupMain.setOnCheckedChangeListener { group, checkedId ->

            when(checkedId)
            {
                R.id.radioButton->{
                    Toast.makeText(this, "tehran selected", Toast.LENGTH_SHORT).show()

                }
                R.id.radioButton2->{
                    Toast.makeText(this, "mashhad selected", Toast.LENGTH_SHORT).show()

                }
                R.id.radioButton3->{
                    Toast.makeText(this, "esfahan selected", Toast.LENGTH_SHORT).show()

                }
            }
        }

        onSwitchClick()

    }

    private fun onSwitchClick() {
        binding.switchBluetooth.setOnCheckedChangeListener { compoundButton, isChecked ->
            if(isChecked)
            {
                Toast.makeText(this, "bluetooth on", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "bluetooth off", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun onCheckBoxClick() {
        binding.checkboxTehran.setOnCheckedChangeListener { _, isChecked ->

            if (isChecked) {
                Toast.makeText(this, "tehran tik khord", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "tehran tik bardashte shod", Toast.LENGTH_SHORT).show()

            }

        }
    }

//        val city = listOf(
//            "tehran","isfahan","mashhad","karaj"
//        )
//
//        val myAdapter=ArrayAdapter(this,R.layout.item_text,city)
//        (binding.tilMain.editText as AutoCompleteTextView).setAdapter(myAdapter)
//


//        binding.tilMain.editText?.addTextChangedListener {
//
//            if (it!!.length>10)
//            {
//                binding.tilMain.error="ERROR"
//            }else{
//                binding.tilMain.error=null
//            }


}





