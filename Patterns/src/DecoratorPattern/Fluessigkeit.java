package DecoratorPattern;

public class Fluessigkeit implements Base {

    @Override
    public String getBeschreibung() {
        return "Wasser ";
    }

    @Override
    public double getProts() {
        return 0;
    }
}
