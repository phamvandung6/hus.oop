package hus.oop.lab10.factory_method_pattern.bai_1;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("Button in Windows OS");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! Button says - 'Hello World! in Window'");
    }
    
}
