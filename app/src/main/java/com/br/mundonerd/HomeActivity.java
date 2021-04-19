package com.br.mundonerd;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void sorteador(View view) {
        startActivity(new Intent(this, SorteadorActivity.class));
    }

    public void rolarDados(View view) {
        startActivity(new Intent(this, RolarDadoActivity.class));
    }

    public void frases(View view) {
        startActivity(new Intent(this, FrasesActivity.class));
    }
}