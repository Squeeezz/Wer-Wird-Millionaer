package models;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

import models.joker.Joker;
import models.joker.FiftyFiftyJoker;
import models.joker.TelefonJoker;
import models.joker.PublikumsJoker;

public class Spiel {
    private Spieler spieler;
    private FragenKatalog fragenKatalog;
    private Joker[] joker;
    private int aktuelleFrageIndex;
    private int sicherheitsstufe1 = 500;
    private int sicherheitsstufe2 = 16000;
    private boolean spielLaeuft;
    private List<Frage> gestellteFragen = new ArrayList<>();

    public Spiel(Spieler spieler) {
        this.spieler = spieler;
        this.fragenKatalog = new FragenKatalog();
        this.joker = new Joker[] {
                new FiftyFiftyJoker(),
                new TelefonJoker(),
                new PublikumsJoker()
        };
        this.aktuelleFrageIndex = 0;
        this.spielLaeuft = true;
    }

    public void starteSpiel() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Willkommen zu 'Wer wird Millionär', " + spieler.getName() + "!");
        
        while (spielLaeuft && aktuelleFrageIndex < 15) {
            int schwierigkeitsgrad = (aktuelleFrageIndex / 5) + 1;
            Frage frage = fragenKatalog.getZufaelligeFrage(schwierigkeitsgrad, gestellteFragen);
            gestellteFragen.add(frage);
            System.out.println("\nFrage " + (aktuelleFrageIndex + 1) + ": " + frage.getFrageText());
            frage.antwortenMischen();
            frage.zeigeAntworten();
    
            boolean jokerVerwendet = false;
    
            while (true) {
                if (!jokerVerwendet) {
                    System.out.print("Wähle eine Antwort (A, B, C, D)");
                    for (int i = 0; i < joker.length; i++) {
                        if (!joker[i].isVerwendet()) {
                            switch (i) {
                                case 0:
                                    System.out.print(" oder benutze einen Joker (50:50");
                                    break;
                                case 1:
                                    System.out.print(", Telefon");
                                    break;
                                case 2:
                                    System.out.print(", Publikum");
                                    break;
                            }
                        }
                    }
                    System.out.println(").");
                }
                
                System.out.print("Antwort: ");
                String antwort = scanner.nextLine().trim();
    
                if (jokerEinsetzen(antwort, frage)) {
                    jokerVerwendet = true;
                    continue;
                }
    
                if (frage.istRichtigeAntwort(antwort)) {
                    aktuelleFrageIndex++;
                    spieler.erhoeheGewinn(aktuellerGewinn());
                    System.out.println("Richtig! Du hast jetzt " + spieler.getAktuellerGewinn() + " €.");
                    
                    // Prüfe, ob der Spieler freiwillig aussteigen möchte, aber nicht bei Frage 15
                    if (aktuelleFrageIndex < 15 && freiwilligerAusstieg(scanner)) {
                        beendeSpiel(false);
                        return;
                    }
                    break;
    
                } else {
                    System.out.println("Falsch! Das Spiel ist vorbei.");
                    System.out.println("Die richtige Antwort war: " + frage.getRichtigeAntwort());
                    spieler.resetGewinn(aktuelleFrageIndex < 10 ? sicherheitsstufe1 : sicherheitsstufe2);
                    beendeSpiel(true);
                    return;
                }
            }                                   
        }
    
        // Überprüfe, ob der Spieler die letzte Frage erreicht hat
        if (aktuelleFrageIndex == 15) {
            spieler.erhoeheGewinn(1000000);  // Setze den Gewinn auf 1 Million Euro
            System.out.println("Glückwunsch, du hast 1 Million Euro gewonnen!");
            beendeSpiel(false);
        }
    }      
    
    private boolean jokerEinsetzen(String antwort, Frage frage) {
        if (antwort.equalsIgnoreCase("50:50")) {
            joker[0].einsetzen(frage);
            frage.zeigeAntworten();  // Zeige die Antworten einmal nach dem Einsatz des 50:50-Jokers
            return true;
        } else if (antwort.equalsIgnoreCase("Telefon")) {
            joker[1].einsetzen(frage);
            return true;  // Keine erneute Ausgabe der Antworten
        } else if (antwort.equalsIgnoreCase("Publikum")) {
            joker[2].einsetzen(frage);
            return true;  // Keine erneute Ausgabe der Antworten
        }
        return false;
    }     

    private boolean freiwilligerAusstieg(Scanner scanner) {
        System.out.println("Möchtest du freiwillig aussteigen und mit deinem aktuellen Gewinn von " +
                spieler.getAktuellerGewinn() + " € nach Hause gehen? (Ja/Nein)");
        String entscheidung = scanner.nextLine().trim();
        return entscheidung.equalsIgnoreCase("Ja");
    }

    private void beendeSpiel(boolean verloren) {
        if (verloren) {
            System.out.println("Schade, du hast verloren. Dein Gewinn: " + spieler.getAktuellerGewinn() + " €.");
        } else {
            System.out.println("Du hast das Spiel beendet mit " + spieler.getAktuellerGewinn() + " €.");
        }
        spielLaeuft = false;
    }

    private int aktuellerGewinn() {
        switch (aktuelleFrageIndex) {
            case 1:
                return 50;
            case 2:
                return 100;
            case 3:
                return 200;
            case 4:
                return 300;
            case 5:
                return 500;
            case 6:
                return 1000;
            case 7:
                return 2000;
            case 8:
                return 4000;
            case 9:
                return 8000;
            case 10:
                return 16000;
            case 11:
                return 32000;
            case 12:
                return 64000;
            case 13:
                return 125000;
            case 14:
                return 500000;
            case 15:
                return 1000000;
            default:
                return 0;
        }
    }
}
