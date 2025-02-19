public class SistemaCadastro {
    public static void main(String[] args) {
        Pessoa marcos = new Pessoa("Marcos Selvo", "10102586395");

        marcos.setEndereço("Rua Argentina, Jardim Maringá");

        System.out.println(marcos.getNome() + " - " + marcos.getCpf() + " - " + marcos.getEndereço());
    }
}
