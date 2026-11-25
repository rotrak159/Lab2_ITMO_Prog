package moves;

import ru.ifmo.se.pokemon.*;

public final class IceBeam extends SpecialMove {
    public IceBeam() {
        super(Type.ICE, 90, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            Effect.freeze(p);
        }
    }
}