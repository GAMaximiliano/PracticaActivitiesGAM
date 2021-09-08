package com.example.activitiesgam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class ViewImg : AppCompatActivity() {

    lateinit var imagen: Image
    lateinit var imgVista: ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_image)

        imagen = intent.getParcelableExtra("imagen")!!

        vistasImag()
    }

    private fun vistasImag() {

        imgVista = findViewById(R.id.ImagenView)

        imgVista.setImageResource(imagen.imgDraw)
    }
}