fun main(){
    println("Digite a temperatura em C°")
    val celcius = readLine()?.toDoubleOrNull() ?: return println("Número inválido!")

    val fahrenheit = (9.0 * celcius + 160.0)/ 5.0
    println("A temperafura convertida em F° é de: $fahrenheit")
}