public class Premium extends Kunde{
    private int anzahlReise;
    private String status;

    public Premium(int kNr, String name, int anzahlReisen, String status){
        // da kein default Constructor braucht er super um die Werte von hier dem Constructor der OK zu übergeben
        super(kNr,name);
        this.anzahlReise = anzahlReisen;
        this.status = status;
    }

    public int getAnzahlReise() {
        return anzahlReise;
    }

    public void setAnzahlReise(int anzahlReise) {
        this.anzahlReise = anzahlReise;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    // String = Objekt, dadurch beim Vergleich kein == sondern .equals())
    public double reisepreisBerechnen(double basisPreis) {
        double mitRabatt = 0;
        if(status.equals("gold")){
            mitRabatt = basisPreis * 0.8;
        }
        else if (status.equals("silver")) {
            mitRabatt = basisPreis * 0.9;
        }
        else {
            mitRabatt = basisPreis * 0.95;
        }
        return mitRabatt;
    }
}
