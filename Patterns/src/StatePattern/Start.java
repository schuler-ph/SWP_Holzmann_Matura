package StatePattern;

import java.util.Scanner;

public class Start extends Zustand {

    public Start(){
        super();
        karteHinheben();
    }

    @Override
    public void karteHinheben() {
        System.out.println("Karte ueberprüfen");
        Scanner reader = new Scanner(System.in);

        System.out.println("Alter eingeben: ");
        int alter = reader.nextInt();

        if(alter > 17){
            super.ca.z = new CigAuswahl();
        }
        else {
            super.ca.z = new Start();
        }
    }
}
