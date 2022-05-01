package StrategyPattern;

public abstract class Mitschueler {
    public String name;
    public StemmVerhalten sv;

    public void stemmen(){
        sv.stemmen();
    }
}
