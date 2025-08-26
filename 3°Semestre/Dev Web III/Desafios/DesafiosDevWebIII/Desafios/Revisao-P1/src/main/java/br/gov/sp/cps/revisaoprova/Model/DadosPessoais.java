package br.gov.sp.cps.revisaoprova.Model;

public class DadosPessoais {
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //usar os mesmos nomes que estão no input do formulario
    private String nome;
    private int idade;
    private double altura;


}
