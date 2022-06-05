package d31_05_2022;
//Kreirati klasu Osoba koja ima:
//-	ime i prezime
//-	jmbg
//-	godinu rodjenja
//-	default-ni konstuktor
//-	konstuktor sa parametrima
//-	gettere i settere
//-	metodu stampaj koja stampa u formatu:
//(ime i prezime), (jmbg), (godina rodjenja)
public class Osoba {
    protected String ime;
    protected String prezime;
    protected String jmbg;
    protected int godinaRodjenja;

    public Osoba() {
    }

    public Osoba(String ime, String prezime, String jmbg, int godinaRodjenja) {
        this.ime = ime;
        this.prezime = prezime;
        this.jmbg = jmbg;
        this.godinaRodjenja = godinaRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public String getJmbg() {
        return jmbg;
    }

    public void setJmbg(String jmbg) {
        this.jmbg = jmbg;
    }

    public int getGodinaRodjenja() {
        return godinaRodjenja;
    }

    public void setGodinaRodjenja(int godinaRodjenja) {
        this.godinaRodjenja = godinaRodjenja;
    }
    public void stampaj(){
        System.out.println("Ime i prezime: " + this.ime + " " + this.prezime + ", "  + "jmbg: " + this.jmbg + ", Godina rodjenja: " + this.godinaRodjenja);
    }
}