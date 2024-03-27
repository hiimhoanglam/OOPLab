package week5.mytime;

public class TestMyTime {
    public static void main(String[] args) {
        // Test constructor and setters
        MyTime time = new MyTime(23, 59, 59);
        System.out.println("Current time: " + time);

        // Test nextSecond(), nextMinute(), nextHour()
        time.nextSecond();
        System.out.println("Next second: " + time);
        time.nextMinute();
        System.out.println("Next minute: " + time);
        time.nextHour();
        System.out.println("Next hour: " + time);

        // Test previousSecond(), previousMinute(), previousHour()
        time.previousSecond();
        System.out.println("Previous second: " + time);
        time.previousMinute();
        System.out.println("Previous minute: " + time);
        time.previousHour();
        System.out.println("Previous hour: " + time);
    }
}
