package lab7;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас CharacterMemento зберігає стан GameCharacter.
 */
public class CharacterMemento {
    private final String name;
    private final Position position;
    private final Inventory inventory;
    private final int healthLevel;

    /**
     * Конструктор для створення менту з поточним станом персонажа.
     *
     * @param name        Ім'я персонажа.
     * @param position    Позиція персонажа.
     * @param inventory   Інвентар персонажа.
     * @param healthLevel Рівень здоров'я персонажа.
     */
    public CharacterMemento(String name, Position position, Inventory inventory, int healthLevel) {
        this.name = name;
        this.position = position;
        // Глибоке копіювання інвентарю
        this.inventory = new Inventory(new ArrayList<>(inventory.getArtifacts()));
        this.healthLevel = healthLevel;
    }

    // Геттери для відновлення стану

    public String getName() {
        return name;
    }

    public Position getPosition() {
        return position;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public int getHealthLevel() {
        return healthLevel;
    }
}
