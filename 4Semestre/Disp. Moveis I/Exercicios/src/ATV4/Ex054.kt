package ATV4

fun main(){
    val notas1 = linkedMapOf<Double, String>()
    notas1.put(6.0,"Ana")
    notas1.put(4.5,"Bia")
    notas1.put(8.0,"Clara")
    notas1.put(6.0,"Diana")
    notas1.put(10.0,"Ester")

    val notas2 = linkedMapOf<Double, String>()
    notas2.put(7.5,"Ana")
    notas2.put(2.5,"Bia")
    notas2.put(6.0,"Clara")
    notas2.put(5.5,"Diana")
    notas2.put(10.0,"Ester")

    val medias = linkedMapOf<String, Double>()

    for (nome in notas1.values){
        val nota1 = notas1.entries.find {it.value == nome} ?.key ?: 0.0
        val nota2 = notas2.entries.find {it.value == nome} ?.key ?: 0.0
        medias[nome] = (nota1 + nota2) /2
    }
    println(medias)
}
