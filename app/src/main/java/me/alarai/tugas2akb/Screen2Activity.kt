package me.alarai.tugas2akb

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_screen2.*

class Screen2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen2)
        ArrayAdapter.createFromResource(this, R.array.blood_types, android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            blood_type.adapter = adapter
        }
        ArrayAdapter.createFromResource(this, R.array.reshus, android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            reshus.adapter = adapter
        }
        ArrayAdapter.createFromResource(this, R.array.job, android.R.layout.simple_spinner_item).also { adapter ->
            adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
            job.adapter = adapter
        }

        back.setOnClickListener {
            finish()
        }
        btn_regis.setOnClickListener {
            val intent = Intent(this, Screen3Activity::class.java)
            startActivity(intent)
        }
    }
}
