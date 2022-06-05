package d31_05_2022;
//Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//-	godine iskustva
//-	tip trenera (kondicioni, za igru, pomocni, personalni)
//-	metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.
public class Trener extends Osoba{
    public int godineIskustva;
    public String tipTrenera;

    public int getGodineIskustva() {
        return godineIskustva;
    }

    public void setGodineIskustva(int godineIskustva) {
        this.godineIskustva = godineIskustva;
    }

    public String getTipTrenera() {
        return tipTrenera;
    }

    public void setTipTrenera(String tipTrenera) {
        this.tipTrenera = tipTrenera;
    }

    public Trener(String ime, String prezime, String jmbg, int godinaRodj, int godineIskustva, String tipTrenera) {
        super(ime, prezime, jmbg, godinaRodj);

        this.godineIskustva = godineIskustva;

        this.tipTrenera = tipTrenera;
    }
    @Override
    public void stampaj(){
        super.stampaj();

        System.out.println("Godine iskustva: " + this.godineIskustva);

        System.out.println("Tip trenera: " + this.tipTrenera);

        System.out.println();

    }
}
