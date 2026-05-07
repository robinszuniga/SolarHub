package com.solarhub.app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PerfilVendedorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_vendedor)

        val btnEditar = findViewById<Button>(R.id.btn_editar)
        btnEditar.setOnClickListener { finish() }
    }
}