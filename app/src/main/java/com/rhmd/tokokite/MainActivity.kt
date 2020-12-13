package com.rhmd.tokokite

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_simple_intent.setOnClickListener {
            val simpleIntent = Intent(this@MainActivity, SimpleActivity::class.java);
            startActivity(simpleIntent);
        }
        btn_intent_with_data.setOnClickListener {
            val dataIntent = Intent(this@MainActivity, ExplisitIntentActivity::class.java)
            dataIntent.putExtra(ExplisitIntentActivity.EXTRA_NAME, "Rahmad Ardianto")
            dataIntent.putExtra(ExplisitIntentActivity.EXTRA_EMAIL, "rahmadardianto69@gmail.com")
            dataIntent.putExtra(ExplisitIntentActivity.EXTRA_HP, "0895702460425")
            startActivity(dataIntent)
        }
        btn_implisit_intent.setOnClickListener {
            val phoneNumber = "0895702460425"
            val intent = Intent(Intent.ACTION_SENDTO, Uri.parse("smsto:$phoneNumber"))
            intent.putExtra("sms_body", "BAYAR UTANG WOY")
            startActivity(intent)
        }
    }
}