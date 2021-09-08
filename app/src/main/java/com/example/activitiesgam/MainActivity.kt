package com.example.activitiesgam

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var arrayImage: Array<Image>
    lateinit var imgVista: ImageView
    lateinit var btnMostrarDet: Button
    lateinit var btnSiguiente: Button
    lateinit var btnAtras: Button
    var index: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        vistasImag()
    }

    private fun vistasImag() {
        btnSiguiente = findViewById(R.id.btnSiguiente)
        btnAtras = findViewById(R.id.btnAtras)
        btnMostrarDet = findViewById(R.id.btnMostrar)

        imgVista = findViewById(R.id.Imagen)

        arrayImage = (arrayOf(
            Image("Libros realistas", R.drawable.libro1),
            Image("Libros animados", R.drawable.libro2),
            Image("Libros dibujados", R.drawable.libro3),
            Image("Libros para leer", R.drawable.ic_libro4),
            Image("Libros subrayados", R.drawable.ic_libro5)
        )?: null) as Array<Image>

        imgVista.setImageResource(arrayImage[index].imgDraw)
    }

    fun mostrar(view: View) {
        startActivity(Intent(this, DetailImage::class.java).apply {
            putExtra("imagen", arrayImage[index])
        })
    }

    private fun mostrarImagen() {
        imgVista.setImageResource(arrayImage[index].imgDraw)
    }

    fun siguiente(view: View) {
        if ( index == (arrayImage.size-1) ) {
            Toast.makeText(this, "Siguiente ha alcanzado su limite", Toast.LENGTH_LONG).show()
        } else {
            index++
        }
        mostrarImagen()
    }

    fun atras(view: View) {
        if ( index == 0 ) {
            Toast.makeText(this, "Atras ha alcanzado su limite", Toast.LENGTH_LONG).show()
        } else {
            index--
        }
        mostrarImagen()
    }
}