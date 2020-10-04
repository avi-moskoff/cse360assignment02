package cse360assignment02;

public class AddingMachine {
    private int total;
    private String history;

    /**
     * Constructor
     */
    public AddingMachine() {
        total = 0;  // not needed - included for clarity
        history = "0";
    }

    /**
     * Gets the total
     *
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * Add to total
     *
     * @param value the value to add to the total
     */
    public void add(int value) {
        total += value;
        history += " + " + value;
    }

    /**
     * Subtract from total
     *
     * @param value the value to subtract from total
     */
    public void subtract(int value) {
        total -= value;
        history += " - " + value;
    }

    /**
     * @return a history of the transactions made by the adding machine.
     */
    public String toString() {
        return history;
    }

    /**
     * Clears the memory
     */
    public void clear() {
        total = 0;
        history = "0";
    }
}