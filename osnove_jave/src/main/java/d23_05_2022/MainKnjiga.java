package d23_05_2022;

public class MainKnjiga {
    public static void main(String[] args) {


        Autor prvi = new Autor("Borislav", "Pekic");
        Knjiga knj = new Knjiga("978-86-521-0724-7", "Besnilo", 2011, prvi);

        knj.stampaj();

        Autor drugi = new Autor("Dzordz", "Orvel");
        Knjiga knj2 = new Knjiga("9788689203066", "1984", 2015, drugi);

        knj2.stampaj();

        Autor treci = new Autor("Oldos", "Haksli");
        Knjiga knj3 = new Knjiga("9788663691841", "VRLI NOVI SVET", 2017, treci);

        knj3.stampaj();
    }
}
