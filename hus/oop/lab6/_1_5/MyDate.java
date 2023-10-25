package hus.oop.lab6._1_5;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public static final String[] MONTHS = {
            "Jan", "Feb", "Mar", "Apr", "May", "Jun",
            "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"
    };

    public static final String[] DAYS = {
            "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"
    };

    public static final int[] DAYS_IN_MONTHS = {
            31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31
    };

    public MyDate(int year, int month, int day) {
        setDate(year, month, day);
    }

    public void setDate(int year, int month, int day) {
        if (isValidDate(year, month, day)) {
            this.year = year;
            this.month = month;
            this.day = day;
        } else {
            System.out.println("Invalid date!");
        }
    }

    public void setYear(int year) {
        if (year >= 1 && year <= 9999) {
            this.year = year;
        } else {
            System.out.println("Invalid year!");
        }
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            System.out.println("Invalid month!");
        }
    }

    public void setDay(int day) {
        int daysInMonth = getDaysInMonth(year, month);

        if (day >= 1 && day <= daysInMonth) {
            this.day = day;
        } else {
            System.out.println("Invalid day!");
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

    public String toString() {
        String dayOfWeek = getDayOfWeek(year, month, day);
        String monthStr = MONTHS[month - 1];
        return dayOfWeek + " " + day + " " + monthStr + " " + year;
    }

    public MyDate nextDay() {
        if (day < getDaysInMonth(year, month)) {
            day++;
        } else {
            if (month < 12) {
                month++;
                day = 1;
            } else {
                year++;
                month = 1;
                day = 1;
            }
        }
        return this;
    }

    public MyDate nextMonth() {
        if (month < 12) {
            month++;
        } else {
            year++;
            month = 1;
        }
        day = Math.min(day, getDaysInMonth(year, month));
        return this;
    }

    public MyDate nextYear() {
        if (year < 9999) {
            year++;
        } else {
            System.out.println("Year out of range!");
        }
        day = Math.min(day, getDaysInMonth(year, month));
        return this;
    }

    public MyDate previousDay() {
        if (day > 1) {
            day--;
        } else {
            if (month > 1) {
                month--;
                day = getDaysInMonth(year, month);
            } else {
                year--;
                month = 12;
                day = 31;
            }
        }
        return this;
    }

    public MyDate previousMonth() {
        if (month > 1) {
            month--;
        } else {
            year--;
            month = 12;
        }
        day = Math.min(day, getDaysInMonth(year, month));
        return this;
    }

    public MyDate previousYear() {
        if (year > 1) {
            year--;
        } else {
            System.out.println("Year out of range!");
        }
        day = Math.min(day, getDaysInMonth(year, month));
        return this;
    }

    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (year < 1 || year > 9999) {
            return false;
        }

        if (month < 1 || month > 12) {
            return false;
        }

        int daysInMonth = getDaysInMonth(year, month);
        if (day < 1 || day > daysInMonth) {
            return false;
        }

        return true;
    }

    public static String getDayOfWeek(int year, int month, int day) {
        int y = year;
        int m = month;
        if (m == 1 || m == 2) {
            y--;
            m += 12;
        }
        int h = (day + 2 * m + 3 * (m + 1) / 5 + y + y / 4 - y / 100 + y / 400) % 7;
        return DAYS[h];
    }

    private static int getDaysInMonth(int year, int month) {
        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return DAYS_IN_MONTHS[month - 1];
    }
}