package lanchonete.atendimento.cozinha;

public class Almoxarife {
    @SuppressWarnings("unused")
    private void controlarEntrada() {
        System.out.println("Entrada controlada dos itens");
    }

    private void controlarSaida() {
        System.out.println("Saída controlada dos itens");
    }

    void entregarIngredientes() {
        System.out.println("Ingredientes entregues");
        controlarSaida();
    }

    void trocarGas() {
        System.out.println("Gás trocado (Almoxarife)");
    }
}
