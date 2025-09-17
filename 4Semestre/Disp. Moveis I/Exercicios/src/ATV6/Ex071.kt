package ATV6

fun main(){
    val alunos = arrayListOf("Lucas", "Pedro", "Jonas", "Eduardo", "Vladmir")

    val alunosOrdenados = alunos.sortedBy { it }
    println(alunosOrdenados)
}