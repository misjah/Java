package d02_06_2022;
//Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//●	 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//●	 suma plata svih sektor / broj sektora * 0.5
//●	 override uje metodu za platu, tako da se plata racuna po formuli:
//(prosecna plata za sve sektore u kojima radi) * (broj sektora).

    public class Magacioner extends Radnik {
    public Magacioner(String punoIme) {
        super(punoIme);
    }

    private double prosecnaPlata() {
        double sumaPlata = 0;
        for (int i = 0; i < sektorNiz.size(); i++) {

            sumaPlata += sektorNiz.get(i).getPlata();
        }
        return sumaPlata / sektorNiz.size() * 0.5;

    }

    @Override
    public double plataRadnika() {

        return prosecnaPlata() * this.sektorNiz.size();
    }
}
