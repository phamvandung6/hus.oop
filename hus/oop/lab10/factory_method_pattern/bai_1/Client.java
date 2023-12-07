package hus.oop.lab10.factory_method_pattern.bai_1;

public class Client {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        dialog.render();
    }

    static void configure() {
        dialog = new WindowsDialog();
    }

}