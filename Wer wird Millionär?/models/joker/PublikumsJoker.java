package models.joker;
import models.Frage;

public class PublikumsJoker extends Joker {
    @Override
    public void einsetzen(Frage frage) {
        if (!verwendet) {
            System.out.println("Das Publikum wird befragt...");
            String antwort = frage.getRichtigeAntwort();
            System.out.println("Das Publikum meint, die richtige Antwort ist: " + antwort);
            verwendet = true;
        } else {
            System.out.println("Der Publikumsjoker wurde bereits verwendet.");
        }
    }
}
