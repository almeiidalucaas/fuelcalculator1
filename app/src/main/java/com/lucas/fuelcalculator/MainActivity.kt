package com.lucas.fuelcalculator

import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.textfield.TextInputEditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val edtPrice = findViewById<TextInputEditText>(R.id.fuel_price)
        val edtConsume = findViewById<TextInputEditText>(R.id.car_consumption)
        val edtDistance = findViewById<TextInputEditText>(R.id.distance)
        val btnCalculate = findViewById<Button>(R.id.btn_calculate)

        btnCalculate.setOnClickListener {
            val price: Float = edtPrice.text.toString().toFloat()
            val consume: Float = edtConsume.text.toString().toFloat()
            val distance: Float = edtDistance.text.toString().toFloat()


            val division = distance/consume
            val total = division * price

            println("Lucas" + total )

            // Valor total de combustivel = (distance/consumption)*fuel price


        }

    }
}