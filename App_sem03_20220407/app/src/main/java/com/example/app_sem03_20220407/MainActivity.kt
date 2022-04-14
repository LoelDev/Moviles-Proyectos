package com.example.app_sem03_20220407

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val EXTRA_MESS = "com.example.app_sem03_20220407"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun sendMessage(view: View){
        val edText = findViewById<EditText>(R.id.editEmail)
        val message = edText.text.toString()

        val intent = Intent(this, DsiplayMessageActivity::class.java).apply {
            putExtra(EXTRA_MESS, message)
        }
        startActivity(intent)
    }
}