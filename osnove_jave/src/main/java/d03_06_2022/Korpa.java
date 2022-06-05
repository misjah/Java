package d03_06_2022;
//    Kreirati klasu Korpa koja ima:
//    niz ambalaza
//    metodu dodaj ambalazu
//    metodu izbaci ambalazu, u funkciju se prosledjuje barkod flase (String) koju treba izbaciti
//    privatnu metodu koja vraca cenu svih ambalaza sa popustom, metoda kao parametar prima popust.
//    metodu koja racuna i vraca ukupncu cenu korpe (sabira sve cene ambalze),
//    kao parametar funkcije se prima Super karticu iz koje se cita popust.

    import java.util.ArrayList;

    public class Korpa {

    private ArrayList<Ambalaza> ambalazaNiz = new ArrayList<>();

    public void dodajAmbalazu(Ambalaza ambalaza) {
        ambalazaNiz.add(ambalaza);
    }

    public ArrayList<Ambalaza> getAmbalazaNiz() {
        return ambalazaNiz;
    }

    public void setAmbalazaNiz(ArrayList<Ambalaza> ambalazaNiz) {
        this.ambalazaNiz = ambalazaNiz;
    }

    public void izbaciAmbalazu(String barkod) {
        for (int i = 0; i < ambalazaNiz.size(); i++) {
            if (ambalazaNiz.get(i).equals(barkod)) {
                ambalazaNiz.remove(i);
            }
        }
    }

    private double cenaSvihAmbalaza(double popust) {
        double suma = 0;
        for (int i = 0; i < ambalazaNiz.size(); i++) {
            suma += ambalazaNiz.get(i).cena();
        }
        return suma - popust;
    }
    public double ukupnaCenaKorpe(SuperKartica superKartica){
        double suma = 0;
        for (int i = 0; i < ambalazaNiz.size(); i++) {
            suma += ambalazaNiz.get(i).cena();
        }
        return suma - superKartica.getPopust();
    }
}
