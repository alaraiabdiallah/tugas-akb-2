package me.alarai.tugas2akb

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Html
import kotlinx.android.synthetic.main.activity_screen4.*

class Screen4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_screen4)
        txt_resend.text = Html.fromHtml(getString(R.string.txt_resend_code))
    }
}
