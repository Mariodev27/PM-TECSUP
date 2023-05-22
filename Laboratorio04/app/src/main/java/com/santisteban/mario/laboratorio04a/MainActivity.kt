package com.santisteban.mario.laboratorio04a

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.santisteban.mario.laboratorio04a.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        binding.saveButton.setOnClickListener {
            val fullName = binding.nameEditText.text.toString()
            val email = binding.emailEditText.text.toString()
            val office = binding.phoneEditText.text.toString()
            val phoneNumber = binding.officeEditText.text.toString()

            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("name", fullName)
            intent.putExtra("email", email)
            intent.putExtra("office", office)
            intent.putExtra("phone", phoneNumber)
            startActivity(intent)

            val dialIntent = Intent(Intent.ACTION_DIAL, Uri.parse("tel:$phoneNumber"))
            startActivity(dialIntent)
        }
    }
}