package com.solarhub.app

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class PasarelaPageosActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pasarela_pagos)

        val btnConfirmar = findViewById<Button>(R.id.btn_confirmar)
        btnConfirmar.setOnClickListener { finish() }
    }
}