package moves;

import ru.ifmo.se.pokemon.*;

public final class Bubble extends SpecialMove {
    public Bubble() {
        super(Type.WATER, 40, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        if (Math.random() <= 0.1) {
            p.addEffect(new Effect().stat(Stat.SPEED, -1));
        }
    }
}