package br.gov.br.cps.megasena;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.HashSet;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    TextView n1, n2, n3, n4, n5, n6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        n1 = findViewById(R.id.n1);
        n2 = findViewById(R.id.n2);
        n3 = findViewById(R.id.n3);
        n4 = findViewById(R.id.n4);
        n5 = findViewById(R.id.n5);
        n6 = findViewById(R.id.n6);
    }

    public void sorteioNumero(View view) {
        Random random = new Random();
        HashSet<Integer> numeros = new HashSet<>();

        while (numeros.size() < 6) {
            numeros.add(random.nextInt(60) + 1);
        }

        Integer[] lista = numeros.toArray(new Integer[0]);

        n1.setText(String.valueOf(lista[0]));
        n2.setText(String.valueOf(lista[1]));
        n3.setText(String.valueOf(lista[2]));
        n4.setText(String.valueOf(lista[3]));
        n5.setText(String.valueOf(lista[4]));
        n6.setText(String.valueOf(lista[5]));
    }

    public void limparNumeros(View view){
        n1.setText("");
        n2.setText("");
        n3.setText("");
        n4.setText("");
        n5.setText("");
        n6.setText("");
    }

}