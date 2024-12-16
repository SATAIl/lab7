package lab7;
import java.util.ArrayList;
import java.util.List;

/**
 * Клас Inventory представляє інвентар персонажа.
 */
public class Inventory {
    private List<String> artifacts;

    /**
     * Конструктор для створення інвентарю.
     */
    public Inventory() {
        this.artifacts = new ArrayList<>();
    }

    /**
     * Конструктор для створення інвентарю з наданим списком артефактів.
     *
     * @param artifacts Список артефактів.
     */
    public Inventory(List<String> artifacts) {
        this.artifacts = artifacts;
    }

    /**
     * Додає артефакт до інвентарю.
     *
     * @param artifact Назва артефакту.
     */
    public void addArtifact(String artifact) {
        artifacts.add(artifact);
    }

    /**
     * Видаляє артефакт з інвентарю.
     *
     * @param artifact Назва артефакту.
     */
    public void removeArtifact(String artifact) {
        artifacts.remove(artifact);
    }

    // Геттер для артефактів

    public List<String> getArtifacts() {
        return artifacts;
    }

    @Override
    public String toString() {
        return artifacts.toString();
    }
}
