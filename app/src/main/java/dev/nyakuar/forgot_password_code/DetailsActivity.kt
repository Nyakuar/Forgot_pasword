package dev.nyakuar.forgot_password_code

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class DetailsActivity : AppCompatActivity() {
    lateinit var btnupdate: Button
    lateinit var btnprev:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        btnupdate = findViewById(R.id.btnupdate)
        btnupdate.setOnClickListener {
            val intent = Intent (this,UpdateActivity ::class.java )
            startActivity(intent )
    }
}



}