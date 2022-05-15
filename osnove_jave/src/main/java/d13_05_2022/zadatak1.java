package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class zadatak1 {
    public static void main(String[] args) {
        ArrayList<Integer> niz = new ArrayList<Integer>();
        Scanner s = new Scanner(System.in);
        niz.add(5);niz.add(7);niz.add(3);niz.add(4);
        niz.add(5);niz.add(6);niz.add(1);niz.add(8);niz.add(2);
        niz.add(1);niz.add(5);niz.add(3);niz.add(4);niz.add(5);
        niz.add(2);niz.add(7);niz.add(8);niz.add(6);
        niz.add(1);niz.add(4);
        niz.add(6);niz.add(2);niz.add(5);niz.add(6);niz.add(8);

        int suma = 0;
        int nagore = 0;
        int nalevo = 0;
        int nadesno = 0;
        int nadole = 0;

        for (int i = 0; i < niz.size(); i++) {
            System.out.print(niz.get(i) + ", ");
            if (i % 5 == 4) {
                System.out.println();

            }

        }
        System.out.print("Unesite poziciju k: ");
        int k = s.nextInt();
        int vrednost = niz.get(k);

        if (k - 5 >= 0) {
            nagore = niz.get(k - 5);
        } else nagore = 0;

        if ((k - 1) < 0 || (k - 1) % 5 == 4) {
            nalevo = 0;
        } else nalevo = niz.get(k - 1);

        if ((k + 1) % 5 == 0) {
            nadesno = 0;
        } else nadesno = niz.get(k + 1);

        if (k + 5 < 25) {
            nadole = niz.get(k + 5);
        } else nadole = 0;

        suma = vrednost + nagore + nalevo + nadesno + nadole;
        System.out.println("Suma je: " + suma);

    }
}
