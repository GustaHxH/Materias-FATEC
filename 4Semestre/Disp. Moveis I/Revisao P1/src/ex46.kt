fun main(){
    while(true) {
        println("\nEscolha uma opção")
        println("1 - Fatorial")
        println("2 - Quadrado do número")
        println("3 - Volume da lata")
        println("4 - sair do programa")
        print("Opção: ")

        val opcao = readLine()?.toIntOrNull() ?: continue

        when(opcao){
            1 ->{
                print("Digite um Número: ")
                val n = readLine()?.toIntOrNull() ?: continue
                var fatorial = 1

                for(i in 1..n){
                    fatorial *= i
                }
                println("O fatorial é $fatorial")
            }

            2 ->{
                print("Digite um número: ")
                val n = readLine()?.toIntOrNull()?:continue
                val quadrado = n*n

                println("O quadrado deste número é $quadrado")
            }

            3 ->{
                print("Digite o raio da lata: ")
                val r = readLine()?.toIntOrNull()?:continue
                print("Digite a altura da lata: ")
                val h = readLine()?.toDoubleOrNull()?:continue

                val volume = 3.15149 * r * r * h

                println("O volume da lata é de$volume")
            }

            4 ->{
                println("Saindo do programa...")
                break
            }
            else -> println("Opção inválida")
        }
    }
}