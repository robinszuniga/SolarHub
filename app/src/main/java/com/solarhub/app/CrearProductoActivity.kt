package com.solarhub.app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CrearProductoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_producto)

        val btnPublicar = findViewById<Button>(R.id.btn_publicar)
        btnPublicar.setOnClickListener { finish() }
    }
}