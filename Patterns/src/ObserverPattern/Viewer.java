package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Viewer implements Observer {
    public String name;

    public Viewer(String name){
        this.name = name;
    }

    public List<Observable> obserables = new ArrayList<>();

    @Override
    public void addObserable(Observable o){
        obserables.add(o);
        o.viewers.add(this);
    }

    @Override
    public void netflixSchaun(String folge) {
        System.out.println(name + " schaut " + folge);
    }
}
