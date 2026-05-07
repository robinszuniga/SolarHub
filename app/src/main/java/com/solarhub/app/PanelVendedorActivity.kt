package com.solarhub.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PanelVendedorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panel_vendedor)

        val btnAgregar = findViewById<Button>(R.id.btn_agregar)
        btnAgregar.setOnClickListener {
            val intent = Intent(this, CrearProductoActivity::class.java)
            startActivity(intent)
        }
    }
}