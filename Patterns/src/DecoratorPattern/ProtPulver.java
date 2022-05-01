package DecoratorPattern;

public class ProtPulver implements Base {
    Base b;

    public ProtPulver(Base b){
        this.b = b;
    }

    @Override
    public String getBeschreibung() {
        return b.getBeschreibung() + "mit Protein Pulver ";
    }

    @Override
    public double getProts() {
        return b.getProts() + 25;
    }
}
