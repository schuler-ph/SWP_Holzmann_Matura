package StrategyPattern;

public class Main {
    public static void main(String[] args) {
        Mitschueler a = new Simma();

        a.stemmen();
        a.sv = new StemmOk();

        a.stemmen();
    }
}
