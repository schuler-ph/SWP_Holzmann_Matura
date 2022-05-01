package StatePattern;

public class Entnahme extends Zustand {
    public Entnahme(String name, double preis){
        chiggAussi(name, preis);
    }

    @Override
    public void chiggAussi(String name, double preis){
        System.out.println("Marke: " +  name);
        System.out.println("Preis: " +  preis);
        super.ca.z = new Start();
    }
}
