public class Fahrzeug {
    //Attribute
    private String fahrzeug;
    private int jahr;

    //Referenzen

    //Konstrukte
    public Fahrzeug(int jahr, String fahrzeug) {
        this.jahr = jahr;
        this.fahrzeug = fahrzeug;
        datenAnzeigen();
    }

    //Methoden
    public void datenAnzeigen() {
        System.out.println(fahrzeug + jahr + " wurde verkauft");
    }
}
