package com.santisteban.mario.laboratorio04a

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.net.toUri
import com.santisteban.mario.laboratorio04a.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)

        val name = intent.getStringExtra("name")
        val email = intent.getStringExtra("email")
        val office = intent.getStringExtra("office")
        val phone = intent.getStringExtra("phone")

        binding.nameTextView.text = name
        binding.emailTextView.text = email
        binding.officeTextView.text = office
        binding.phoneTextView.text = phone

        // Intent explícito para llamar al número de teléfono
        binding.callButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_DIAL)
            intent.data = "tel:$phone".toUri()
            startActivity(intent)
        }

        // Intent explícito para enviar un mensaje de texto al número de teléfono
        binding.messageButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SENDTO)
            intent.data = "smsto:$phone".toUri()
            startActivity(intent)
        }

        // Intent explícito para enviar un mensaje de WhatsApp al número de teléfono
        binding.whatsappButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.`package` = "com.whatsapp"
            intent.setDataAndType("whatsapp:$phone".toUri(), "text/plain")
            intent.putExtra(Intent.EXTRA_TEXT, "Hola, ¿cómo estás?")
            startActivity(intent)
        }

        // Intent implícito para enviar un correo electrónico al destinatario especificado
        binding.emailButton.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
            intent.type = "text/plain"
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            intent.putExtra(Intent.EXTRA_SUBJECT, "Asunto del correo")
            intent.putExtra(Intent.EXTRA_TEXT, "Contenido del correo")
            startActivity(Intent.createChooser(intent, "Enviar correo electrónico"))
        }
    }
}
