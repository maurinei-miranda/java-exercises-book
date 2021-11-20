public class Autor {
    String nome;
    String email;
    String cpf;


    void mostrarDetalhes(){
        System.out.println("-    Mostrando detalhes do autor");
        System.out.println("Nome do autor: "+ this.nome);
        System.out.println("Email do autor: "+ this.email);
        System.out.println("Cpf do autor: "+ this.cpf);

    }

}
