package com.example.myapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class   MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val mainLayout: ConstraintLayout = findViewById(R.id.main_layout)
        val editText: EditText = findViewById(R.id.edit_text)
        val btnClick: Button = findViewById(R.id.btn_click)

        btnClick.setOnClickListener {
            val teks: String = editText.text.toString()
            Snackbar.make(mainLayout, teks, Snackbar.LENGTH_LONG).show()
            val builder = AlertDialog.Builder(this)
            builder.setTitle("My App")
            builder.setMessage(teks)
            builder.setPositiveButton("Tutup"){
                dialog, which ->
                dialog.dismiss()
            }
            val dialog = builder.create()
            dialog.show()
        }
    }
}