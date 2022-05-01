package DecoratorPattern;

public class Main {
    public static void main(String[] args) {
        BasicShake bs = new BasicShake();

        System.out.println(bs.getBasic().getBeschreibung());
        System.out.println(bs.getBasic().getProts());

        System.out.println(bs.getAdvanced().getBeschreibung());
        System.out.println(bs.getAdvanced().getProts());
    }
}
