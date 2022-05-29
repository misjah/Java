package d_24_05_2022;

public class ZeleniKarton {
    private String punoImeStudenta;
    private String indeks;
    private String predmet;
    private String punoImeProfesora;
    private int ocena;

    public ZeleniKarton(String student, String indeks, String predmet,
                        String profesor, int ocena) {
        this.punoImeStudenta = student;
        this.indeks = indeks;
        this.predmet = predmet;
        this.punoImeProfesora = profesor;
        this.ocena = ocena;
    }

    public void stampaj() {
        System.out.println("Predmet: " + predmet + " - " + "Ocena: " + ocena);
        System.out.println("Student: " + punoImeStudenta + ", " + "br. indeksa: " + indeks);
        System.out.println("Profesor: " + punoImeProfesora);
        System.out.println();
    }
}