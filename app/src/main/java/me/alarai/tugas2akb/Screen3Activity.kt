package me.alarai.tugas2akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_screen3.*

class Screen3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen3)
        btn_verify.setOnClickListener {
            val intent = Intent(this, Screen4Activity::class.java)
            startActivity(intent)
        }
    }
}
