public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa();

        marcos.setEndereço("Rua Argentina, Jardim Maringá");

        // Como definir o nome e o cpf de marcos?

        //Imprimindo o Marcos sem nome e cpf
        System.out.println("Marcos: " + marcos.getNome() + " - " + marcos.getCpf() + " - " + marcos.getEndereço());
    }
}
