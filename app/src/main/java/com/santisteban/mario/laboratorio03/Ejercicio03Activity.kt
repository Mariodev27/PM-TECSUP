package com.santisteban.mario.laboratorio03

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView

class Ejercicio03Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio03)

        val btnSave = findViewById<Button>(R.id.btnSave)

        val edtImage = findViewById<EditText>(R.id.edtImage)
        val edtTitle = findViewById<EditText>(R.id.edtTitle)
        val edtBand = findViewById<EditText>(R.id.edtNameBand)
        val edtTime = findViewById<EditText>(R.id.edtTime)

        val cvMusic1 = findViewById<CardView>(R.id.cvMusic1)

        val imvMusic1 = findViewById<ImageView>(R.id.imvMusic1)

        val tvnameSong1 = findViewById<TextView>(R.id.tvNameSong1)

        val tvNameBand1 = findViewById<TextView>(R.id.tvNameBand1)

        val tvTimeSong1 = findViewById<TextView>(R.id.tvTimeSong1)

        btnSave.setOnClickListener {

            val image = edtImage.text

            val uriImage = "@drawable/$image"

            val imageId = getResources().getIdentifier(uriImage, null, getPackageName());

            imvMusic1.setImageDrawable(resources.getDrawable(imageId))

            val title = edtTitle.text

            val band = edtBand.text

            val time = edtTime.text

            tvnameSong1.text = title
            tvNameBand1.text = band
            tvTimeSong1.text = time

            cvMusic1.visibility = View.VISIBLE
        }
    }

}
