package es_1;

public class Esercizio1 {
    public static void main(String[] args) {
        String inputString = "ciao";
        boolean isEvenLength = checkStringLength(inputString);
        System.out.println("Is the length of the string even? " + isEvenLength);
    }

    public static boolean checkStringLength(String stringa1) {
        if (stringa1.length() % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
}