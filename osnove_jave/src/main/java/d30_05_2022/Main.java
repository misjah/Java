package d30_05_2022;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(2004, "Mirko Mirkovic",   "Osnovne");

        Student student2 = new Student(2006, "Djordje Djordjevic", "Master");

        student1.dodaj(new Ispit("Matematika" , 7, "prof. " + "Mile Ilic"));

        student1.dodaj(new Ispit("Fizika", 6, "prof. " + "Stojan Stojanovic"));

        student2.dodaj(new Ispit("Nacrtna Geometrija", 9, "prof. " + "Milan Milanovic"));

        student2.dodaj(new Ispit("Numericka Matematika", 10, "prof. " + "Petar Petrovic"));

        student1.stampaj();
        System.out.println("Prosek: " + student1.prosek());
        System.out.println("");
        student2.stampaj();
        System.out.println("Prosek: " + student2.prosek());

    }
}