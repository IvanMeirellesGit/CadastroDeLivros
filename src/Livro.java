public class Livro {

    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void MostrarDetalhes() {
        String mensagem = "Mostrando detalhes do livro ";
        System.out.println(mensagem);
        System.out.println("Nome: " + nome);
        System.out.println("Descrição: " + descricao);
        System.out.println("Valor: " + valor);
        System.out.println("Isbn: " + isbn);
        System.out.println("- -");
    }
}