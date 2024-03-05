package es_2;

public class Esercizio2 {
    public static void main(String[] args) {
        int year = 2024;
        boolean isLeapYear = isLeap(year);
        System.out.println("Is " + year + " a leap year? " + isLeapYear);
    }

    public static boolean isLeap(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            return true;
        } else {
            return false;
        }
    }
}
