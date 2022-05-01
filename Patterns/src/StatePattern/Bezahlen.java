package StatePattern;

public class Bezahlen extends Zustand {
    public Bezahlen(int nummer){
        karteHinheben(nummer);
    }

    @Override
    public void karteHinheben(int nummer){
        switch(nummer){
            case 1:
                System.out.println("Marlboro Rot: 6,-€");
                super.ca.z = new Entnahme("Marlboro Rot", 6);
                break;
            case 2:
                System.out.println("Lucky Strike: 5,30€");
                super.ca.z = new Entnahme("Lucky Strike", 5.3);
                break;
            default:
                super.ca.z = new CigAuswahl();
        }
    }
}
