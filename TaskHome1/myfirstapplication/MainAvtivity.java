package com.pnovosdovgmail.myfirstapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button buttonTask1;
    Button buttonTask2;
    Button buttonTask3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonTask1 = (Button) findViewById(R.id.buttonTask1);
        buttonTask1.setOnClickListener(this);

        buttonTask2 = (Button) findViewById(R.id.buttonTask2);
        buttonTask2.setOnClickListener(this);

        buttonTask3 = (Button) findViewById(R.id.buttonTask3);
        buttonTask3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.buttonTask1:
                Intent intent = new Intent(this,Task1.class);
                startActivity(intent);
                break;

            case R.id.buttonTask2:
                Intent intent2 = new Intent(this,Task2.class);
                startActivity(intent2);
                break;

            case R.id.buttonTask3:
                Intent intent3 = new Intent(this,Task3.class);
                startActivity(intent3);
                break;

            default:
                break;
        }

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onStop() {
        super.onStop();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
}
