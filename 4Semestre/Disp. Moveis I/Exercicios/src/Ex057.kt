fun main(){
    val tamanho = 5
    val A = IntArray(tamanho)
    val B = IntArray(tamanho)
    for(i in 0 until tamanho){
        print("Digite o valor de $i de A: ")
        A[i] = readLine()!!.toInt()
    }

    fun fatorial(n: Int): Int {
        var fat = 1
        for (i in 1..n) {
            fat *= i
        }
        return fat
    }

    for(i in 0 until tamanho){
        B[i] = fatorial(A[i])
    }

    println("Vetor A: ${A.joinToString()}")
    println("Vetor B (fatorial de A): ${B.joinToString()}")
}

