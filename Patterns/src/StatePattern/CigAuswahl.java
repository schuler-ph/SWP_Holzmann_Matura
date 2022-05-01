package StatePattern;

import java.util.Scanner;

public class CigAuswahl extends Zustand {
    public CigAuswahl(){
        super();
        nummerEingabe();
    }

    @Override
    public void nummerEingabe(){
        Scanner reader = new Scanner(System.in);
        System.out.println("Chig Auswahl: ");
        int auswahl = reader.nextInt();
        super.ca.z = new Bezahlen(auswahl);
    }
}
