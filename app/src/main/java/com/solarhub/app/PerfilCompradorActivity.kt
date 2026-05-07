package com.solarhub.app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PerfilCompradorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil_comprador)

        val btnEditar = findViewById<Button>(R.id.btn_editar)
        btnEditar.setOnClickListener { finish() }
    }
}