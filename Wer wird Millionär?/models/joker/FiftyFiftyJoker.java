package models.joker;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import models.Frage;

public class FiftyFiftyJoker extends Joker {
    @Override
    public void einsetzen(Frage frage) {
        if (!verwendet) {
            System.out.println("Der 50:50 Joker entfernt zwei falsche Antworten.");
            List<String> antworten = frage.getAntworten();
            String richtigeAntwort = frage.getRichtigeAntwort();

            // Erstelle eine Liste der falschen Antworten
            List<String> falscheAntworten = new ArrayList<>(antworten);
            falscheAntworten.remove(richtigeAntwort); // Entferne die richtige Antwort

            // Wähle zwei zufällige falsche Antworten aus
            Random random = new Random();
            List<String> zuEntfernendeAntworten = new ArrayList<>();

            // Wir entfernen exakt zwei falsche Antworten
            while (zuEntfernendeAntworten.size() < 2) {
                int index = random.nextInt(falscheAntworten.size());
                String falscheAntwort = falscheAntworten.get(index);
                if (!zuEntfernendeAntworten.contains(falscheAntwort)) {
                    zuEntfernendeAntworten.add(falscheAntwort);
                    falscheAntworten.remove(falscheAntwort); // Aus der Liste der falschen Antworten entfernen
                }
            }

            // Entferne alle falschen Antworten aus der ursprünglichen Antwortliste
            antworten.clear();
            antworten.add(richtigeAntwort); // Füge die richtige Antwort hinzu
            antworten.addAll(falscheAntworten); // Füge die verbleibende falsche Antwort hinzu

            // Setze die aktualisierte Antwortliste
            frage.setAntworten(antworten);

            verwendet = true;
        } else {
            System.out.println("Der 50:50 Joker wurde bereits verwendet.");
        }
    }
}
