package d03_06_2022;

public class Main {
    public static void main(String[] args) {

        Korpa korpa = new Korpa();
        Ambalaza PET = new Tetrapak("8600037650043", "Voda", 500, 510, true, 120);
        Ambalaza staklo = new StaklenaAmbalaza("8600105004501", "Pivo Stella", 500, 520, 100., false, 105);

        SuperKartica kart = new SuperKartica("3665447789", "Mitar Mitrovic", 50);

        korpa.dodajAmbalazu(PET);
        korpa.dodajAmbalazu(staklo);

        System.out.println("Ukupna cena korpe je: " + korpa.ukupnaCenaKorpe(kart));
        Ambalaza papirnaKesa = new PapirnaKesa();
        PapirnaKesa pp = (PapirnaKesa) papirnaKesa;
        pp.setVrstaPapira("reciklirani papir");
        System.out.println("Cena kese je: " + pp.cena());
        papirnaKesa.stampa();
    }

}
