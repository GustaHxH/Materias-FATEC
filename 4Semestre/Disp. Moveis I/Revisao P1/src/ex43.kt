fun main(){
    var soma :Int = 0
    for(i in 1..500){
        if( i % 2 == 0){
            soma += i
        }
    }
    println("A soma dos valores pares entre 1 e 500 é de $soma")
}
