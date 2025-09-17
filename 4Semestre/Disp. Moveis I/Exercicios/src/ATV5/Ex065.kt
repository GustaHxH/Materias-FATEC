package ATV5

class Funcionario(val nome:String, var salarioBruto:Double, val desconto:Double) {

    fun salarioLiquido(): Double = salarioBruto - (salarioBruto * (desconto/100))
    fun aumentarSalario(aumento: Double) {
        salarioBruto += salarioBruto * aumento / 100.0
    }
}

fun main(){
    println("Qual o nome deste funcionário: ")
    val nome: String = readLine()!!

    println("Qual o salario bruto deste funcionário: ")
    val salarioBruto: Double = readLine()?.toDoubleOrNull() ?: return println("Número inválido")

    println("Qual o desconto do salário dele(número em %)")
    val desconto: Double = readLine()?.toDoubleOrNull() ?: return println("Número inválido")

    val func = Funcionario(nome, salarioBruto, desconto)
    println("Funcionário: ${func.nome}, salário liquido: ${func.salarioLiquido()}")

    println("Digite a % de aumento no salário")
    val aumento:Double = readLine()?.toDoubleOrNull() ?: return println("Número inválido")

    func.aumentarSalario(aumento)
    println("Dados Atualizados: ${func.nome}, salario liquido = ${func.salarioLiquido()}")
}