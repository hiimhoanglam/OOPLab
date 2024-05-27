package week11.iterator.example;

public class App {
    public static void main(String[] args) {
        EmployeeRepository employeeRepository = new EmployeeRepository();
        Iterator iterator = employeeRepository.getIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        iterator.reset();
        System.out.println("--------------------");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
