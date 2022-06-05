package d03_06_2022;
//    Kreirati klasu Tetrapak koja nasledjuje klasu Ambalaza koja ima:
//    atribut koji kaze da li se moze reciklirati
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu tako da ispunjava uslova:
//    ako je od recikliranog materijala, ( tezina pakovanja ) * 1.5 + (osnovna cena);
//    ako nije u cenu ulazi samo osnovna cena
//    metoda stampaj stampa sve podatke iz klase tetrapak.

    public class Tetrapak extends Ambalaza{

    private boolean zaReciklazu;
    private double osnovnaCena;

    public Tetrapak(String barkod, String naziv, double neto, double bruto, boolean zaReciklazu, double osnovnaCena) {
        super(barkod, naziv, neto, bruto);
        this.zaReciklazu = zaReciklazu;
        this.osnovnaCena = osnovnaCena;
    }

    @Override
    public double cena(){
        if (zaReciklazu){
            return this.izracunajTezinu() * 1.5 + this.osnovnaCena;
        }else {
            return this.osnovnaCena;
        }
    }
    @Override
    public void stampa(){
        System.out.println("Naziv: " + this.artikl + " Barkod: " + this.barkod + " Cena: " + cena());
    }
}