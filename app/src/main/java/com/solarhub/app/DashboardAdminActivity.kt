package com.solarhub.app

import android.content.Intent
import android.os.Bundle
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class DashboardAdminActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard_admin)

        // Botón gestión de usuarios
        val btnUsuarios = findViewById<LinearLayout>(R.id.btn_usuarios)
        btnUsuarios.setOnClickListener {
            val intent = Intent(this, GestionUsuariosActivity::class.java)
            startActivity(intent)
        }

        // Botón gestión de productos
        val btnProductos = findViewById<LinearLayout>(R.id.btn_productos)
        btnProductos.setOnClickListener {
            val intent = Intent(this, GestionProductosActivity::class.java)
            startActivity(intent)
        }

        // Botón reportes
        val btnReportes = findViewById<LinearLayout>(R.id.btn_reportes)
        btnReportes.setOnClickListener {
            val intent = Intent(this, ReportesActivity::class.java)
            startActivity(intent)
        }
    }
}