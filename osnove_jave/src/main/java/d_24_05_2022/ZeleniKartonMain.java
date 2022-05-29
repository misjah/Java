package d_24_05_2022;

public class ZeleniKartonMain {
    public static void main(String[] args) {

        ZeleniKarton k1 = new ZeleniKarton("Miki Mikijevic","2004/3","Digitalna Elektronika",
                "Savo Milosevic",9);
        k1.stampaj();

        ZeleniKarton k2 = new ZeleniKarton("Djordje Djordjevic","2103/4","Multimedijalne",
                "Stefan Nemanjic", 10);
        k2.stampaj();

        ZeleniKarton k3 = new ZeleniKarton("Marko Markovic","2305/3","Engleski",
                "Gordana Gordanovic", 10);

        k3.stampaj();

    }
}
