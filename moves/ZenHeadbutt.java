package moves;

import ru.ifmo.se.pokemon.*;

public final class ZenHeadbutt extends PhysicalMove {
    public ZenHeadbutt() {
        super(Type.PSYCHIC, 80, 0.9);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.2) {
            Effect.flinch(p);
        }
    }
}