/**
 * Клас Main демонструє використання патерну Memento для GameCharacter.
 */

import lab7.*;

public class Main {
    public static void main(String[] args) {
        // Створення персонажа
        GameCharacter character = new GameCharacter(
                "Герой",
                new Position(0, 0),
                new Inventory(),
                100
        );
        character.getInventory().addArtifact("Меч");
        character.getInventory().addArtifact("Щит");
        System.out.println("Початковий стан: " + character);

        // Створення доглядача
        Caretaker caretaker = new Caretaker();

        // Збереження стану
        caretaker.saveMemento(character.saveState());

        // Зміна стану персонажа
        character.setPosition(new Position(10, 20));
        character.setHealthLevel(20);
        character.getInventory().addArtifact("Меч світла");
        System.out.println("Змінений стан: " + character);

        // Відновлення стану
        CharacterMemento memento = caretaker.restoreMemento();
        if (memento != null) {
            character.restoreState(memento);
            System.out.println("Відновлений стан: " + character);
        } else {
            System.out.println("Немає збережених станів для відновлення.");
        }
    }
}
