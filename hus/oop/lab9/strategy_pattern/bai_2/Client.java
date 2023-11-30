package hus.oop.lab9.strategy_pattern.bai_2;

public class Client {
    public static void main(String[] args) {
        Context context = new Context();

        // Read first number.
        int firstNumber = 1;

        // Read last number.
        int lastNumber = 3;

        // Read the desired action from user input.
        String action = "addition";

        if (action.equals("addition")) {
            context.setStrategy(new ConcreteStrategyAdd());
        } else if (action.equals("subtraction")) {
            context.setStrategy(new ConcreteStrategySubtract());
        } else if (action.equals("multiplication")) {
            context.setStrategy(new ConcreteStrategyMultiply());
        }

        int result = context.executeStrategy(firstNumber, lastNumber);
        System.out.println("Result: " + result);
    }
}