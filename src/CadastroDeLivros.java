class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.nome = "Rodrigo Turini";
        autor.email = "rodrigo.turini@gmail.com";
        autor.cpf = "123.456.789.10";

        Livro livro = new Livro();
        livro.nome = "Java 8 Prático";
        livro.descricao = "Novos recursos da linguagem";
        livro.valor = 59.90;
        livro.isbn = "978-85-66250-46-6";
        livro.autor = autor;

        livro.MostrarDetalhes();
        autor.MostrarDetalhes();
        // livro.autor.nome = "Guilherme Silveira";
        // System.out.println(autor.nome);

        /*
         * Autor outroautor = new Autor();
         * outroautor.nome = "Ivan Meirelles";
         * outroautor.email = "ivanmeirellesgmail.com";
         * outroautor.cpf = "789.456.123.30";
         * 
         * Livro outrolivro = new Livro();
         * outrolivro.nome = "Lógica de Programação";
         * outrolivro.descricao = "Crie seus primeiros programas";
         * outrolivro.valor = 89.90;
         * outrolivro.isbn = "978-85-66255-33-0";
         * outrolivro.autor = outroautor;
         * 
         * outrolivro.MostrarDetalhes();
         * outroautor.MostrarDetalhes();
         */

        if (!livro.aplicaDescontoDe(0.3)) {
            System.out.println("Desconto não pode ser maior do que 30%");
        } else {
            System.out.println("Valor com desconto: " + livro.valor);
        }
    }
}