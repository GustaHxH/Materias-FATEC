fun main(){
    val A = linkedSetOf<Int>()
    for(i in 1..10){
            A.add(i)
    }

    val B = linkedSetOf<Int>()
    for(i in 1..10){
        B.add(i*2)
    }

    println(A)
    println(B)
}
