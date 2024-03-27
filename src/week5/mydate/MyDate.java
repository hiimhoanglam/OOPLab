package week5.mydate;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            throw new IllegalArgumentException("Invalid year, month, or day!");
        }
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public MyDate nextDay() {
        int maxDay = getMaxDayOfMonth(year, month);

        if (day < maxDay) {
            day++;
        } else {
            day = 1;
            if (month == 12) {
                month = 1;
                year++;
            } else {
                month++;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month == 12) {
            month = 1;
            year++;
        } else {
            month++;
        }
        int maxDay = getMaxDayOfMonth(year, month);
        if (day > maxDay) {
            day = maxDay;
        }
        return this;
    }

    public MyDate nextYear() {
        year++;
        int maxDay = getMaxDayOfMonth(year, month);
        if (day > maxDay) {
            day = maxDay;
        }
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else {
            if (month == 1) {
                month = 12;
                year--;
            } else {
                month--;
            }
            day = getMaxDayOfMonth(year, month);
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month == 1) {
            month = 12;
            year--;
        } else {
            month--;
        }
        return this;
    }

    public MyDate previousYear() {
        if (month == 2 && day == 29 && isLeapYear(year - 1)) {
            day = 28;
        }
        year--;
        return this;
    }

    private boolean isValidDate(int year, int month, int day) {
        if (year < 1 || month < 1 || month > 12)
            return false;
        int maxDay = getMaxDayOfMonth(year, month);
        return day >= 1 && day <= maxDay;
    }

    private int getMaxDayOfMonth(int year, int month) {
        return switch (month) {
            case 2 -> isLeapYear(year) ? 29 : 28;
            case 4, 6, 9, 11 -> 30;
            default -> 31;
        };
    }

    private boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    @Override
    public String toString() {
        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        int dayOfWeekIndex = getDayOfWeek(year, month, day);
        String dayOfWeek = daysOfWeek[dayOfWeekIndex];
        String monthStr = months[month - 1];

        return dayOfWeek + " " + day + " " + monthStr + " " + year;
    }

    private int getDayOfWeek(int year, int month, int day) {
        if (month < 3) {
            month += 12;
            year--;
        }
        int century = year / 100;
        year = year % 100;
        int dayOfWeek = (day + 13 * (month + 1) / 5 + year + year / 4 + century / 4 + 5 * century) % 7;
        return (dayOfWeek + 5) % 7; // Adjusting to start from Sunday
    }

}
