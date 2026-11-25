package moves;

import ru.ifmo.se.pokemon.*;

public final class ChargeBeam extends SpecialMove {
    public ChargeBeam() {
        super(Type.ELECTRIC, 50, 0.9);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        if (Math.random() <= 0.7) {
            p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, 1));
        }
    }
}