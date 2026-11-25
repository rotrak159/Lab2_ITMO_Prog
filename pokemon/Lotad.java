package pokemon;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Lotad extends Pokemon {
    public Lotad(String name, int level) {
        super(name, level);
        setType(Type.WATER, Type.GRASS);
        setStats(40, 30, 30, 40, 50, 30);

        addMove(new Astonish());
        addMove(new Confide());
    }
}