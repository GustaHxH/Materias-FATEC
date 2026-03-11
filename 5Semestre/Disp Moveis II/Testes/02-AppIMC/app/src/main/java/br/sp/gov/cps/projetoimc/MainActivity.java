package br.sp.gov.cps.projetoimc;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText nome, peso, altura;
    Button calcular, limpar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.nome);
        peso = findViewById(R.id.peso);
        altura = findViewById(R.id.altura);
        calcular = findViewById(R.id.calcular);
        limpar = findViewById(R.id.limpar);

        calcular.setOnClickListener(v -> {

            String n = nome.getText().toString();
            double p = Double.parseDouble(peso.getText().toString());
            double a = Double.parseDouble(altura.getText().toString());

            double imc = p/(a*a);

            Intent tela;

            if(imc < 18.5){
                tela = new Intent(MainActivity.this, MainActivity2.class);
            }
            else if(imc < 25){
                tela = new Intent(MainActivity.this, MainActivity3.class);
            }
            else if(imc < 30){
                tela = new Intent(MainActivity.this, MainActivity4.class);
            }
            else if(imc < 35){
                tela = new Intent(MainActivity.this, MainActivity5.class);
            }
            else if(imc < 40){
                tela = new Intent(MainActivity.this, MainActivity6.class);
            }
            else{
                tela = new Intent(MainActivity.this, MainActivity7.class);
            }

            tela.putExtra("nome", n);
            tela.putExtra("peso", p);
            tela.putExtra("altura", a);
            tela.putExtra("imc", imc);

            startActivity(tela);
        });

        limpar.setOnClickListener(v -> {
            nome.setText("");
            peso.setText("");
            altura.setText("");
        });
    }
}