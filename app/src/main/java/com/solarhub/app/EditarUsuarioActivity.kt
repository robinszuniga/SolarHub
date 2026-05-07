package com.solarhub.app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class EditarUsuarioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editar_usuario)

        val btnGuardar = findViewById<Button>(R.id.btn_guardar)
        btnGuardar.setOnClickListener { finish() }

        val btnEliminar = findViewById<Button>(R.id.btn_eliminar)
        btnEliminar.setOnClickListener { finish() }
    }
}