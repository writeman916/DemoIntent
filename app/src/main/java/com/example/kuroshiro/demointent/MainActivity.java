package com.example.kuroshiro.demointent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button btMain;
    TextView mTxt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btMain = findViewById(R.id.button);
        mTxt = findViewById(R.id.editText);

        btMain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mItent = new Intent(MainActivity.this, SecondActivity.class);

                mItent.putExtra("name",mTxt.getText().toString());
                startActivity(mItent);
            }
        });
    }
}
