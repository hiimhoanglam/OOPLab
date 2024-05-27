package week11.factory.pseudocode;

public class WebDialog extends Dialog {
    @Override
    public Button createButton() {
        return new WebButton();
    }
}
