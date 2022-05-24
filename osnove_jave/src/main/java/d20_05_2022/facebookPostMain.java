package d20_05_2022;
//1.Kreirati klasu FacebookPost koja ima:
//   Od atributa:
//-	ime i prezime korisnika koji je objavio post
//-	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//-	tekst objave
//-	broj lajkova
//-	broj deljenja
// Konstruktore:
//-	difoltni konstuktor
//-	konstuktor koji postavlja ime i prezime korisnika ko je objavio, korisnika na kom je profilu objavnljen i tekst objave
//  Od metoda:
//-	like(), koja povecava broj lajkova za 1.
//-	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//-	share(), koja povecava broj deljenja za 1
//-	print(), koja stampa objavu u formatu:
//(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//(tekst objave)
//Likes (broj lajkova) | Shares (broj deljenja)
//
//U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.
public class facebookPostMain {
    public static void main(String[] args) {

        facebookPost post1 = new facebookPost();
        post1.sender = "Milan Milanovic";
        post1.receiver = "Djordje Djordjevic";
        post1.text = "Shta sam nocas propustio?";

        post1.likes = 8;
        post1.shares = 2;

        post1.like();
        post1.dislike();
        post1.share();
        post1.print();

        System.out.println("-----------------------------------------------");

        facebookPost post2 = new facebookPost("Djordje Djordjevic", "Milan Milanovic", "Nista!");
        post2.likes = 6;
        post2.shares = 3;
        post2.print();
    }
}
//prints: Milan Milanovic >>> Djordje Djordjevic
//Shta sam nocas propustio?
//Likes: 8 | Shares: 2
//-----------------------------------------------
//Djordje Djordjevic >>> Milan Milanovic
// Nista!
//Likes: 6 | Shares: 3