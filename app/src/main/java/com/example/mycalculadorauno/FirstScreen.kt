package com.example.mycalculadorauno

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.mycalculadorauno.databinding.ActivityFirstScreenBinding


class FirstScreen : AppCompatActivity() {
    lateinit var binding: ActivityFirstScreenBinding
    var click = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityFirstScreenBinding.inflate(layoutInflater)
        setContentView(binding.root)
        clickScorpion()
        binding.button.setOnClickListener { ingresoCalculadora() }

    }

    private fun ingresoCalculadora() {
        startActivity(Intent(this, MainActivity::class.java))
    }

    fun clickScorpion() {
        binding.scorpion.setOnClickListener {

            if (click == 0) {
                Toast.makeText(this, "Clickea en el boton che", Toast.LENGTH_SHORT).show()
                click++
            } else if (click == 1) {
                Toast.makeText(this, "En el BOTON!!", Toast.LENGTH_SHORT).show()
                click++
            } else {
                Toast.makeText(this, "Listo no hay mates para vos", Toast.LENGTH_SHORT).show()
                ingresoCalculadora()
                click=0
            }
        }
    }


}