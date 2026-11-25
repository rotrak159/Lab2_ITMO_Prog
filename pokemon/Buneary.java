package pokemon;

import ru.ifmo.se.pokemon.*;
import moves.*;

public class Buneary extends Pokemon {
    public Buneary(String name, int level) {
        super(name, level);
        setType(Type.NORMAL);
        setStats(55, 66, 44, 44, 56, 85);

        addMove(new IceBeam());
        addMove(new Swagger());
        addMove(new ChargeBeam());
    }
}