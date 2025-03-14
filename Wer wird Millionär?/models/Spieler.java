package models;

public class Spieler {
    private String name;
    private int aktuellerGewinn;

    public Spieler(String name) {
        this.name = name;
        this.aktuellerGewinn = 0;
    }

    public String getName() {
        return name;
    }

    public int getAktuellerGewinn() {
        return aktuellerGewinn;
    }

    public void erhoeheGewinn(int betrag) {
        this.aktuellerGewinn = betrag;
    }

    public void resetGewinn(int sicherheitsstufe) {
        this.aktuellerGewinn = sicherheitsstufe;
    }
}
