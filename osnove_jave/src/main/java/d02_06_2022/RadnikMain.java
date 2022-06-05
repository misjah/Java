package d02_06_2022;
//U glavnom programu kreirati jednog magacionera i jednog menadzera,
// postaviti sektore u kojima rade i ispisati platu za svakog
    public class RadnikMain {
    public static void main(String[] args) {

        Sektor s1 = new Sektor("nabavka", 36000);

        Sektor s2 = new Sektor("prerada", 48000);

        Sektor s3 = new Sektor("proizvodnja", 32000);

        Radnik magacioner = new Magacioner("Dejan Petkovic");

        Radnik menadzer = new Menadzer("Dragana Draganovski");

        magacioner.zaposliUSektor(s1);
        magacioner.zaposliUSektor(s2);
        menadzer.zaposliUSektor(s3);
        menadzer.zaposliUSektor(s1);

        System.out.println("Plata magacionera " + magacioner.getPunoIme() + " je " + magacioner.plataRadnika());
        System.out.println();
        System.out.println("Plata menadzera " + menadzer.getPunoIme() + " je " + menadzer.plataRadnika());


    }
}
