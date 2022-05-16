package d16_05_2022;

import java.util.Scanner;
//4.	Metoda prima dva parametra N i karakter za stampu. Metoda stampa N karaktera.
//Ako se za N prosledi 5 i za karakter prosledi npr kosa crta (/) stampa se=>
/// / / / /
public class zadatak4 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        int n = 0;
        print(3, ">");
    }

    static void print(int n, String simbol) {
        for (int i = 1; i <= n; i++) {
            System.out.print(simbol);
        }
    }
}