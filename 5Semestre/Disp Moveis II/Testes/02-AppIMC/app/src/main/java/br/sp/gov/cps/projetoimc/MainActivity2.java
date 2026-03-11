package br.sp.gov.cps.projetoimc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity2 extends AppCompatActivity {

    TextView nomeResultado, pesoResultado, imcResultado, classificacao;
    Button voltar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nomeResultado = findViewById(R.id.nomeResultado);
        pesoResultado = findViewById(R.id.pesoResultado);
        imcResultado = findViewById(R.id.imcResultado);
        classificacao = findViewById(R.id.classificacao);
        voltar = findViewById(R.id.voltar);

        String nome = getIntent().getStringExtra("nome");
        double peso = getIntent().getDoubleExtra("peso",0);
        double imc = getIntent().getDoubleExtra("imc",0);

        nomeResultado.setText(nome);
        pesoResultado.setText(peso + " kg");
        imcResultado.setText("IMC: " + String.format("%.2f", imc));
        classificacao.setText("Abaixo do peso");

        voltar.setOnClickListener(v -> finish());
    }
}