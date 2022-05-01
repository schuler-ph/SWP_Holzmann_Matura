package StrategyPattern;

public class StemmSchlecht implements StemmVerhalten{
    @Override
    public void stemmen() {
        System.out.println("Schlecht");
    }
}
