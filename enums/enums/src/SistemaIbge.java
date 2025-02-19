public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoDoBrasil estado : EstadoDoBrasil.values()) {
            System.out.println(estado.getNome() + " - " + estado.getSigla());
        }

        EstadoDoBrasil eb = EstadoDoBrasil.PA;
        System.out.println(eb.getNome() + " - " + eb.getSigla());
    }
}
