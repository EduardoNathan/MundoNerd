package com.br.mundonerd;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class FrasesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frases);
    }

    // Função responsável por gerar a frase
    public void gerarNovaFrase(View view) {

        // armazenando as frases geradas

        String[] frases = {
                "Para sentir o amor, devemos antes comunicar o amor em atos, palavras e ações.", // posicao 0
                "A vida é sobre criar impacto, não uma renda.", // posicao 1
                "Para ter o que nunca teve, faça o que nunca fez.", // posicao 2
                "Duas estradas divergiam em uma bifurcação, e eu peguei a menos percorrida. E isso fez toda a diferença.", // posicao 3
                "A vida não é sobre ter, é sobre dar e ser.", // posicao 4
                "As pessoas bem sucedidas e mal sucedidas não variam muito em suas habilidades. Eles variam em seu desejo de alcançar o seu potencial.", // posicao 5
                "Eu aprendi que as pessoas vão esquecer o que você disse, as pessoas vão esquecer o que você fez, mas as pessoas nunca esquecerão como você as fez sentir”.", // posicao 6
                "As três maiores características de uma pessoa com crença de não merecimento são: perder, não terminar o que começou, e depois de tudo isso recomeçar.", // posicao 7
                "A simplicidade é o último grau de sofisticação." //posicao 8
        };

        // VARIAVEL responsavel por gerar valores aleatorios
        // que serao utilizados para indicar posicao no vetor frase(acima)
        int numero = new Random().nextInt(9);

        // mostrando a frase com base na posição sorteada
        TextView frase = findViewById(R.id.txtFraseGerada);
        frase.setText(frases[numero]);

    }// Fechamento da função gerarNovaFrase
}