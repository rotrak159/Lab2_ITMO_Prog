package moves;

import ru.ifmo.se.pokemon.*;

public final class Astonish extends PhysicalMove {
    public Astonish() {
        super(Type.GHOST, 30, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect.flinch(p);
        }
    }
}