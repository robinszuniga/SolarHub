package com.solarhub.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class DetalleProductoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detalle_producto)

        val btnCarrito = findViewById<Button>(R.id.btn_carrito)
        btnCarrito.setOnClickListener {
            val intent = Intent(this, CarritoActivity::class.java)
            startActivity(intent)
        }
    }
}