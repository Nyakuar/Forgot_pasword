package dev.nyakuar.forgot_password_code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Selection_Activity : AppCompatActivity() {
      lateinit var btnsend: Button
      lateinit var btnprev: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_selection)
        btnsend=findViewById(R.id.btnsend )
        btnsend.setOnClickListener {
            val intent = Intent(this,DetailsActivity ::class.java )
            startActivity(intent)
        }
        btnprev=findViewById(R.id.btnnthird )
        btnprev.setOnClickListener {
            val intent = Intent(this,MainActivity ::class.java )
            startActivity(intent)
        }
    }
}
