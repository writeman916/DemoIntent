package com.example.kuroshiro.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {


    Button btSecond;
    TextView mTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        btSecond = findViewById(R.id.btSecond);
        mTxt = findViewById(R.id.textView);

        Intent mIntent =  getIntent();
        mTxt.setText("Hello " + mIntent.getStringExtra("name"));


        btSecond.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent mIntent2 = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(mIntent2);
            }
        });
    }
}
