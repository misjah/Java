package d03_06_2022;
//    Kreirati klasu StaklenaAmbalaza koja nasledjuje klasu Ambalaza koja ima:
//    kaucija za flasu
//    atribut koji kaze da li se za flasu placa kaucija
//    osnovna cena
//    gettere i setter za atribute
//    konstuktori koji su vam potrebni
//    racuna cenu
//    ako se kaucija placa, (osnovna cena) * 1.2 + (kaucija);
//    ako se ne placa, (osnovna cena) * 1.2
//    metoda stampaj stampa sve podatke iz klase staklena flasa.
    public class StaklenaAmbalaza extends Ambalaza{


    private double kaucija;
    private boolean placaSeKaucija;
    private double osnovnaCena;

    public StaklenaAmbalaza(String barkod, String naziv, double neto, double bruto, double kaucija,
                            boolean placaSeKaucija, double osnovnaCena) {
        super(barkod, naziv, neto, bruto);
        this.kaucija = kaucija;
        this.placaSeKaucija = placaSeKaucija;
        this.osnovnaCena = osnovnaCena;
    }

    public double getKaucija() {
        return kaucija;
    }

    public void setKaucija(double kaucija) {
        this.kaucija = kaucija;
    }

    public boolean isPlacaSeKaucija() {
        return placaSeKaucija;
    }

    public void setPlacaSeKaucija(boolean placaSeKaucija) {
        this.placaSeKaucija = placaSeKaucija;
    }

    public double getOsnovnaCena() {
        return osnovnaCena;
    }

    public void setOsnovnaCena(double osnovnaCena) {
        this.osnovnaCena = osnovnaCena;
    }
    @Override
    public double cena(){
        if (placaSeKaucija){
            return this.osnovnaCena * 1.2 + this.kaucija;
        }else {
            return this.osnovnaCena * 1.2;
        }
    }
    @Override
    public void stampa(){
        System.out.println("Naziv: " + this.artikl + " Barkod: " + this.barkod + " Cena: " + cena());
    }
}