package hus.oop.lab10.factory_method_pattern.bai_1;

public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

}
