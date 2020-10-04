package cse360assignment02;

public class AddingMachine {
    private int total;
    private String history;

    public AddingMachine () {
        total = 0;  // not needed - included for clarity
        history = "";
    }

    /**
     * Gets the total
     * @return the total
     */
    public int getTotal () {
        return total;
    }

    /**
     * Add to total
     * @param value the value to add to the total
     */
    public void add (int value) {
        total += value;
        history += "," + value;
    }

    /**
     * Subtract from total
     * @param value the value to subtract from total
     */
    public void subtract (int value) {
        total -= value;
    }

    public String toString () {
        return "";
    }

    public void clear() {
    }
}