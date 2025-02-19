package lanchonete.atendimento.cozinha;

public class Cozinheiro {
    // Pode ser defaut
    public void adicionarLancheNoBalcao() {
        System.out.println("Lanche adicionado no balcão");
    }

    // Pode ser defaut
    public void adicionarSucoNoBalcao() {
        System.out.println("Suco adicionado no balcão");
    }

    // Pode ser defaut
    public void adicionarComboNoBalcao() {
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }

    private void prepararLanche() {
        System.out.println("Lanche preparado (hamburguer)");
    }

    private void prepararSuco() {
        System.out.println("Suco preparado (laranja)");
    }

    @SuppressWarnings("unused")
    private void prepararCombo() {
        prepararLanche();
        prepararSuco();
    }

    @SuppressWarnings("unused")
    private void selecionarIgredientesLanche() {
        System.out.println("Ingredientes selecionados (pão, carne, salada, ovo, queijo)");
    }

    @SuppressWarnings("unused")
    private void selecionarIgredientesVitamina() {
        System.out.println("Ingredientes selecionados (fruta, açucar, leite)");
    }

    @SuppressWarnings("unused")
    private void lavarIgredientes() {
        System.out.println("Ingredientes lavados");
    }

    @SuppressWarnings("unused")
    private void baterVitaminaLiquidificador() {
        System.out.println("Vitamina batida no liquidificador");
    }

    @SuppressWarnings("unused")
    private void fritarIgredientesLanche() {
        System.out.println("Ingredientes fritos (carne, ovo)");
    }

    /* Ação indisponível para o pacote cozinha
    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }
    */
    @SuppressWarnings("unused")
    private void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }
    @SuppressWarnings("unused")
    private void pedirIgreientes(Almoxarife meuAmigo) {
        meuAmigo.entregarIngredientes();
    }
}
