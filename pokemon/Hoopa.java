package pokemon;

import ru.ifmo.se.pokemon.*;
import moves.*;

public final class Hoopa extends Pokemon {
    public Hoopa(String name, int level) {
        super(name, level);

        setType(Type.PSYCHIC, Type.GHOST);
        setStats(80, 110, 60, 150, 130, 70);

        addMove(new ZenHeadbutt());
        addMove(new Psychic());
        addMove(new NastyPlot());
        addMove(new Facade());
    }
}