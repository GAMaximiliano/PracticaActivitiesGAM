package com.example.activitiesgam

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
class Image(
    var descripcion: String = "",
    var imgDraw: Int

): Parcelable {
    companion object {
        val array = arrayOf(
            Image("libro1", R.drawable.libro1),
            Image("libro2", R.drawable.libro2),
            Image("libro3", R.drawable.libro3),
            Image("libro4", R.drawable.ic_libro4),
            Image("libro5", R.drawable.ic_libro5)
        )
    }
}