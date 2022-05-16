package d16_05_2022;
//3.	Zadatak
//Napisati metodu koja stampa podatke o korisniku u formatu:
//JMBG: [jmbg]
//Ime: [ime]
//Prezime: [prezime]
//God. rodjenja: [god]
//Aktivan: [true/false]
//Metoda prima jmbg, ime, prezime, god rodjenja i da li je aktivan kao parametre metode.
public class zadatak3 {
    public static void main(String[] args) {

    person("Miki", "Maus", 1928, 123456789, true);


    }
    static void person (String fname, String lname,int year, int jmbg, Boolean active){
        System.out.println("JMBG: "+"[" + jmbg + "]" );
        System.out.println("Ime: "+"[" + fname + "]" );
        System.out.println("Prezime: "+"[" + lname + "]" );
        System.out.println("God. rodjenja: "+"[" + year + "]" );
        System.out.println("Aktivan: "+"[" + active + "]" );

    }
}
