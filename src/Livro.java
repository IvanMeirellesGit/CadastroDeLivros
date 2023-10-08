public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

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

    public void aplicaDescontoDe(double porcentagem) {
        System.out.println("Valor atual livro é: " + this.valor);
        this.valor -= this.valor * porcentagem;

        System.out.println("Valor com Desconto 10% " + this.valor);
    }

    public boolean temAutor() {
        return this.autor != null;
    }
}