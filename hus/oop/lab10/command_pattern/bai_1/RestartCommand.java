package hus.oop.lab10.command_pattern.bai_1;

class RestartCommand implements Command {
    private Computer computer;

    public RestartCommand(Computer computer) {
        this.computer = computer;
    }

    public void execute() {
        computer.restart();
    }
}