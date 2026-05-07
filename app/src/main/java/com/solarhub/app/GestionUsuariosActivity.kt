package com.solarhub.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class GestionUsuariosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gestion_usuarios)

        // Botón crear usuario nuevo
        val btnCrear = findViewById<Button>(R.id.btn_crear)
        btnCrear.setOnClickListener {
            startActivity(Intent(this, CrearUsuarioActivity::class.java))
        }

        // Botones editar de cada usuario → van a la pantalla de editar
        val btnEditar1 = findViewById<Button>(R.id.btn_editar_usuario1)
        btnEditar1.setOnClickListener {
            startActivity(Intent(this, EditarUsuarioActivity::class.java))
        }

        val btnEditar2 = findViewById<Button>(R.id.btn_editar_usuario2)
        btnEditar2.setOnClickListener {
            startActivity(Intent(this, EditarUsuarioActivity::class.java))
        }

        val btnEditar3 = findViewById<Button>(R.id.btn_editar_usuario3)
        btnEditar3.setOnClickListener {
            startActivity(Intent(this, EditarUsuarioActivity::class.java))
        }

        // Botones eliminar → muestran un diálogo de confirmación
        val btnEliminar1 = findViewById<Button>(R.id.btn_eliminar_usuario1)
        btnEliminar1.setOnClickListener {
            mostrarDialogoEliminar("Juan Pérez")
        }

        val btnEliminar2 = findViewById<Button>(R.id.btn_eliminar_usuario2)
        btnEliminar2.setOnClickListener {
            mostrarDialogoEliminar("María Gómez")
        }

        val btnEliminar3 = findViewById<Button>(R.id.btn_eliminar_usuario3)
        btnEliminar3.setOnClickListener {
            mostrarDialogoEliminar("Carlos Admin")
        }
    }

    // Función para mostrar el cuadro de confirmación antes de eliminar
    private fun mostrarDialogoEliminar(nombreUsuario: String) {
        AlertDialog.Builder(this)
            .setTitle("Eliminar usuario")
            .setMessage("¿Estás seguro de que quieres eliminar a $nombreUsuario?")
            .setPositiveButton("Sí, eliminar") { _, _ ->
                Toast.makeText(this, "Usuario $nombreUsuario eliminado", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancelar", null)
            .show()
    }
}