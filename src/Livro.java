public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    public Livro() {
        System.out.println("Novo livro criado!");
    }

    void MostrarDetalhes() {
        String mensagemLivro = "Mostrando detalhes do livro ";
        System.out.println(mensagemLivro);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Isbn: " + isbn);

        if (this.temAutor()) {
            autor.MostrarDetalhes();
        }
        System.out.println("--");
    }

    public boolean aplicaDescontoDe(double porcentagem) {
        if (porcentagem > 0.3) {
            return false;
        }
        this.valor -= this.valor * porcentagem;
        return true;
    }

    public boolean temAutor() {
        return this.autor != null;
    }
}