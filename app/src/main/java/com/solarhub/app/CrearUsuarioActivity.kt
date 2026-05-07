package com.solarhub.app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CrearUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_usuario)

        val btnGuardar = findViewById<Button>(R.id.btn_guardar)
        btnGuardar.setOnClickListener {
            finish()
        }

        val btnCancelar = findViewById<Button>(R.id.btn_cancelar)
        btnCancelar.setOnClickListener {
            finish()
        }
    }
}