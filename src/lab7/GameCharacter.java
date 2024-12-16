/**
 * Клас GameCharacter представляє персонажа в ігровому просторі з необхідними атрибутами.
 */
package lab7;
public class GameCharacter {
    private String name;
    private Position position;
    private Inventory inventory;
    private int healthLevel;

    /**
     * Конструктор для створення нового персонажа.
     *
     * @param name        Ім'я персонажа.
     * @param position    Початкова позиція персонажа.
     * @param inventory   Початковий набір артефактів персонажа.
     * @param healthLevel Початковий рівень здоров'я персонажа.
     */
    public GameCharacter(String name, Position position, Inventory inventory, int healthLevel) {
        this.name = name;
        this.position = position;
        this.inventory = inventory;
        this.healthLevel = healthLevel;
    }

    // Геттери та сеттери для атрибутів

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Position getPosition() {
        return position;
    }

    public void setPosition(Position position) {
        this.position = position;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    /**
     * Створює мент (знімок) поточного стану персонажа.
     *
     * @return Мент, що зберігає стан персонажа.
     */
    public CharacterMemento saveState() {
        return new CharacterMemento(name, new Position(position.getX(), position.getY()), new Inventory(inventory.getArtifacts()), healthLevel);
    }

    /**
     * Відновлює стан персонажа з переданого менту.
     *
     * @param memento Мент, що містить збережений стан персонажа.
     */
    public void restoreState(CharacterMemento memento) {
        this.name = memento.getName();
        this.position = memento.getPosition();
        this.inventory = memento.getInventory();
        this.healthLevel = memento.getHealthLevel();
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", position=" + position +
                ", inventory=" + inventory +
                ", healthLevel=" + healthLevel +
                '}';
    }
}
