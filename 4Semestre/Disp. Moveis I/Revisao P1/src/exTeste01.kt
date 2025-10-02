fun main(){
    print("Digite um número para ser fatorado: ")
    var n1 : Int = readLine()?.toIntOrNull()?: return println("Número inválido")

    var fatorial = 1
    for(i in 1..n1){
        fatorial *= i
    }

    println("O resultado da fatoração é $fatorial")

    
}
