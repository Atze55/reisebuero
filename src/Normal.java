// extends = erbt von der dahinter stehenden Klasse die Attribute in dem Fall "Kunde"
public class Normal extends Kunde{

    private String vorname;

    public Normal(int kNr, String name, String vorname) {
        super(kNr, name);
        this.vorname = vorname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }


    public double reisepreisBerechnen(double basisPreis) {
        return basisPreis;
    }
}
