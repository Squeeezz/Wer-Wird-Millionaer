package models.joker;
import models.Frage;

public class TelefonJoker extends Joker {
    @Override
    public void einsetzen(Frage frage) {
        if (!verwendet) {
            System.out.println("Der Telefonjoker ruft einen Experten an...");
            String antwort = frage.getRichtigeAntwort();
            System.out.println("Der Experte meint, die richtige Antwort ist: " + antwort);
            verwendet = true;
        } else {
            System.out.println("Der Telefonjoker wurde bereits verwendet.");
        }
    }
}
