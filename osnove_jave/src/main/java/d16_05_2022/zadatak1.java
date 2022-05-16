package d16_05_2022;

import java.util.Scanner;

//1.	Napisati metodu stampajVrednostZa10Vecu u kojoj se stampa prosledjena vrednost za 10 veca.
// Iz main-a pozvati izvrsenje metode za razlicite vrednosti.
public class zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesi broj: ");
        int broj = sc.nextInt();
        stampajVrednostZa10Vecu(broj);

    }

    public static void stampajVrednostZa10Vecu(int uvecan) {
        int proiz = uvecan * 10;
        System.out.println("rezultat je: "+ proiz);
        System.out.println("rezultat je: " + uvecan * 10); //drugaciji nacin
    }
}

