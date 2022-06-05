package d03_06_2022;

// ovo sam ja nesto dodavao-isprobavao
public class PapirnaKesa extends Ambalaza {

    private String vrstaPapira;

    public PapirnaKesa(){
        super();
    }

    public PapirnaKesa(String vrstaPapira, String barkod, String artikl, double netoTezina, double brutoTezina) {
        super(barkod, artikl, netoTezina, brutoTezina);
        this.vrstaPapira = vrstaPapira;
    }

    public String getVrstaPapira() {
        return vrstaPapira;
    }

    public void setVrstaPapira(String vrstaPapira) {
        this.vrstaPapira = vrstaPapira;
    }

    @Override
    public double cena() {
        return 5;
    }

    @Override
    public void stampa() {
        System.out.println("Vrsta materijala: " + vrstaPapira);
    }
}
