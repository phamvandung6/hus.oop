package hus.oop.lab10.command_pattern.bai_3;

// Step 4: Sử dụng Command Pattern
public class Client {
    public static void main(String[] args) {
        // Tạo một đối tượng Light
        Light light = new Light();

        // Tạo các đối tượng Command
        Command lightOnCommand = new LightOnCommand(light);
        Command lightOffCommand = new LightOffCommand(light);

        // Tạo đối tượng Invoker
        RemoteControl remoteControl = new RemoteControl();

        // Thiết lập Command cho Invoker
        remoteControl.setCommand(lightOnCommand);

        // Nhấn nút để thực thi Command
        remoteControl.pressButton(); // Output: Light is on

        // Thiết lập Command khác cho Invoker
        remoteControl.setCommand(lightOffCommand);

        // Nhấn nút để thực thi Command khác
        remoteControl.pressButton(); // Output: Light is off
    }
}