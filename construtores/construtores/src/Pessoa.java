public class Pessoa {
    private String nome;
    private String cpf;
    private String endereço;

    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public String getCpf() {
        return cpf;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    // ...
    // Setters de nome e cpf?
}