import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class AboutMe {
    public static void main(String[] args) throws Exception {
        Scanner scanner = null;
        try {
            scanner = new Scanner(System.in).useLocale(Locale.US);
            try {
                System.out.println("Digite o seu nome");
                String nome = scanner.next();

                System.out.println("O seu sobrenome");
                String sobrenome = scanner.next();

                System.out.println("A sua idade");
                int idade = scanner.nextInt();

                System.out.println("A sua altura");
                double altura = scanner.nextDouble();

                // Imprimindo os dados obtidos do usuário
                System.out.println("Nome: " + nome);
                System.out.println("Sobrenome: " + sobrenome);
                System.out.println("Idade: " + idade);
                System.out.println("Altura: " + altura);
            } catch (InputMismatchException e) {
                System.out.println("Os campos idade e altura devem ser numéricos");
            }
        } finally {
            scanner.close();
        }
    }
}