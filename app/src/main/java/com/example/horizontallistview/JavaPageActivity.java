package com.example.horizontallistview;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.horizontallistview.adapter.GiftPackageAdapter;
import com.example.horizontallistview.widget.HorizontalListView;

/**
 * @author xaiyiye5
 * 2020年6月5日20:35:22
 * Java版本页面
 */
public class JavaPageActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java);
        HorizontalListView lvData = findViewById(R.id.lvData);
        lvData.setAdapter(new GiftPackageAdapter());
    }
}
