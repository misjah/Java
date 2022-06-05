package d03_06_2022;
//    Kreirati klasu SuperKartica koja ima:
//    broj kartice
//    ime i prezime vlasnika
//    popust (200, 500, … )
//    konstuktore (default-ni i sa parametrima)
//    gettere i settere
//    metodu stampaj koja stampa karticu u formatu:
//            (broj kartice), (ime i prezime)
    public class SuperKartica {

    private String brojKartice;
    private String imeIprezime;
    private double popust;

    public SuperKartica() {
    }

    public SuperKartica(String brojKartice, String imeIprezime, double popust) {
        this.brojKartice = brojKartice;
        this.imeIprezime = imeIprezime;
        this.popust = popust;
    }

    public String getBrojKartice() {
        return brojKartice;
    }

    public void setBrojKartice(String brojKartice) {
        this.brojKartice = brojKartice;
    }

    public String getImeIprezime() {
        return imeIprezime;
    }

    public void setImeIprezime(String imeIprezime) {
        this.imeIprezime = imeIprezime;
    }

    public double getPopust() {
        return popust;
    }

    public void setPopust(double popust) {
        this.popust = popust;
    }
    public void stampajKarticu(){
        System.out.println("Broj kartice: " + this.brojKartice + " Ime i prezime: " + this.imeIprezime);
    }
}