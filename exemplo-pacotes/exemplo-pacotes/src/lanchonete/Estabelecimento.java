package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
import lanchonete.atendimento.cozinha.Almoxarife;
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // Ações que não precisam estar disponíveis para toda aplicação
        cozinheiro.lavarIgredientes();
        cozinheiro.selecionarIgredientesVitamina();
        cozinheiro.baterVitaminaLiquidificador();
        cozinheiro.prepararSuco();
        cozinheiro.selecionarIgredientesLanche();
        cozinheiro.fritarIgredientesLanche();
        cozinheiro.prepararLanche();

        // Ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        // Ações que não precisam estar disponíveis para toda aplicação
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        // Ações que somente o pacote cozinha precisa ter ciência (default)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        // Ações que não precisam estar disponíveis para toda aplicação
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servirMesa();

        // Ações que somente o seu pacote cozinha precisa conhecer (default)
        atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // Não deveria, mas o estabelecimento não definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        // Ação sigilosa e ninguém além do próprio cliente deveria ter acesso
        cliente.consultarSaldoAplicativo();

        // Pegaria mal o cliente ficar sabendo disso
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);
    }
}
