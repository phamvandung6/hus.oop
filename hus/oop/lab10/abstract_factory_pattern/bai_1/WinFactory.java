package hus.oop.lab10.abstract_factory_pattern.bai_1;

public class WinFactory implements GUIFactory{

    @Override
    public Button createButton() {
        return new WinButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WinCheckBox();
    }
    
}
