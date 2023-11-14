package hus.homework;

public class DateUtil {
    public static boolean isLeapYear(int year) {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    public static boolean isValidDate(int year, int month, int day) {
        if (month < 1 || month > 12) {
            return false;
        }
        if (year < 1 || year > 9999) {
            return false;
        }

        if (day < 1 || day > getDaysInMonth(year, month)) {
            return false;
        }
        return true;
    }

    public static int getDaysInMonth(int year, int month) {
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (month == 2 && isLeapYear(year)) {
            return 29;
        }
        return daysInMonth[month - 1];
    }

    
    
    public static void main(String[] args) {
        System.out.println(isLeapYear(1900));
        System.out.println(isLeapYear(2000));

        System.out.println(isValidDate(2012, 2, 29));
        System.out.println(isValidDate(2012, 2, 30));
    }
}
