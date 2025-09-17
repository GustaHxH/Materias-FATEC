package ATV6

data class Comida(val nome: String, val preco: Double)

fun main(){
    val listaDeCompras = listOf(
        Comida("Picanha", 79.90),
        Comida("Asa de frango", 18.79),
        Comida("Linguiça", 15.50),
        Comida("Tomate", 4.80),
        Comida("Alface", 7.99),
    )

    val totalizar = {total:Double, atual:Double -> total + atual}
    val precoTotal = listaDeCompras.map{it.preco}.reduce(totalizar)
    println("O preço de todas as comidas da Lista é de R$ %.2f".format(precoTotal))
}