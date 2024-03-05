package es_3;
import java.util.Scanner;

public class Esercizio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Inserisci un numero compreso tra 0 e 3: ");
        int num = scanner.nextInt();

        if (num >= 0 && num <= 3) {
            switch (num) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("Uno");
                    break;
                case 2:
                    System.out.println("Due");
                    break;
                case 3:
                    System.out.println("Tre");
                    break;
            }
        } else {
            System.out.println("Errore: Il numero non è compreso tra 0 e 3");
        }
    }
}