package hus.oop.lab10.command_pattern.bai_1;

class ShutDownCommand implements Command {
    private Computer computer;

    public ShutDownCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.shutDown();
    }
}