package com.example.uchihaye.surveytime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnCreateSurvey = findViewById(R.id.btnCreateSurvey);
        Button btnEnterPin = findViewById(R.id.btnEnterPin);

        btnCreateSurvey.setOnClickListener(this);
        btnEnterPin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btnCreateSurvey:
                Intent intent = new Intent(MainActivity.this,CreateSurvey.class);
                intent.putExtra("EXTRA_SESSION_ID", 1);
                startActivity(intent);

                break;

            case R.id.btnEnterPin:
                startActivity(new Intent(MainActivity.this,EnterPin.class));
                break;
        }
    }
}
