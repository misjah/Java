package d30_05_2022;
//Napisati klasu Student koja ima
//●	broj indeksa
//●	ime i prezime
//●	tip studija (osnovne, master, doktorske)
//●	niz ispita
//●	konstuktore koje mislite da ce vam trebati
//●	gettere i settere za indeks, ime i prezime, tip studija
//●	getter za niz predmeta
//●	metodu dodaj ispit u niz ispita
//●	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//●	metodu stampaj koja stampa u formatu:
//(broj indeksa) - (ime i prezime) - (tip studija)
//Predmeti:
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//(naziv predmeta) - (profesor) - (ocena)
//Prosecna ocena: (prosecna ocena)
    import java.util.ArrayList;
public class Student {
    private int brIndeksa;
    private String punoIme;
    private String tipStudija;
    private ArrayList<Ispit> ispiti = new ArrayList<>();
    public Student(int brIndeksa, String punoIme, String tipStudija) {
        this.brIndeksa = brIndeksa;
        this.punoIme = punoIme;
        this.tipStudija = tipStudija;
    }

    public void dodaj(Ispit ispit) {
        this.ispiti.add(ispit);
    }
    public double prosek() {
        double prosek = 0;
        int polozeniIspiti = 0;
        for (int i = 0; i < ispiti.size(); i++) {
            if (this.ispiti.get(i).getOcena() > 5) {
                prosek = prosek + this.ispiti.get(i).getOcena();
                polozeniIspiti++;
            }
        }
        return prosek / polozeniIspiti;
    }

    public void stampaj() {
        System.out.println("Br indeksa: " + this.brIndeksa + " Ime i Prezime: " + this.punoIme +
                " Tip studija: " + this.tipStudija);
        for (int i = 0; i < this.ispiti.size(); i++) {
            System.out.println(this.ispiti.get(i).getNazivPredmeta() + " - " + this.ispiti.get(i).getImePrezimeProfesora() +
                    " - " + this.ispiti.get(i).getOcena());
        }
    }
}


