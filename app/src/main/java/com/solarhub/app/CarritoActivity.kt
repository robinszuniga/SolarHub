package com.solarhub.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CarritoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_carrito)

        val btnHuella = findViewById<Button>(R.id.btn_huella)
        btnHuella.setOnClickListener {
            val intent = Intent(this, PasarelaPageosActivity::class.java)
            startActivity(intent)
        }

        val btnTarjeta = findViewById<Button>(R.id.btn_tarjeta)
        btnTarjeta.setOnClickListener {
            val intent = Intent(this, PasarelaPageosActivity::class.java)
            startActivity(intent)
        }
    }
}