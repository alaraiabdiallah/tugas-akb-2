package me.alarai.tugas2akb

/*
* NIM : 10116006
* Nama: Ala Rai AbdiAllah
* Kelas: IF-6K
* Tanggal Pengerjaan : 17 April 2020
* Deskripsi Pekerjaan: Halaman 1, 2, 3, 4
* */

import android.content.Intent
import android.os.Bundle
import android.text.Html
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        txt_regis.text = Html.fromHtml(getString(R.string.txt_regis))
        btn_login.setOnClickListener {
            val intent = Intent(this, Screen2Activity::class.java)
            startActivity(intent)
        }
    }
}
