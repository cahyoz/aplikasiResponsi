package com.mobile.responsi

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    private lateinit var btnlogin: Button
    private lateinit var btnrecover: Button
    private lateinit var btnregister: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnlogin = findViewById(R.id.btn_login)
        btnregister = findViewById(R.id.btn_register)
        btnrecover = findViewById(R.id.btn_recover)

        btnlogin.setOnClickListener{
            val intent = Intent(this, HomeActivity::class.java)
            startActivity(intent)
        }

        btnrecover.setOnClickListener{
            val intent = Intent(this, RecoverActivity::class.java)
            startActivity(intent)
        }

        btnregister.setOnClickListener{
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
    }

