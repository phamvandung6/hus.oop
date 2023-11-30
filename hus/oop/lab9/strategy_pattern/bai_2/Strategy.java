package hus.oop.lab9.strategy_pattern.bai_2;

// The strategy interface declares operations common to all supported versions of some algorithm.
interface Strategy {
    int execute(int a, int b);
}

// Concrete strategies implement the algorithm while following the base strategy
// interface.
class ConcreteStrategyAdd implements Strategy {
    public int execute(int a, int b) {
        return a + b;
    }
}

class ConcreteStrategySubtract implements Strategy {
    public int execute(int a, int b) {
        return a - b;
    }
}

class ConcreteStrategyMultiply implements Strategy {
    public int execute(int a, int b) {
        return a * b;
    }
}

// The context defines the interface of interest to clients.
class Context {
    private Strategy strategy;

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public int executeStrategy(int a, int b) {
        return strategy.execute(a, b);
    }
}

