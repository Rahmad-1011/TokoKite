package com.rhmd.tokokite

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_explisit_intent.*

class ExplisitIntentActivity : AppCompatActivity() {
    companion object{
        const val EXTRA_NAME = "extra_name"
        const val EXTRA_EMAIL = "extra_email"
        const val EXTRA_HP = "extra_hp"

    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_explisit_intent)

        text_nama.text = intent.getStringExtra(EXTRA_NAME)
        text_email.text = intent.getStringExtra(EXTRA_EMAIL)
        text_hp.text = intent.getStringExtra(EXTRA_HP)

        btn_back.setOnClickListener {
            val backItem = Intent(this@ExplisitIntentActivity, MainActivity::class.java)
            startActivity(backItem)
        }
    }
}