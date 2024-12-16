package lab7;
import java.util.Stack;

/**
 * Клас Caretaker відповідає за збереження та відновлення ментів.
 */
public class Caretaker {
    private Stack<CharacterMemento> mementoStack = new Stack<>();

    /**
     * Зберігає мент у стек.
     *
     * @param memento Мент для збереження.
     */
    public void saveMemento(CharacterMemento memento) {
        mementoStack.push(memento);
    }

    /**
     * Відновлює останній збережений мент.
     *
     * @return Останній збережений мент або null, якщо стек порожній.
     */
    public CharacterMemento restoreMemento() {
        if (!mementoStack.isEmpty()) {
            return mementoStack.pop();
        }
        return null;
    }
}
