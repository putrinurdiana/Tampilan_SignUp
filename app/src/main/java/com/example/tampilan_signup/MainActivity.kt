package com.example.tampilan_signup

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.tampilan_signup.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    // Deklarasikan variabel binding untuk mengakses semua elemen di layout XML
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inisialisasi View Binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Tambahkan logika untuk tombol Sign Up
        binding.btnSignUp.setOnClickListener {
            val email = binding.etEmail.text.toString()
            val fullName = binding.etFullname.text.toString()
            val username = binding.etUsername.text.toString()
            val password = binding.etPassword.text.toString()

            // Validasi input sederhana
            if (email.isEmpty() || fullName.isEmpty() || username.isEmpty() || password.isEmpty()) {
                Toast.makeText(this, "Please fill out all fields", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Sign Up Successful!", Toast.LENGTH_SHORT).show()
                // Anda bisa menambahkan logika untuk mengirim data ke server di sini
            }
        }

        // logika untuk text "Login"
        binding.login2.setOnClickListener {
            Toast.makeText(this, "Redirect to Login", Toast.LENGTH_SHORT).show()
            // Tambahkan logika untuk pindah ke halaman login
        }
    }
}
