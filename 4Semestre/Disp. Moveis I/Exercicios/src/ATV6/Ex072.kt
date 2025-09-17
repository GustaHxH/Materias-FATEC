package ATV6

data class Aluno(val nome: String, val municipio: String)

fun main(){
    val alunos = listOf(
        Aluno("João", "Diadema"),
        Aluno("Lucas", "SBC"),
        Aluno("Pedro", "Diadema"),
        Aluno("Paulo", "São Paulo"),
        Aluno("Kevyn", "SBC"),
        Aluno("Alice", "Diadema"),
        Aluno("Maria", "Diadema"),
        Aluno("Linna", "SBC"),
        Aluno("Lorax", "São Paulo"),
        Aluno("Dracula", "Diadema")
    )

    val alunosDeDiadema = alunos.filter { it.municipio == "Diadema"}
    println(alunosDeDiadema)
}