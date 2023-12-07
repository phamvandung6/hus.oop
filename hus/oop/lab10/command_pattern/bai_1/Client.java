package hus.oop.lab10.command_pattern.bai_1;

public class Client {
    public static void main(String[] args) {
        Computer computer = new Computer();

        Command shutdown = new ShutDownCommand(computer);
        Command restart = new RestartCommand(computer);

        Switch s = new Switch();

        String str = "shutdown"; // get value based on real situation

        if (str == "shutdown") {
            s.storeAndExecute(shutdown);
        } else {
            s.storeAndExecute(restart);
        }
    }
}