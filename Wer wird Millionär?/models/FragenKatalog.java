package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class FragenKatalog {
    private List<Frage> fragen;

    public FragenKatalog() {
        this.fragen = new ArrayList<>();
        ladeFragen();
    }

    private void ladeFragen() {
        fragen.add(new Frage("Was ist die Hauptstadt von Deutschland?", "Berlin",
                        List.of("Hamburg", "München", "Berlin", "Frankfurt"), 1));
        fragen.add(new Frage("Welcher Planet ist der Sonne am nächsten?", "Merkur",
                        List.of("Mars", "Venus", "Merkur", "Jupiter"), 1));
        fragen.add(new Frage("Wie viele Kontinente gibt es auf der Erde?", "7",
                        List.of("6", "7", "5", "8"), 1));
        fragen.add(new Frage("In welchem Jahr fiel die Berliner Mauer?", "1989",
                        List.of("1985", "1989", "1991", "1987"), 1));
        fragen.add(new Frage("Welches Element hat das chemische Symbol 'O'?", "Sauerstoff",
                        List.of("Gold", "Sauerstoff", "Silber", "Wasserstoff"), 1));
        fragen.add(new Frage("Wer schrieb den Roman '1984'?", "George Orwell",
                        List.of("Aldous Huxley", "George Orwell", "Mark Twain", "Ernest Hemingway"), 2));
        fragen.add(new Frage("Welches Tier ist das größte an Land lebende Säugetier?", "Elefant",
                        List.of("Nashorn", "Elefant", "Giraffe", "Nilpferd"), 1));
        fragen.add(new Frage("Welche Farbe entsteht, wenn man Blau und Gelb mischt?", "Grün",
                        List.of("Rot", "Grün", "Lila", "Orange"), 1));
        fragen.add(new Frage("Wie viele Seiten hat ein Sechseck?", "6",
                        List.of("5", "6", "7", "8"), 1));
        fragen.add(new Frage("Welches ist das kleinste Land der Welt?", "Vatikanstadt",
                        List.of("Monaco", "Liechtenstein", "Vatikanstadt", "San Marino"), 2));
        fragen.add(new Frage("Welcher Fluss ist der längste der Welt?", "Nil",
                        List.of("Amazonas", "Yangtse", "Mississippi", "Nil"), 2));
        fragen.add(new Frage("Welches Organ ist das größte im menschlichen Körper?", "Haut",
                        List.of("Leber", "Lunge", "Haut", "Herz"), 1));
        fragen.add(new Frage("Wie viele Ringe hat das olympische Symbol?", "5", 
                        List.of("4", "5", "6", "7"), 1));
        fragen.add(new Frage("Wie heißt der größte Ozean der Erde?", "Pazifik", 
                        List.of("Atlantik", "Indischer Ozean", "Pazifik", "Arktischer Ozean"), 1));
        fragen.add(new Frage("Welcher Fluss fließt durch London?", "Themse", 
                        List.of("Seine", "Themse", "Elbe", "Rhein"), 1));
        fragen.add(new Frage("Welche Stadt ist die Hauptstadt von Australien?", "Canberra", 
                        List.of("Sydney", "Melbourne", "Canberra", "Perth"), 2));
        fragen.add(new Frage("In welcher Einheit wird die elektrische Spannung gemessen?", "Volt", 
                        List.of("Ampere", "Ohm", "Volt", "Watt"), 2));
        fragen.add(new Frage("Welches Land hat die meisten Einwohner?", "China", 
                        List.of("USA", "Indien", "China", "Russland"), 2));
        fragen.add(new Frage("Wie heißt der höchste Berg der Welt?", "Mount Everest", 
                        List.of("K2", "Kilimandscharo", "Mount Everest", "Makalu"), 2));
        fragen.add(new Frage("Welches Tier ist das größte Säugetier der Welt?", "Blauwal", 
                        List.of("Elefant", "Weißer Hai", "Blauwal", "Gorilla"), 2));
        fragen.add(new Frage("Wer malte die Mona Lisa?", "Leonardo da Vinci", 
                        List.of("Vincent van Gogh", "Pablo Picasso", "Leonardo da Vinci", "Claude Monet"), 2));
        fragen.add(new Frage("Welches Metall hat das chemische Symbol 'Fe'?", "Eisen", 
                        List.of("Kupfer", "Eisen", "Zink", "Blei"), 2));
        fragen.add(new Frage("Welcher Planet ist bekannt als der Rote Planet?", "Mars", 
                        List.of("Mars", "Jupiter", "Saturn", "Venus"), 1));
        fragen.add(new Frage("Wie viele Farben hat der Regenbogen?", "7", 
                        List.of("5", "6", "7", "8"), 1));
        fragen.add(new Frage("Welches ist das größte Land der Welt?", "Russland", 
                        List.of("Kanada", "USA", "Russland", "China"), 2));
        fragen.add(new Frage("Welcher Kontinent hat die meisten Länder?", "Afrika", 
                        List.of("Europa", "Asien", "Afrika", "Südamerika"), 2));
        fragen.add(new Frage("Wie heißt die Hauptstadt von Italien?", "Rom", 
                        List.of("Mailand", "Rom", "Neapel", "Venedig"), 1));
        fragen.add(new Frage("Welcher Planet hat die meisten Monde?", "Jupiter", 
                        List.of("Mars", "Jupiter", "Saturn", "Neptun"), 2));
        fragen.add(new Frage("Welcher Baum trägt Eicheln?", "Eiche", 
                        List.of("Ahorn", "Kiefer", "Eiche", "Buche"), 1));
        fragen.add(new Frage("Welcher Künstler schnitt sich ein Ohr ab?", "Vincent van Gogh", 
                        List.of("Pablo Picasso", "Salvador Dalí", "Vincent van Gogh", "Henri Matisse"), 2));
        fragen.add(new Frage("Wie viele Beine hat ein Insekt?", "6", 
                        List.of("4", "6", "8", "10"), 1));
        fragen.add(new Frage("Wer war der erste Mensch auf dem Mond?", "Neil Armstrong", 
                        List.of("Yuri Gagarin", "Buzz Aldrin", "Neil Armstrong", "John Glenn"), 2));
        fragen.add(new Frage("In welcher Sportart gewann Michael Jordan sechs Meisterschaften?", "Basketball", 
                        List.of("Basketball", "Baseball", "Football", "Tennis"), 2));
        fragen.add(new Frage("Welches Land hat die Form eines Stiefels?", "Italien", 
                        List.of("Griechenland", "Spanien", "Italien", "Portugal"), 1));
        fragen.add(new Frage("Wie heißt die größte Insel der Welt?", "Grönland", 
                        List.of("Madagaskar", "Borneo", "Grönland", "Neuguinea"), 2));
        fragen.add(new Frage("Welche Jahreszeit folgt auf den Winter?", "Frühling", 
                        List.of("Sommer", "Frühling", "Herbst", "Winter"), 1));
        fragen.add(new Frage("In welchem Land steht die Chinesische Mauer?", "China", 
                        List.of("Japan", "China", "Indien", "Südkorea"), 1));
        fragen.add(new Frage("Wie viele Minuten hat eine Stunde?", "60", 
                        List.of("50", "60", "70", "80"), 1));
        fragen.add(new Frage("Welches Tier ist auf der Flagge von Spanien abgebildet?", "Stier", 
                        List.of("Adler", "Stier", "Löwe", "Pferd"), 2));
        fragen.add(new Frage("Welches Element wird oft als Grundlage des Lebens bezeichnet?", "Kohlenstoff", 
                        List.of("Wasserstoff", "Sauerstoff", "Kohlenstoff", "Stickstoff"), 2));
        fragen.add(new Frage("Welcher US-Präsident beendete die Sklaverei?", "Abraham Lincoln", 
                        List.of("George Washington", "Thomas Jefferson", "Abraham Lincoln", "Franklin D. Roosevelt"), 2));
        fragen.add(new Frage("In welchem Land befinden sich die Pyramiden von Gizeh?", "Ägypten", 
                        List.of("Mexiko", "Peru", "Ägypten", "Indien"), 1));
        fragen.add(new Frage("Was ist die Hauptstadt von Kanada?", "Ottawa", 
                        List.of("Toronto", "Vancouver", "Ottawa", "Montreal"), 2));
        fragen.add(new Frage("Wer erfand das Telefon?", "Alexander Graham Bell", 
                        List.of("Thomas Edison", "Nikola Tesla", "Alexander Graham Bell", "Guglielmo Marconi"), 2));
        fragen.add(new Frage("Welches Organ pumpt Blut durch den menschlichen Körper?", "Herz", 
                        List.of("Lunge", "Leber", "Herz", "Niere"), 1));
        fragen.add(new Frage("Welcher Stern ist der Erde am nächsten?", "Sonne", 
                        List.of("Proxima Centauri", "Sirius", "Sonne", "Vega"), 1));
        fragen.add(new Frage("Wie heißt das kleinste Knochen im menschlichen Körper?", "Steigbügel", 
                        List.of("Steigbügel", "Schlüsselbein", "Wadenbein", "Kniekehle"), 2));
        fragen.add(new Frage("Welches Vitamin wird durch Sonnenlicht in der Haut produziert?", "Vitamin D", 
                        List.of("Vitamin A", "Vitamin B", "Vitamin C", "Vitamin D"), 1));
        fragen.add(new Frage("Welche Einheit wird zur Messung der Lautstärke verwendet?", "Dezibel", 
                        List.of("Hertz", "Watt", "Dezibel", "Ampere"), 2));
        fragen.add(new Frage("Wie viele Wochen hat ein Jahr?", "52", 
                        List.of("50", "51", "52", "53"), 1));
        fragen.add(new Frage("Welcher Planet hat den größten Durchmesser?", "Jupiter", 
                        List.of("Saturn", "Neptun", "Jupiter", "Uranus"), 2));
        fragen.add(new Frage("Wie heißt die Währung in Japan?", "Yen", 
                        List.of("Won", "Yuan", "Yen", "Ringgit"), 3));
    }

    public Frage getZufaelligeFrage(int schwierigkeitsgrad, List<Frage> gestellteFragen) {
        Random rand = new Random();
        List<Frage> verfuegbareFragen = new ArrayList<>(fragen);
        verfuegbareFragen.removeAll(gestellteFragen);
        return verfuegbareFragen.get(rand.nextInt(verfuegbareFragen.size()));
    }
    
    public List<Frage> getFragenNachSchwierigkeitsgrad(int schwierigkeitsgrad) {
        List<Frage> gefilterteFragen = new ArrayList<>();
        for (Frage frage : fragen) {
            if (frage.getSchwierigkeitsgrad() == schwierigkeitsgrad) {
                gefilterteFragen.add(frage);
            }
        }
        return gefilterteFragen;
    }
}
