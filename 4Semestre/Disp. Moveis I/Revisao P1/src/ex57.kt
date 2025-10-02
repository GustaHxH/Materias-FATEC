fun main() {
    val A = IntArray(5)
    val B = LongArray(5)

    // Ler valores para o vetor A
    for (i in A.indices) {
        print("Digite o ${i + 1}º número: ")
        A[i] = readLine()?.toIntOrNull() ?: 0
    }

    // Calcular fatorial de cada elemento e gravar em B
    for (i in A.indices) {
        var fatorial = 1L
        for (j in 1..A[i]) {
            fatorial *= j
        }
        B[i] = fatorial
    }

    // Mostrar os vetores
    println("\nVetor A: ${A.joinToString(", ")}")
    println("Vetor B (fatorial dos elementos de A): ${B.joinToString(", ")}")
}
