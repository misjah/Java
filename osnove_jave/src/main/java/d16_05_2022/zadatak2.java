package d16_05_2022;

import java.util.Scanner;
//2.	Napisati funkciju koja za dva jednocifrena broja koja su ulazni parametri funkcije vraca novu vrednost koja se formira kao na primeru:
//ako je prvi broj =2, a drugi =3 vraca novu vrednost 23.
//ako je prvi broj =6, a drugi =2 vraca novu vrednost 62.
public class zadatak2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite prvi jednocifreni broj: ");
        int a = sc.nextInt();
        System.out.print("Unesite drugi jednocifreni broj: ");
        int b = sc.nextInt();
        spaja(a, b);


    }

    private static void spaja(int a, int b) {
        System.out.print(a);
        System.out.print(b);


    }



    }

