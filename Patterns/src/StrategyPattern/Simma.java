package StrategyPattern;

public class Simma extends Mitschueler {
    public Simma(){
        super.name = "Simma";
        super.sv = new StemmStark();
    }
}
