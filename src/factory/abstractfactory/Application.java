package factory.abstractfactory;

public class Application {
    private GUIFactory guiFactory;
    private Button button;
    private Checkbox checkbox;

    public Application(String os) {
        if (os.equals("Windows")) {
            this.guiFactory = new WindowsFactory();
        }
        else if (os.equals("MacOS")) {
            this.guiFactory = new MacFactory();
        }
        else {
            throw new IllegalArgumentException("Invalid type of OS");
        }
        this.button = guiFactory.createButton();
        this.checkbox = guiFactory.createCheckbox();
    }
    public void render() {
        this.button.onClick();
        this.checkbox.onClick();
    }
}
