package d31_05_2022;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        Igrac igrac1 = new Igrac("Vlade", "Divcevic", "24039780036", 1978, 99, "Napadac", false);

        Igrac igrac2 = new Igrac("Stanko", "Pantic", "15069890036", 1989, 55, "Odbrambeni", true);


        Trener trener1 = new Trener("Petko", "Petkovic", "11099700036", 1970, 8, "licni");

        Trener trener2 = new Trener("Mile", "Milic", "30049630036", 1963, 17, "pomocni");


        igrac1.stampaj();

        igrac2.stampaj();

        trener1.stampaj();

        trener2.stampaj();

    }
}
