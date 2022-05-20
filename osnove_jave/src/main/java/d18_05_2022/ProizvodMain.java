package d18_05_2022;
//1.	Napisati klasu Proizvod koja ima atribute
//○	naziv proizvoda (String)
//○	cenu proizvoda (double)
//○	težinu proizvoda u gramima. (double)
//	i metode:
//○	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
public class ProizvodMain {
    public static void main(String[] args) {

        Proizvod prvi = new Proizvod();
        prvi.naziv = "Raspberry Pi 4";
        prvi.tezina = 46.1;
        prvi.cena = 35.0;



        Proizvod drugi = new Proizvod();
        drugi.naziv = "VisionFive RISC-V";
        drugi.tezina = 300.0;
        drugi.cena = 206.0;


        System.out.println(prvi.naziv + ", " + prvi.cena +"$, "+ prvi.tezina + "g");
        System.out.println("-----------------------------------");
        System.out.println(drugi.naziv + ", " + drugi.cena +"$, "+ drugi.tezina + "g");

    }
}
