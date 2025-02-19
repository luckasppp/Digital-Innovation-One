package lanchonete.atendimento;

public class Atendente {
    public void servirMesa () {
        pegarLancheCozinha();
        System.out.println("Mesa servida");
    }

    private void pegarLancheCozinha() {
        System.out.println("Lanche retirado da cozinha");
    }

    public void receberPagamento() {
        System.out.println("PagamentoRecebido");
    }

    void trocarGas() {
        System.out.println("Gás trocado (Atendente)");
    }

    @SuppressWarnings("unused")
    private void pegarPedidoBalcao () {
        System.out.println("Pedido retirado do balcão");
    }
}
