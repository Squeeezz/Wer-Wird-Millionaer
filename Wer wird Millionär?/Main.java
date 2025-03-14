import models.Spiel;
import models.Spieler;

public class Main {
    public static void main(String[] args) {
        Spieler spieler = new Spieler("Maxim Walter");
        Spiel spiel = new Spiel(spieler);
        spiel.starteSpiel();
    }
}
