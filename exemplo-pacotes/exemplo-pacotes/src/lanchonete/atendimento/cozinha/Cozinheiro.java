package lanchonete.atendimento.cozinha;

import lanchonete.atendimento.Atendente;

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

    public void prepararLanche() {
        System.out.println("Lanche preparado (hamburguer)");
    }

    public void prepararSuco() {
        System.out.println("Suco preparado (laranja)");
    }

    public void prepararCombo() {
        prepararLanche();
        prepararSuco();
    }

    public void selecionarIgredientesLanche() {
        System.out.println("Ingredientes selecionados (pão, carne, salada, ovo, queijo)");
    }

    public void selecionarIgredientesVitamina() {
        System.out.println("Ingredientes selecionados (fruta, açucar, leite)");
    }

    public void lavarIgredientes() {
        System.out.println("Ingredientes lavados");
    }

    public void baterVitaminaLiquidificador() {
        System.out.println("Vitamina batida no liquidificador");
    }

    public void fritarIgredientesLanche() {
        System.out.println("Ingredientes fritos (carne, ovo)");
    }

    public void pedirParaTrocarGas(Atendente meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirParaTrocarGas(Almoxarife meuAmigo) {
        meuAmigo.trocarGas();
    }

    public void pedirIgreientes(Almoxarife meuAmigo) {
        meuAmigo.entregarIngredientes();
    }
}
