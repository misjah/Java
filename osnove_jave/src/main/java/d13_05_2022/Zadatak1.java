package d13_05_2022;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
//1.	Napisati program koji ima niz brojeva od 25 elemenata, koji izgleda kao tabela 5x5.
// Niz je fiksnih vrednosti (ne unosi ih korisnik) zatim korisnik unosi poziciju za koju se racuna suma.
//Suma za poziciju se racuna tako sto se na vrednost tog polja dodaju vrednosti elemenata iznad, ispod,
// sleve i sdesne strane tog elementa (Ukoliko ti elementi postoje, vodite racuna da ne izadjete van opsega niza)
//Za racunanje sume, nije potrebna petlja!
public class Zadatak1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Unesite poziciju: ");
        int pozicija = sc.nextInt();
        int suma = 0;

        //za ovaj sam se pogubio skroz, nesto sam cackao sa net-a

        List<Integer> nizBrojeva = new ArrayList<>();
        System.out.println("2,4,6,7,4,");
        nizBrojeva.addAll(Arrays.asList(2,4,6,7,4));
        System.out.println("4,2,5,1,4,");
        nizBrojeva.addAll(Arrays.asList(4,2,5,1,4));
        System.out.println("1,4,9,4,5,");
        nizBrojeva.addAll(Arrays.asList(1,4,9,4,5));
        System.out.println("4,8,5,4,7,");
        nizBrojeva.addAll(Arrays.asList(4,8,5,4,7));
        System.out.println("4,4,7,4,1,");
        nizBrojeva.addAll(Arrays.asList(4,4,7,4,1));

        if(pozicija > 0 && pozicija < 26) {
            suma += nizBrojeva.get(pozicija - 1);
        }
        if(pozicija -1 > 0 && pozicija - 1 < 26) {
            suma += nizBrojeva.get(pozicija -1 - 1);
        }
        if(pozicija + 1> 0 && pozicija + 1 < 26) {
            suma += nizBrojeva.get(pozicija +1 - 1);
        }
        if(pozicija - 5 > 0 && pozicija - 5 < 26) {
            suma += nizBrojeva.get(pozicija -5 - 1);
        }
        if(pozicija + 5 > 0 && pozicija + 5 < 26) {
            suma += nizBrojeva.get(pozicija +5 - 1);
        }

        System.out.println("Suma brojeva je: " + suma);
    }



    }

