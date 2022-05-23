package d19_05_2022;

public class Proizvod {


        public String naziv;
        public double cena;
        public double tezina;

        public void stampaj() {
            System.out.println("{ "+ this.naziv + " }, " +
                    "{ "+ this.cena + " din }, " + "{ " + this.tezina + "g }");
        }

        public void povecanje(double zaKoliko) {
            this.cena = this.cena + zaKoliko;
        }

        public double CenaSaPopustom(double popust) {
            return this.cena - this.cena * popust / 100;
        }

        public int postarina() {
            if (this.tezina < 100) {
                return 200;
            } else if (this.tezina > 100 && this.tezina < 500) {
                return 400;
            } else {
                return 1000;
            }

    }
}