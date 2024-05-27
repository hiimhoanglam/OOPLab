package week11.abstractfactory.pseudocode;

public class Application {
    private GUIFactory guiFactory;
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory guiFactory) {
        this.guiFactory = guiFactory;
    }
    public void createUI() {
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }
    public void render() {
        this.button.paint();
        this.checkbox.paint();
    }
}
