package DecoratorPattern;

public class Kreatin implements Base {
    Base b;

    public Kreatin(Base b){
        this.b = b;
    }

    @Override
    public String getBeschreibung() {
        return b.getBeschreibung() + "mit Kreatin ";
    }

    @Override
    public double getProts() {
        return b.getProts();
    }
}
