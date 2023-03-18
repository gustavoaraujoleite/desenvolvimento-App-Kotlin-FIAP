package br.com.example.desesenvolvendo_app_fase5_fiap.activity

import android.app.Activity
import android.content.Intent

import android.os.Bundle
import android.widget.Button
import br.com.example.desesenvolvendo_app_fase5_fiap.R

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonClick = findViewById<Button>(R.id.login_button)
        buttonClick.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }



}