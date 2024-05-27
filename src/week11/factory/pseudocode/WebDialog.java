package factory.dialogproblem;

public class WebDialog extends Dialog{
    @Override
    public Button createButton() {
        return new WebButton();
    }
}
