class CadastroDeLivros {

    public static void main(String[] args) {

        Autor autor = new Autor();
        autor.setNome("Rodrigo Turini");
        autor.setEmail("rodrigo.turini@gmail.com");
        autor.setCpf("123.456.789.10");

        Livro livro = new Livro();
        livro.setNome("Java 8 Prático");
        livro.setDescricao("Novos recursos da linguagem");
        livro.setValor(59.90);
        livro.setIsbn("978-85-66250-46-6");
        livro.setAutor(autor);

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
            System.out.println("Valor com desconto: " + livro.getValor());
        }

    }
}