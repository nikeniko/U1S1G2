import java.util.Scanner;


public class Es2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("inserisci un numero tra 0 e 3: ");
        int numero = scanner.nextInt();

        String numeroInLettere;

        switch (numero) {
            case 0:
                numeroInLettere = "zero";
                break;
            case 1:
                numeroInLettere = "uno";
                break;
            case 2:
                numeroInLettere = "due";
                break;
            case 3:
                numeroInLettere = "tre";
                break;
            default:
                numeroInLettere = "Errore: il numero inserito non è compreso tra 0 e 3.";
                break;
        }
        System.out.println(numeroInLettere);
    }


}
