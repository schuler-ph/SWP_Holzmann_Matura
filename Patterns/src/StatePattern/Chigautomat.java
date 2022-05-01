package StatePattern;

public class Chigautomat {
    public Zustand z;

    public Chigautomat(){
    }

    public void start(){
        z = new Start();
    }

}
