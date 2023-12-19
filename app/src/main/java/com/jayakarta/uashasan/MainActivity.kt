package com.jayakarta.uashasan

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jayakarta.uashasan.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //memanggil view atau benda kedalam kotlin
        var buttonHitung = binding.buttonHitung
        var inputBerat = binding.inputBerat
        var inputJarak = binding.inputJarak
        var jumlahOngkir = binding.jmlongkir
        var jumlahTip = binding.jmlTip
        var jumlahTotal = binding.jmlTotal

        buttonHitung.setOnClickListener{
            var inputTip = binding.inputTip.isChecked
            var Rating = binding.inputRatingGroups.checkedRadioButtonId
            val nilaiRating = when (Rating){
                R.id.opsi1 -> 1.0
                R.id.opsi2 -> 2.0
                R.id.opsi3 -> 3.0
                else -> 4.0 //karena nilainya 40%

            }
            //hitung
            var berat = inputBerat.text.toString().toDouble()
            var jarak = inputJarak.text.toString().toDouble()
            var ongkir = ((0.5 * berat)+jarak)*5000
            var tip = 0.0
            if(inputTip){
                tip = nilaiRating * 0.02 * ongkir
            }
            var grandtotal = ongkir + tip
            jumlahOngkir.text=ongkir.toString()
            jumlahTip.text= tip.toString()
            jumlahTotal.text=grandtotal.toString()

        }
    }
}
