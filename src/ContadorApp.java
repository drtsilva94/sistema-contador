

import java.util.Scanner;

public class ContadorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o primeiro número:");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int numero2 = scanner.nextInt();

            if (numero1 > numero2) {
                throw new IllegalArgumentException("O primeiro número deve ser menor ou igual ao segundo.");
            }

            System.out.println("Contagem:");
            for (int i = numero1; i <= numero2; i++) {
                System.out.println(i);
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira números inteiros.");
        } finally {
            scanner.close();
        }
    }
}
