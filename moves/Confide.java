package moves;

import ru.ifmo.se.pokemon.*;

public final class Confide extends StatusMove {
    public Confide() {
        super(Type.NORMAL, 0, 1.0);
    }

    @Override
    protected void applyOppEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, -1));
    }
}