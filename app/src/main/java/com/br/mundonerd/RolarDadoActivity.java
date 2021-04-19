package com.br.mundonerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class RolarDadoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rolar_dado);
    }

    public void sortearNum(View view) {
        TextView texto = findViewById(R.id.txtResultado);

        int num = new Random().nextInt(101);

        texto.setText(" " + num);
    }

}