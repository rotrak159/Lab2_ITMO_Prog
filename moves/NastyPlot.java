package moves;

import ru.ifmo.se.pokemon.*;

public final class NastyPlot extends StatusMove {
    public NastyPlot() {
        super(Type.DARK, 0, 1.0);
    }

    @Override
    protected void applySelfEffects(Pokemon p) {
        p.addEffect(new Effect().stat(Stat.SPECIAL_ATTACK, 2));
    }
}
