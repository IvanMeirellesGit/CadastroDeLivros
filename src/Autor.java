public class Autor {
    String nome;
    String email;
    String cpf;

    void MostrarDetalhes() {
        String mensagemAutor = "Mostrando detalhes do autor ";
        System.out.println(mensagemAutor);
        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("CPF: " + cpf);
    }
}
