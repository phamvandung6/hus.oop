package hus.oop.lab10.factory_method_pattern.bai_1;

public class HTMLDialog extends Dialog {
    @Override
    public Button createButton() {
        return new HTMLButton();
    }
}
