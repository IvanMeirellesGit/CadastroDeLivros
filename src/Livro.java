public class Livro {

    private String nome;
    private String descricao;
    private double valor;
    private String isbn;
    private Autor autor;

    public Livro() {
        System.out.println("Novo livro criado!");
    } // Construtor da classe Livro

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void MostrarDetalhes() {
        System.out.println("--");
        String mensagemLivro = "Mostrando detalhes do livro ";
        System.out.println(mensagemLivro);
        System.out.println("--");
        System.out.println("Nome: " + getNome());
        System.out.println("Descrição: " + getDescricao());
        System.out.println("Valor: " + getValor());
        System.out.println("Isbn: " + getIsbn());

        if (this.temAutor()) {
            getAutor().MostrarDetalhes();
        }
        System.out.println("--");
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= getValor() * porcentagem;
        return true;
    }

    public boolean temAutor() {
        return this.getAutor() != null;
    }
}