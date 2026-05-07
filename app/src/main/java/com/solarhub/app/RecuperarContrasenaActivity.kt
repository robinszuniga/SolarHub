package com.solarhub.app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class RecuperarContrasenaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recuperar_contrasena)

        // Botón volver al login
        val txtVolver = findViewById<android.widget.TextView>(R.id.txt_volver)
        txtVolver.setOnClickListener {
            finish()
        }
    }
}