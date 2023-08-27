package com.santisteban.mario.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView

class Ejercicio02Activity : AppCompatActivity() {

    private lateinit var tvName: TextView

    private lateinit var tvLastName: TextView

    private lateinit var tvEmail: TextView

    private lateinit var edtName: EditText

    private lateinit var edtEmail: EditText

    private lateinit var edtLastName: EditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio02)
        initializeWidgets()
        saveInformation()
    }

    private fun initializeWidgets() {

        tvName = findViewById(R.id.tvName)

        tvLastName = findViewById(R.id.tvLastName)

        tvEmail = findViewById(R.id.tvEmail)

        edtName = findViewById(R.id.edtName)

        edtLastName = findViewById(R.id.edtLastName)

        edtEmail = findViewById(R.id.edtEmail)
    }

    private fun saveInformation() {

        val btnSave = findViewById<Button>(R.id.btnSave)

        btnSave.setOnClickListener {
            tvName.text = "Nombre: ${edtName.text}"
            tvLastName.text = "Apellido: ${edtLastName.text}"
            tvEmail.text = "Email: ${edtEmail.text}"
            showResultForm()
            clearForm()
        }
    }

    private fun showResultForm() {
        val lnResult = findViewById<LinearLayout>(R.id.lnResult)

        lnResult.visibility = View.VISIBLE
    }

    private fun clearForm() {
        edtEmail.text.clear()
        edtLastName.text.clear()
        edtName.text.clear()
    }

}
