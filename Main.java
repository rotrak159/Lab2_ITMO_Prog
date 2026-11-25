import ru.ifmo.se.pokemon.*;
import pokemon.*;

public class Main {
    public static void main(String[] args) {

        Battle battle = new Battle();

        // Первая команда
        Pokemon hoopa = new Hoopa("Андрей", 75); // 75
        Pokemon buneary = new Buneary("Борис", 1); // 1
        Pokemon lotad = new Lotad("Виталий", 1); // 1

        // Вторая команда
        Pokemon lopunny = new Lopunny("Григорий", 2); // 2
        Pokemon lombre = new Lombre("Дмитрий", 14); // 14
        Pokemon ludicolo = new Ludicolo("Егор", 14); // 14

        // Добавляем покемонов в команды
        battle.addAlly(hoopa);
        battle.addAlly(buneary);
        battle.addAlly(lotad);

        battle.addFoe(lopunny);
        battle.addFoe(lombre);
        battle.addFoe(ludicolo);

        // Запускаем сражение
        battle.go();
    }
}