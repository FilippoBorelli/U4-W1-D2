package es_4;
import java.util.Scanner;

public class Esercizio4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Inserisci una stringa (digita ':q' per uscire): ");
            String input = scanner.nextLine();

            if (input.equals(":q")) {
                System.out.println("Programma terminato.");
                break;
            }

            StringBuilder output = new StringBuilder();
            for (int i = 0; i < input.length(); i++) {
                output.append(input.charAt(i));
                if (i != input.length() - 1) {
                    output.append(",");
                }
            }
            System.out.println("Stringa suddivisa in caratteri separati dalla virgola: " + output);
        }
        scanner.close();
    }
}
