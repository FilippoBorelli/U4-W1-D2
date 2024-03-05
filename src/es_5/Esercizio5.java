package es_5;
import java.util.Scanner;

public class Esercizio5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci un numero intero: ");
        int number = scanner.nextInt();

        System.out.println("Conto alla rovescia da " + number + " fino a zero:");
        for (int i = number; i >= 0; i--) {
            System.out.println(i);
        }

        scanner.close();
    }
}