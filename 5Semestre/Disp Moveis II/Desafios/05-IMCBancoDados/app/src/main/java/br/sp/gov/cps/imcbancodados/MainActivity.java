package br.sp.gov.cps.imcbancodados;

import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.textfield.TextInputEditText;

public class MainActivity extends AppCompatActivity {

    TextInputEditText textNome, textIdade, textAltura, textPeso;

    Button btnCalcular, btnConsultar, btnAtualizar, btnDeletar;

    TextView textResultado;

    DatabaseHelper db;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        db = new DatabaseHelper(this);

        textNome = findViewById(R.id.textNome);
        textIdade = findViewById(R.id.textIdade);
        textAltura = findViewById(R.id.textAltura);
        textPeso = findViewById(R.id.textPeso);

        btnCalcular = findViewById(R.id.btnCalcular);
        btnConsultar = findViewById(R.id.btnConsultar);
        btnAtualizar = findViewById(R.id.btnAtualizar);
        btnDeletar = findViewById(R.id.btnDeletar);

        textResultado = findViewById(R.id.textResultado);

        btnCalcular.setOnClickListener(v -> {

            String nome = textNome.getText().toString();
            String idadeStr = textIdade.getText().toString();
            String alturaStr = textAltura.getText().toString();
            String pesoStr = textPeso.getText().toString();

            if(nome.isEmpty() || idadeStr.isEmpty()
                    || alturaStr.isEmpty() || pesoStr.isEmpty()) {

                Toast.makeText(this,
                        "Preencha todos os campos",
                        Toast.LENGTH_LONG).show();

                return;
            }

            int idade = Integer.parseInt(idadeStr);

            double altura = Double.parseDouble(alturaStr);

            double peso = Double.parseDouble(pesoStr);

            double imc = peso / (altura * altura);

            boolean inserir = db.inserirDados(
                    nome,
                    idade,
                    altura,
                    peso,
                    imc
            );

            if(inserir){

                Intent tela = new Intent(
                        MainActivity.this,
                        ResultadoActivity.class
                );

                tela.putExtra("nome", nome);
                tela.putExtra("idade", idade);
                tela.putExtra("altura", altura);
                tela.putExtra("peso", peso);
                tela.putExtra("imc", imc);

                startActivity(tela);

            } else {

                Toast.makeText(this,
                        "Erro ao salvar",
                        Toast.LENGTH_LONG).show();
            }
        });

        btnConsultar.setOnClickListener(v -> {

            String nome = textNome.getText().toString();

            Cursor cursor = db.consultarDados(nome);

            if(cursor.moveToFirst()) {

                textResultado.setText(
                        "Nome: " + cursor.getString(1) +
                                "\nIdade: " + cursor.getInt(2) +
                                "\nAltura: " + cursor.getDouble(3) +
                                "\nPeso: " + cursor.getDouble(4) +
                                "\nIMC: " + String.format("%.2f",
                                cursor.getDouble(5))
                );

            } else {

                Toast.makeText(this,
                        "Usuário não encontrado",
                        Toast.LENGTH_LONG).show();
            }
        });

        btnAtualizar.setOnClickListener(v -> {

            String nome = textNome.getText().toString();

            int idade = Integer.parseInt(
                    textIdade.getText().toString());

            double altura = Double.parseDouble(
                    textAltura.getText().toString());

            double peso = Double.parseDouble(
                    textPeso.getText().toString());

            double imc = peso / (altura * altura);

            boolean atualizar = db.atualizarDados(
                    nome,
                    idade,
                    altura,
                    peso,
                    imc
            );

            if(atualizar){

                Toast.makeText(this,
                        "Atualizado com sucesso",
                        Toast.LENGTH_LONG).show();

            } else {

                Toast.makeText(this,
                        "Erro ao atualizar",
                        Toast.LENGTH_LONG).show();
            }
        });

        btnDeletar.setOnClickListener(v -> {

            String nome = textNome.getText().toString();

            boolean deletar = db.deletarDados(nome);

            if(deletar){

                Toast.makeText(this,
                        "Deletado com sucesso",
                        Toast.LENGTH_LONG).show();

            } else {

                Toast.makeText(this,
                        "Erro ao deletar",
                        Toast.LENGTH_LONG).show();
            }
        });
    }
}