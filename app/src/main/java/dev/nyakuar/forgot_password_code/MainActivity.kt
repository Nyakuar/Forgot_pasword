package dev.nyakuar.forgot_password_code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    lateinit var btnnext : Button
    lateinit var btnnthird: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnnext  = findViewById(R.id.btnnthird)
        btnnext .setOnClickListener {
            val intent = Intent (this,UpdateActivity ::class.java )
            startActivity(intent )
        }
        btnnthird=findViewById(R.id.btnnthird )
        btnnthird.setOnClickListener {
            val intent = Intent (this,Selection_Activity ::class.java )
            startActivity(intent)
        }

    }
}