package com.example.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    // val angkaBulat: Int = 4
    // val angkaBulat: Int? = null

    /*
    val angkaDecimal: Double = 14.3
    val angkaPanjang: Long = 90000000000000000L

    val karakter: Char = 'A'
    var kata: String = "Ini adalah contoh teks panjang" // val tidak diubah nama variabel nya

    var benar: Boolean = true // ini untuk deklarasi var yang bisa diubah (variabel dynamic)
    val salah: Boolean = false // variabel static

    val angkaArray: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    val stringArray: Array<String> = arrayOf("Aku", "Adalah", "Programmer")
    val booleanArray: Array<Boolean> = arrayOf(true, false, true)
    */


    var angkaBulat: Int = 1

    fun hitung(){ // Int? untuk menandakan null
        angkaBulat++ // angkaBulat += 1
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val textView: TextView = findViewById(R.id.text_view)
        val btnHitung: Button = findViewById(R.id.btn_hitung)

        btnHitung.setOnClickListener {
            hitung()
            textView.text = angkaBulat.toString()
        }

        /*
        if(angkaBulat == 4){
            benar = true
            kata = "Aku adalah pelajar"
        }
        else{
            benar = false
        }

         */
    }
}