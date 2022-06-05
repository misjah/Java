package d30_05_2022;
//Napisati klasu Ispit koja ima
//●	naziv predmeta
//●	ocenu (u rasponu od 5 do 10)
//●	Ime i prezime profesora koji predaje predmet
//●	konstuktore koje mislite da ce vam trebati
//●	gettere i settere za sve atribute
//●	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//●	metodu koja stampa ispit u formatu:
//(naziv predmeta) - (profesor) - (ocena)
public class Ispit {
    private String nazivPredmeta;
    private int ocena;
    private String imePrezimeProfesora;

    public Ispit(String nazivPredmeta, int ocena, String imePrezimeProfesora) {
        this.nazivPredmeta = nazivPredmeta;
        this.ocena = ocena;
        this.imePrezimeProfesora = imePrezimeProfesora;
    }

    public Ispit() {
    }

    public String getNazivPredmeta() {
        return nazivPredmeta;
    }

    public void setNazivPredmeta(String nazivPredmeta) {
        this.nazivPredmeta = nazivPredmeta;
    }

    public int getOcena() {
        return ocena;
    }

    public void setOcena(int ocena) {
        this.ocena = ocena;
    }

    public String getImePrezimeProfesora() {
        return imePrezimeProfesora;
    }


    public void stampaj() {
        System.out.println(this.nazivPredmeta + " - " + this.imePrezimeProfesora + " - " + this.ocena);
    }
}