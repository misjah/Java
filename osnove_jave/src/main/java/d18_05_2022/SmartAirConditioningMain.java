package d18_05_2022;
//2.	Kreirati klasu SmartAirConditioning koja ima:
//●	atribut za marku klime (npr: Samsung, Galanz, Gree, …)
//●	atribut za izabranu temperaturu (minimum je 16, maksimum 35)
//●	atribut za mod (hladi/greje)
//●	metodu za stampu - stampa u formatu: Proizvoljno :)
//
//
//U glavnom programu kreirati minimum 2 objekta klase
// SmartAirConditioning i za svaki od njih pozvati metodu za stampu
public class SmartAirConditioningMain {
    public static void main(String[] args) {

        SmartAirConditioning model1 = new SmartAirConditioning();
        model1.marka = "Hisense";
        model1.temp = 16;
        model1.mod = "Hladi";


        SmartAirConditioning model2 = new SmartAirConditioning();
        model2.marka = "Changhong";
        model2.temp = 35;
        model2.mod = "Greje";


        System.out.println("Model: " + model1.marka + ", " + "Min temperatura: " + model1.temp + "C" +", " +"Mod rada: "+model1.mod);
        System.out.println("");
        System.out.println("Model: " + model2.marka + ", " + "Max temperatura: " + model2.temp + "C" +", " +"Mod rada: "+model2.mod);

    }
}
