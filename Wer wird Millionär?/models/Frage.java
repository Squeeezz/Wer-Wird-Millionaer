package models;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Frage {
    private String frageText;
    private String richtigeAntwort;
    private List<String> antworten;
    private int schwierigkeitsgrad;

    public Frage(String frageText, String richtigeAntwort, List<String> antworten, int schwierigkeitsgrad) {
        this.frageText = frageText;
        this.richtigeAntwort = richtigeAntwort;
        this.antworten = new ArrayList<>(antworten);
        this.schwierigkeitsgrad = schwierigkeitsgrad;
    }

    public String getFrageText() {
        return frageText;
    }

    public void antwortenMischen() {
        Collections.shuffle(antworten);
    }

    public void zeigeAntworten() {
        for (int i = 0; i < 4; i++) {
            if (i < antworten.size()) {
                char option = (char) ('A' + i);
                System.out.println(option + ") " + antworten.get(i));
            } else {
                char option = (char) ('A' + i);
                System.out.println(option + ") ");
            }
        }
    }

    public boolean istRichtigeAntwort(String antwort) {
        String richtigeBuchstabe = "";
        switch (antworten.indexOf(richtigeAntwort)) {
            case 0: richtigeBuchstabe = "A"; break;
            case 1: richtigeBuchstabe = "B"; break;
            case 2: richtigeBuchstabe = "C"; break;
            case 3: richtigeBuchstabe = "D"; break;
        }
        return richtigeBuchstabe.equalsIgnoreCase(antwort);
    }

    public int getSchwierigkeitsgrad() {
        return schwierigkeitsgrad;
    }

    public String getRichtigeAntwort() {
        return richtigeAntwort;
    }

    public List<String> getAntworten() {
        return antworten;
    }

    public void setAntworten(List<String> antworten) {
        this.antworten = antworten;
    }
}
