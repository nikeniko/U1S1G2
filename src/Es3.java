import java.util.Scanner;

public class Es3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.print("Inserisci una stringa (o :q per uscire): ");
            input = scanner.nextLine();

            if (!input.equals(":q")) {
                StringBuilder risultato = new StringBuilder();

                for (int i = 0; i < input.length(); i++) {
                    risultato.append(input.charAt(i));
                    if (i < input.length() - 1) {
                        risultato.append(",");
                    }
                }

                System.out.println(risultato.toString());
            }
        } while (!input.equals(":q"));

        System.out.println("Programma terminato.");
        scanner.close();
    }
}