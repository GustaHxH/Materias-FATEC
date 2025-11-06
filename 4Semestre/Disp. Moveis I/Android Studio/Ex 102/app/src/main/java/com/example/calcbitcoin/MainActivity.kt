package com.example.calcbitcoin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import java.net.URL
import org.json.JSONObject
import java.text.NumberFormat
import java.util.*
import kotlinx.coroutines.*
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import androidx.appcompat.app.AppCompatDelegate

class MainActivity : AppCompatActivity() {

    val API_URL = "https://www.mercadobitcoin.net/api/BTC/ticker/"
    var cotacaoBitcoin: Double = 0.0

    private lateinit var btnCalcular: Button
    private lateinit var txtValor: EditText
    private lateinit var txtCotacao: TextView
    private lateinit var txtQtdBitcoins: TextView
    private lateinit var btnTema: Button
    private lateinit var layoutPrincipal: LinearLayout

    private var modoEscuroAtivo = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtValor = findViewById(R.id.txtValor)
        btnCalcular = findViewById(R.id.btnCalcular)
        txtCotacao = findViewById(R.id.txtCotacao)
        txtQtdBitcoins = findViewById(R.id.txtQtdBitcoins)
        btnTema = findViewById(R.id.btnTema)
        layoutPrincipal = findViewById(R.id.layoutPrincipal)

        buscarCotacao()

        btnCalcular.setOnClickListener { calcular() }

        btnTema.setOnClickListener {
            modoEscuroAtivo = !modoEscuroAtivo

            if (modoEscuroAtivo) {
                layoutPrincipal.setBackgroundColor(getColor(R.color.fundo_azul_escuro))
                txtCotacao.setTextColor(getColor(R.color.white))
                txtQtdBitcoins.setTextColor(getColor(R.color.white))
                btnTema.setTextColor(getColor(R.color.white))
                btnTema.text = "Modo Claro"
            } else {
                layoutPrincipal.setBackgroundColor(getColor(R.color.fundo_azul_claro))
                txtCotacao.setTextColor(getColor(R.color.black))
                txtQtdBitcoins.setTextColor(getColor(R.color.black))
                btnTema.setTextColor(getColor(R.color.black))
                btnTema.text = "Modo Escuro"
            }
        }
    }

    fun buscarCotacao() {
        GlobalScope.launch(IO) {
            try {
                val resposta = URL(API_URL).readText()
                cotacaoBitcoin = JSONObject(resposta).getJSONObject("ticker").getDouble("last")

                val f = NumberFormat.getCurrencyInstance(Locale("pt", "BR"))
                val cotacaoFormatada = f.format(cotacaoBitcoin)

                withContext(Main) {
                    txtCotacao.text = cotacaoFormatada
                }
            } catch (e: Exception) {
                e.printStackTrace()
                withContext(Main) {
                    Toast.makeText(this@MainActivity, "Erro ao buscar cotação.", Toast.LENGTH_LONG).show()
                }
            }
        }
    }

    fun calcular() {
        if (txtValor.text.isEmpty()) {
            txtValor.error = "Preencha um valor"
            return
        }

        val valorDigitado = txtValor.text.toString().replace(",", ".").toDouble()
        val resultado = if (cotacaoBitcoin > 0) valorDigitado / cotacaoBitcoin else 0.0
        txtQtdBitcoins.text = "%.8f".format(resultado)
    }
}
