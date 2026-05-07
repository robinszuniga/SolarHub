package com.solarhub.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class GestionUsuariosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestion_usuarios)

        // Botón crear usuario
        val btnCrear = findViewById<Button>(R.id.btn_crear)
        btnCrear.setOnClickListener {
            val intent = Intent(this, CrearUsuarioActivity::class.java)
            startActivity(intent)
        }
    }
}