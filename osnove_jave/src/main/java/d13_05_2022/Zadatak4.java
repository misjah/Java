package d13_05_2022;

import java.util.Scanner;
//4.	Napisati program koji uci korisnika da kaze “Molim te”.
// Program od korisnika ucitava zahteve koje treba da izvrsi ali jedino reaguje ukoliko korisnik lepo zamoli ( u zahtevu unese “Molim te”).
// Ukoliko korisnik unese zahtev u vidu naredjivanja, program ne reaguje na takve zahteve tj. nista ne ispisuje,
// a ukoliko korisnik zamoli tada program ispisuje “Dogovoreno!”. Program radi dok korisnik ne unese “Hvala!”. Na kraju programa ispisati “Cao”
public class Zadatak4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String rec = "";

        while(!rec.contains("hvala") && !rec.contains("Hvala")) {
            System.out.println("Unesite zahtev: ");
            rec = sc.nextLine();
            if (rec.contains("molim te") || rec.contains("Molim te")) {
                System.out.println("Dogovoreno!");
            }
        }
        System.out.println("Cao");
    }
    }

