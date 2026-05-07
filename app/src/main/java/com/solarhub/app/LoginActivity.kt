package com.solarhub.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        // Botón ingresar → Inicio Comprador
        val btnIngresar = findViewById<Button>(R.id.btn_ingresar)
        btnIngresar.setOnClickListener {
            val intent = Intent(this, InicioCompradorActivity::class.java)
            startActivity(intent)
        }

        // Botón recuperar contraseña
        val txtOlvide = findViewById<android.widget.TextView>(R.id.txt_olvide)
        txtOlvide.setOnClickListener {
            val intent = Intent(this, RecuperarContrasenaActivity::class.java)
            startActivity(intent)
        }
    }
}