fun main(){
    println("Digite o primeiro número")
    var n1 = readLine()?.toIntOrNull() ?: return println("número inválido")

    println("Digite o segundo número")
    var n2 = readLine()?.toIntOrNull() ?: return println("número inválido")

    var temp = n1
    n1 = n2
    n2 = temp

    print("O primeiro número agora é $n1 e o segundo é $n2")
}