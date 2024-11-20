package com.example.taskapp

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import coba.paba.latihan1.R

class HomeActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val taskContainer = findViewById<LinearLayout>(R.id.taskContainer)
        val btnTambahTask = findViewById<Button>(R.id.btnTambahTask)

        val namaTask = intent.getStringExtra("namaTask")
        val tanggal = intent.getStringExtra("tanggal")
        val kategori = intent.getStringExtra("kategori")
        val deskripsi = intent.getStringExtra("deskripsi")

        if (namaTask != null && tanggal != null && kategori != null && deskripsi != null) {
            val taskView = layoutInflater.inflate(R.layout.task_item, null)

            val tvNamaTask = taskView.findViewById<TextView>(R.id.tvNamaTask)
            val tvTanggal = taskView.findViewById<TextView>(R.id.tvTanggal)
            val tvKategori = taskView.findViewById<TextView>(R.id.tvKategori)
            val tvDeskripsi = taskView.findViewById<TextView>(R.id.tvDeskripsi)
            val btnHapus = taskView.findViewById<Button>(R.id.btnHapus)

            tvNamaTask.text = namaTask
            tvTanggal.text = tanggal
            tvKategori.text = kategori
            tvDeskripsi.text = deskripsi

            btnHapus.setOnClickListener {
                taskContainer.removeView(taskView)
            }

            taskContainer.addView(taskView)
        }

        btnTambahTask.setOnClickListener {
            finish() // Kembali ke halaman Tambah/Edit
        }
    }
}
