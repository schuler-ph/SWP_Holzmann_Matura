package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    public String name;

    public Observable(String name){
        this.name = name;
    }

    public List<Viewer> viewers = new ArrayList<>();

    public void notifyViewers(){
        for(Viewer v : viewers){
            v.netflixSchaun(name);
        }
    }
}
