public class Main {
    public static void main(String[] args) {
        Premium pk = new Premium(455,"meier", 5, "gold");
        System.out.println(pk.getkNr());
        System.out.println(pk.getName());
        System.out.println(pk.getAnzahlReise());
        System.out.println(pk.getStatus());
        System.out.println(pk.reisepreisBerechnen(3219));

        Normal nk = new Normal(111,"poguntke","martin");
        System.out.println(nk.getkNr());
        System.out.println(nk.getName());
        System.out.println(nk.getVorname());
        System.out.println(nk.reisepreisBerechnen(3219));
    }
}