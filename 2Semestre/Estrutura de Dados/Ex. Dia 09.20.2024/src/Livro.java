public class Livro
{
    String nomeautor;
    String titulo;
    int anolancamento;

    public Livro(String nomeautor, String titulo, int anolancamento)
    {
        this.nomeautor = nomeautor;
        this.titulo = titulo;
        this.anolancamento = anolancamento;
    }

    public String getNomeautor()
    {
        return nomeautor;
    }

    public void setNomeautor(String nomeautor)
    {
        this.nomeautor = nomeautor;
    }

    public String getTitulo()
    {
        return titulo;
    }

    public void setTitulo(String titulo)
    {
        this.titulo = titulo;
    }

    public int getAnolancamento()
    {
        return anolancamento;
    }

    public void setAnolancamento(int anolancamento)
    {
        this.anolancamento = anolancamento;
    }
}
