
public class Main {
    public static void main(String[] args) {
    Livro livro1 = new Livro();
    livro1.nome = "Java 8 Pratico";
    livro1.descricao = "Aprendendo Java na Pratica";
    livro1.valor = 59.90;
    livro1.isbn = "123-5534-31231";
    livro1.autor = new Autor();
    livro1.autor.nome = "Rodrigo";


    livro1.mostrarDetalhes();
    }
}
