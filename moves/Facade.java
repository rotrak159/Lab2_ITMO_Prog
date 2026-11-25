package moves;

import ru.ifmo.se.pokemon.*;

public final class Facade extends PhysicalMove {
    public Facade() {
        super(Type.NORMAL, 70, 1.0);
    }

    @Override
    protected double calcBaseDamage(Pokemon att, Pokemon def) {
        double oldPower = power;

        if (att.getCondition() == Status.BURN ||
                att.getCondition() == Status.POISON ||
                att.getCondition() == Status.PARALYZE) {
            power = power * 2;
        }

        double damage = super.calcBaseDamage(att, def);
        power = oldPower;

        return damage;
    }
}