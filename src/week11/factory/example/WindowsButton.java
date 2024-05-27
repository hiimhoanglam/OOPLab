package week11.factory.example;

public class WindowsButton implements Button {
    @Override
    public void onClick() {
        System.out.println("Windows button");
    }
}
