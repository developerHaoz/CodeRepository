package com.example.developerhaoz.coderepository;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by developerHaoz on 2017/7/31.
 */

public class TestActivity extends AppCompatActivity {

    private static final String TAG = "TestActivity";
    private Button mBtnTest;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        mBtnTest = (Button) findViewById(R.id.test_btn_test);
        mBtnTest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Intent.ACTION_SEND);
                String title = "请选择";
                Intent chooser = Intent.createChooser(intent, title);
                if(intent.resolveActivity(getPackageManager()) != null){
                    startActivity(intent);
                }

            }
        });
    }

}


















