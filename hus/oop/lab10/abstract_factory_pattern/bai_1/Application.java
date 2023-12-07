package hus.oop.lab10.abstract_factory_pattern.bai_1;

public class Application {
    private GUIFactory factory;
    private Button button;

    public Application(GUIFactory factory) {
        this.factory = factory;
    }

    public void createUI() {
        this.button = factory.createButton();
    }

    public void paint() {
        button.paint();
    }
}

class ApplicationConfigurator {
    public static void main(String[] args) {
        WinFactory factory = new WinFactory();
        Application application = new Application(factory);
        application.createUI();
        application.paint();
    }
}
