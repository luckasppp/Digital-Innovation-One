package lanchonete;

import lanchonete.area.cliente.Cliente;
import lanchonete.atendimento.Atendente;
// import lanchonete.atendimento.cozinha.Almoxarife; // Não é necessário
import lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        // Ações que não precisam estar disponíveis para toda aplicação
        //cozinheiro.lavarIgredientes();                // Não é acessível por causa do modificador de acesso
        //cozinheiro.selecionarIgredientesVitamina();   // Não é acessível por causa do modificador de acesso
        //cozinheiro.baterVitaminaLiquidificador();     // Não é acessível por causa do modificador de acesso
        //.prepararSuco();                              // Não é acessível por causa do modificador de acesso
        //cozinheiro.selecionarIgredientesLanche();     // Não é acessível por causa do modificador de acesso
        //cozinheiro.fritarIgredientesLanche();         // Não é acessível por causa do modificador de acesso
        //cozinheiro.prepararLanche();                  // Não é acessível por causa do modificador de acesso

        // Ações que o estabelecimento precisa ter ciência
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        //Almoxarife almoxarife = new Almoxarife();     // Não necessário existir no main
        // Ações que não precisam estar disponíveis para toda aplicação
        //almoxarife.controlarEntrada();                // Não é acessível por causa do modificador de acesso
        //almoxarife.controlarSaida();                  // Não é acessível por causa do modificador de acesso
        // Ações que somente o pacote cozinha precisa ter ciência (default)
        //almoxarife.entregarIngredientes();            // Não é acessível por causa do modificador de acesso
        //almoxarife.trocarGas();                       // Não é acessível por causa do modificador de acesso

        Atendente atendente = new Atendente();
        // Ações que não precisam estar disponíveis para toda aplicação
        //atendente.pegarLancheCozinha();               // Não é acessível por causa do modificador de acesso
        atendente.receberPagamento();
        atendente.servirMesa();

        // Ações que somente o seu pacote cozinha precisa conhecer (default)
        //atendente.trocarGas();               // Não é acessível por causa do modificador de acesso

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        // Não deveria, mas o estabelecimento não definiu normas de atendimento
        // cliente.pegarPedidoBalcao(); // Método deixou de existir no Cliente

        // Ação sigilosa e ninguém além do próprio cliente deveria ter acesso
        //cliente.consultarSaldoAplicativo();           // Não é acessível por causa do modificador de acesso

        // Pegaria mal o cliente ficar sabendo disso
        // cozinheiro.pedirParaTrocarGas(atendente);    // Não é acessível por causa do modificador de acesso
        // cozinheiro.pedirParaTrocarGas(almoxarife);   // Não é acessível por causa do modificador de acesso
    }
}
