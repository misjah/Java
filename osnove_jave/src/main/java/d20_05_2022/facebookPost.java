package d20_05_2022;

public class facebookPost {
    public String sender;
    public String receiver;
    public String text;
    public int likes;
    public int shares;
    public facebookPost() {

    }
    public facebookPost(String sentBy, String received, String message) {
        this.sender = sentBy;
        this.receiver = received;
        this.text = message;
    }

    public void like() {
        this.likes++;
    }

    public void dislike() {
        if (this.likes < 0) {
            this.likes = 0;
        } else {
            this.likes--;
        }
    }

    public int share() {
        return this.shares + 1;
    }

    public void print() {
        System.out.println(this.sender + " >>> " + this.receiver);
        System.out.println(this.text);
        System.out.println("Likes: " + this.likes + " | " + "Shares: " + this.shares);
    }
}