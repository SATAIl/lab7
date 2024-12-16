/**
 * Клас Position представляє позицію в ігровому просторі.
 */
package lab7;
public class Position {
    private int x;
    private int y;

    /**
     * Конструктор для створення позиції.
     *
     * @param x Координата X.
     * @param y Координата Y.
     */
    public Position(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // Геттери та сеттери

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
