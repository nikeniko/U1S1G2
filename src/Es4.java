import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int numero = scanner.nextInt();

        System.out.println("Conto alla rovescia:");

        for (int i = numero; i >= 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(1000); // Pausa di 1 secondo (1000 millisecondi)
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Il conto alla rovescia è stato interrotto.");
                break;
            }
        }

        System.out.println("Conto alla rovescia terminato.");
        scanner.close();
    }
}
