package com.example.horizontallistview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.horizontallistview.adapter.GiftPackageAdapter
import com.example.horizontallistview.widget.HorizontalListView

/**
 * @author xaiyiye5
 * 2020年6月5日20:35:22
 * Java版本页面
 */
class KotlinPageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_java)
        val lvData = findViewById<HorizontalListView>(R.id.lvData)
        lvData.adapter = GiftPackageAdapter()
    }
}