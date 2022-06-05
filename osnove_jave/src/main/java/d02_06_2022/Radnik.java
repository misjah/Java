package d02_06_2022;
//Kreirati abstraktnu klasu Radnik koja ima:
// ime i prezime
// niz sektora u kojima radi
// abstraktnu metodu koja vraca platu radnika
// metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
    import java.util.ArrayList;

    public abstract class Radnik {

    protected String punoIme;
    protected ArrayList<Sektor> sektorNiz = new ArrayList<>();
    public abstract double plataRadnika();
    public void zaposliUSektor (Sektor nazivSektora) {
        sektorNiz.add(nazivSektora);
    }

    public Radnik(String punoIme) {
        this.punoIme = punoIme;

    }

    public String getPunoIme() {
        return punoIme;
    }

    public ArrayList<Sektor> getSektorNiz() {
        return sektorNiz;
    }
}
