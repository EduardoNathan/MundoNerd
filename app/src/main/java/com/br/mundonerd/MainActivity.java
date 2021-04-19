package com.br.mundonerd;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                abrirHome();
            }
        }, 1500);
    }

    private void abrirHome() {
        Intent i = new Intent(MainActivity.this, HomeActivity.class);
        startActivity(i);
        finish();
    }

}