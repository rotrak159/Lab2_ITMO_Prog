package pokemon;

import moves.*;

public final class Lopunny extends Buneary {
    public Lopunny(String name, int level) {
        super(name, level);
        setStats(65, 76, 84, 54, 96, 105);

        addMove(new FocusBlast());
    }
}