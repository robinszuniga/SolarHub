package com.solarhub.app

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity

class PanelVendedorActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_panel_vendedor)

        // Botón agregar producto nuevo (el + Agregar del toolbar)
        val btnAgregar = findViewById<Button>(R.id.btn_agregar)
        btnAgregar.setOnClickListener {
            startActivity(Intent(this, CrearProductoActivity::class.java))
        }

        // Botones editar de cada producto → van a la pantalla de crear (que sirve de editar)
        val btnEditarProducto1 = findViewById<Button>(R.id.btn_editar_producto1)
        btnEditarProducto1.setOnClickListener {
            startActivity(Intent(this, CrearProductoActivity::class.java))
        }

        val btnEditarProducto2 = findViewById<Button>(R.id.btn_editar_producto2)
        btnEditarProducto2.setOnClickListener {
            startActivity(Intent(this, CrearProductoActivity::class.java))
        }

        // Botones eliminar → diálogo de confirmación
        val btnEliminarProducto1 = findViewById<Button>(R.id.btn_eliminar_producto1)
        btnEliminarProducto1.setOnClickListener {
            mostrarDialogoEliminar("Panel Solar 400W Monocristalino")
        }

        val btnEliminarProducto2 = findViewById<Button>(R.id.btn_eliminar_producto2)
        btnEliminarProducto2.setOnClickListener {
            mostrarDialogoEliminar("Batería Litio 200Ah 48V")
        }
    }

    // Cuadro de confirmación antes de eliminar el producto
    private fun mostrarDialogoEliminar(nombreProducto: String) {
        AlertDialog.Builder(this)
            .setTitle("Eliminar producto")
            .setMessage("¿Seguro que quieres eliminar \"$nombreProducto\"?")
            .setPositiveButton("Sí, eliminar") { _, _ ->
                Toast.makeText(this, "Producto eliminado", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancelar", null)
            .show()
    }
}