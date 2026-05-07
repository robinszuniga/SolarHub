package com.solarhub.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class InicioCompradorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_comprador)

        // El botón "Ver productos" del banner lleva al catálogo
        val btnVerProductos = findViewById<Button>(R.id.btn_ver_productos)
        btnVerProductos.setOnClickListener {
            startActivity(Intent(this, CatalogoActivity::class.java))
        }
    }
}