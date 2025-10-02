fun main() {
    print("Digite o nome do aluno: ")
    val nome = readLine() ?: ""

    print("Digite a nota do 1º trimestre (peso 30): ")
    val n1 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite a nota do 2º trimestre (peso 35): ")
    val n2 = readLine()?.toDoubleOrNull() ?: 0.0

    print("Digite a nota do 3º trimestre (peso 35): ")
    val n3 = readLine()?.toDoubleOrNull() ?: 0.0

    val aluno = Aluno(nome, n1, n2, n3)

    println("\nNOTA FINAL = %.2f".format(aluno.notaFinal()))
    if (aluno.notaFinal() >= 60) {
        println("APROVADO")
    } else {
        println("REPROVADO")
        println("Faltam %.2f pontos para aprovação".format(aluno.pontosFaltando()))
    }
}

class Aluno(val nome: String, val nota1: Double, val nota2: Double, val nota3: Double) {
    fun notaFinal(): Double {
        return nota1 * 0.3 + nota2 * 0.35 + nota3 * 0.35
    }

    fun pontosFaltando(): Double {
        val falta = 60 - notaFinal()
        return if (falta > 0) falta else 0.0
    }
}
