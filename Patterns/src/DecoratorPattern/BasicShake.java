package DecoratorPattern;

public class BasicShake implements Shake {
    @Override
    public Base getBasic() {
        Base b = new Fluessigkeit();
        b = new ProtPulver(b);
        return b;
    }

    @Override
    public Base getAdvanced() {
        Base b = new Fluessigkeit();
        b = new ProtPulver(b);
        b = new ProtPulver(b);
        b = new Kreatin(b);
        return b;
    }
}
