package d19_05_2022;

public class ProizvodMain {
    public static void main(String[] args) {

        Proizvod prvi = new Proizvod();
        prvi.naziv = "Prasak za pecivo";
        prvi.cena = 99.00;
        prvi.tezina = 150.00;

        Proizvod drugi = new Proizvod();
        drugi.naziv = "Secer";
        drugi.cena = 120.00;
        drugi.tezina = 1000.00;

        prvi.stampaj();
        System.out.println("------------------------------------------");
        drugi.stampaj();

        prvi.povecanje(60);
        drugi.povecanje(15);

        System.out.println();
        System.out.println("Nakon povecanja cene");
        prvi.stampaj();
        System.out.println("------------------------------------------");
        drugi.stampaj();

        System.out.println("Cena sa popustom za proizvod 1 je " + prvi.CenaSaPopustom(30));
        System.out.println("Cena sa popustom za proizvod 2 je " + drugi.CenaSaPopustom(10));
        System.out.println("------------------------------------------");
        System.out.println("Postarina za proizvod 1 je " + prvi.postarina());
        System.out.println("Postarina za proizvod 2 je " + drugi.postarina());


    }
}
