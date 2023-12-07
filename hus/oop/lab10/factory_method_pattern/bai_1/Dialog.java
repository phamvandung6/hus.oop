package hus.oop.lab10.factory_method_pattern.bai_1;

public abstract class Dialog {
    public abstract Button createButton();

    public void render() {
        Button okButton = createButton();
        okButton.render();
    };
}
