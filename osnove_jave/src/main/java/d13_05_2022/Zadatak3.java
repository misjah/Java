package d13_05_2022;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.SortedMap;
//3.	Napisati program koji ima niz brojeva duzine 10.
// Niz je fiksnih vrednosti (ne u nosi ih korisnik) a zatim se od korisnika ucitava pozicija elementa koji zeli da izbaci iz niza.
// Pre i nakon izbacivanja ispisati niz na ekranu. Ukoliko korisnik unese poziciju van opsega niza, ispisati poruku o gresci.
public class Zadatak3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> niz = new ArrayList<Integer>();
        niz.add(1);niz.add(3);niz.add(6);niz.add(7);niz.add(1);
        niz.add(3);niz.add(4);niz.add(2);niz.add(9);

        System.out.println("Niz je: "+niz);
        System.out.print("Unesite poziciju za izbacivanje: ");
        int poz = sc.nextInt();
        if (poz >= niz.size()){
            System.out.print("Uneli ste nevalidnu poziciju!");
        }else {
            niz.remove(poz);
            System.out.println("Niz nakon brisanja je: " + niz);
        }
    }
}
