package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Observer o1 = new Viewer("Okan");
        Observer o2 = new Viewer("Simma");
        Observer o3 = new Viewer("Sebi");

        Observable oa1 = new BreakingBad("Breaking Bad");
        Observable oa2 = new GameOfThrones("Game of Thrones");
        Observable oa3 = new MarvelMCUFilm("Captain Marvel");

        o1.addObserable(oa1);
        o1.addObserable(oa2);
        o1.addObserable(oa3);

        o2.addObserable(oa2);

        o3.addObserable(oa3);

        oa3.notifyViewers();
    }
}
