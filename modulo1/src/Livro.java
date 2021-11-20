public class Livro {
    String nome;
    String descricao;
    double valor;
    String isbn;
    Autor autor;

    void mostrarDetalhes(){
        System.out.println("-- Detalhes do Livro --");
        System.out.println("Nome: "+this.nome);
        System.out.println("Descrição: "+this.descricao);
        System.out.println("Valor: "+this.valor);
        System.out.println("ISBN: "+this.isbn);

        if (temAutor())
            this.autor.mostrarDetalhes();

    }

    boolean temAutor() {
        return this.autor != null;
    }
}
