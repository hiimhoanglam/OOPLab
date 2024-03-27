package week5.mytime;

public class MyTime {
    private int hour;
    private int minute;
    private int second;

    public MyTime(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public MyTime() {
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
    }
    public void setTime(int hour, int minute, int second) {
        if (0 <= hour && hour <= 23 && minute >= 0 && minute <= 59 && second >= 0 && second <= 59) {
            this.hour = hour;
            this.minute = minute;
            this.second = second;
        }
        else {
            throw new IllegalArgumentException("Invalid hour, minute or second!");
        }
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (0 <= hour && hour <= 23) {
            this.hour = hour;
        }
        else {
            throw new IllegalArgumentException("Invalid hour, minute or second!");
        }
    }

    public void setMinute(int minute) {
        if (0 <= minute && minute <= 59) {
            this.minute = minute;
        }
        else {
            throw new IllegalArgumentException("Invalid hour, minute or second!");
        }
    }

    public void setSecond(int second) {
        if (0 <= second && second <= 59) {
            this.second = second;
        }
        else {
            throw new IllegalArgumentException("Invalid hour, minute or second!");
        }
    }

    @Override
    public String toString() {
        return String.format("%02d",hour) + ":" + String.format("%02d",minute) + ":" + String.format("%02d",second);
    }
    public MyTime nextSecond() {
        second++;
        if (second >= 60) {
            second = 0;
            nextMinute();
        }
        return this;
    }

    public MyTime nextMinute() {
        minute++;
        if (minute >= 60) {
            minute = 0;
            nextHour();
        }
        return this;
    }

    public MyTime nextHour() {
        hour++;
        if (hour >= 24) {
            hour = 0;
        }
        return this;
    }

    public MyTime previousSecond() {
        second--;
        if (second < 0) {
            second = 59;
            previousMinute();
        }
        return this;
    }

    public MyTime previousMinute() {
        minute--;
        if (minute < 0) {
            minute = 59;
            previousHour();
        }
        return this;
    }

    public MyTime previousHour() {
        hour--;
        if (hour < 0) {
            hour = 23;
        }
        return this;
    }
}
