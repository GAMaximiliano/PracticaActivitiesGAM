package com.example.activitiesgam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView

class DetailImage : AppCompatActivity(){
    lateinit var imagen: Image
    lateinit var imgVista: ImageView
    lateinit var txtVista: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_image)

        imagen = intent.getParcelableExtra("imagen")!!

        vistasImag()

    }

    private fun vistasImag() {
        imgVista = findViewById(R.id.ImagenDetailed)
        txtVista = findViewById(R.id.ImagenDescription)

        imgVista.setImageResource(imagen.imgDraw)
        txtVista.text = imagen.descripcion
    }

    fun vistaDetalle(view: View) {
        startActivity(Intent(this, com.example.activitiesgam.ViewImg::class.java).apply {
            putExtra("imagen", imagen)
        })
    }
}