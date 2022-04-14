package com.example.app_sem03_20220407

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DsiplayMessageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dsiplay_message)

        val message = intent.getStringExtra(EXTRA_MESS)

        val textView = findViewById<TextView>(R.id.tvData).apply {
            text = message
        }
    }
}