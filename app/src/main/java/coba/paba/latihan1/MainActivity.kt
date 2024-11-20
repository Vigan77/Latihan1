package com.example.Latihan1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import coba.paba.latihan1.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNamaTask = findViewById<EditText>(R.id.etNamaTask)
        val etTanggal = findViewById<EditText>(R.id.etTanggal)
        val etKategori = findViewById<EditText>(R.id.etKategori)
        val etDeskripsi = findViewById<EditText>(R.id.etDeskripsi)
        val btnSimpan = findViewById<Button>(R.id.btnSimpan)

        btnSimpan.setOnClickListener {
            val namaTask = etNamaTask.text.toString()
            val tanggal = etTanggal.text.toString()
            val kategori = etKategori.text.toString()
            val deskripsi = etDeskripsi.text.toString()

            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("namaTask", namaTask)
            intent.putExtra("tanggal", tanggal)
            intent.putExtra("kategori", kategori)
            intent.putExtra("deskripsi", deskripsi)
            startActivity(intent)
        }
    }
}
