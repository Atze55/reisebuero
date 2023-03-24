// abstrakte Klasse = keine vollwertige Klasse
public abstract class Kunde {
    private int kNr;
    private String name;

    public Kunde(int kNr, String name) {
        this.kNr = kNr;
        this.name = name;
    }

    public void setkNr(int kNr) {
        this.kNr = kNr;
    }

    public int getkNr() {
        return kNr;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    // abstrakte Methode verwenden, wenn es in den jeweiligen Unterklassen/Kind unterschiedlich gelöst werden soll
    // abstrakte Methode muss in den Unterklassen ausimplementiert werden !!!
    // alle, die von mir (Oberklasse/superklasse) erben, sollen eine Methode reisepreisBerechnen enthalten und einen double Wert aufnehmen und zurückgeben
    // ist eine abstrakte Methode in einer Klasse, muss die Klasse ach auf abstrakt setzen
    // durch abstrakt = keine Objekterstellung möglich heißt nicht mehr instanziierbar
    public abstract double reisepreisBerechnen(double basisPreis);
}
