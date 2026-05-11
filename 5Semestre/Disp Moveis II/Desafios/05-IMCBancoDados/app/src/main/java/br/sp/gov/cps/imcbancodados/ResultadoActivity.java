package br.sp.gov.cps.imcbancodados;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class ResultadoActivity extends AppCompatActivity {

    TextView textDados;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        textDados = findViewById(R.id.textDados);

        String nome = getIntent().getStringExtra("nome");

        int idade = getIntent().getIntExtra("idade", 0);

        double altura = getIntent().getDoubleExtra("altura", 0);

        double peso = getIntent().getDoubleExtra("peso", 0);

        double imc = getIntent().getDoubleExtra("imc", 0);

        String classificacao;

        if(imc < 18.5){

            classificacao = "Abaixo do peso";

        } else if(imc < 25){

            classificacao = "Peso normal";

        } else if(imc < 30){

            classificacao = "Sobrepeso";

        } else {

            classificacao = "Obesidade";
        }

        textDados.setText(
                "Nome: " + nome +
                        "\n\nIdade: " + idade +
                        "\n\nAltura: " + altura +
                        "\n\nPeso: " + peso +
                        "\n\nIMC: " + String.format("%.2f", imc) +
                        "\n\nClassificação: " + classificacao
        );
    }
}