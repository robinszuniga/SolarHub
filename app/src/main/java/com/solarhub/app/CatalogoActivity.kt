package com.solarhub.app

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class CatalogoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_catalogo)

        // Conectar el BottomNavigationView y marcar "Catálogo" como activo
        val bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.selectedItemId = R.id.nav_catalogo

        // Cuando el usuario toca una opción del menú inferior
        bottomNav.setOnItemSelectedListener { item ->
            when (item.itemId) {
                R.id.nav_inicio -> {
                    startActivity(Intent(this, InicioCompradorActivity::class.java))
                    true
                }
                R.id.nav_catalogo -> {
                    // Ya estamos en catálogo, no hacemos nada
                    true
                }
                R.id.nav_carrito -> {
                    startActivity(Intent(this, CarritoActivity::class.java))
                    true
                }
                R.id.nav_pedidos -> {
                    startActivity(Intent(this, HistorialPedidosActivity::class.java))
                    true
                }
                R.id.nav_perfil -> {
                    startActivity(Intent(this, PerfilCompradorActivity::class.java))
                    true
                }
                else -> false
            }
        }
    }
}