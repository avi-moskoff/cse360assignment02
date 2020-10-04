import cse360assignment02.AddingMachine;

public class Test {
    public static void main(String[] args) {
        AddingMachine addingMachine = new AddingMachine();

        addingMachine.add(4);
        addingMachine.subtract(2);
        addingMachine.add(5);
        System.out.println(addingMachine);
        System.out.println(addingMachine.getTotal());

        addingMachine.clear();
        System.out.println(addingMachine);

        addingMachine.add(2);
        System.out.println(addingMachine);
    }
}
