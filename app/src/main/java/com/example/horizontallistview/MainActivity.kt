package com.example.horizontallistview

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*

/**
 * 区分Java和kotlin版本
 * 2020年6月5日20:39:29
 */
class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btJava.setOnClickListener(this)
        btKotlin.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btJava -> goJavaPage()
            R.id.btKotlin -> goKotlinPage()
        }
    }


    private fun goJavaPage() {
        startActivity(Intent(this, JavaPageActivity::class.java))
    }

    private fun goKotlinPage() {
        startActivity(Intent(this, KotlinPageActivity::class.java))
    }
}