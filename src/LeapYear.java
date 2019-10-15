public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(1600);
        isLeapYear(2000);
        isLeapYear(2400);
        isLeapYear(1700);
        isLeapYear(1800);
        isLeapYear(1900);
        isLeapYear(2100);
        isLeapYear(2300);
        isLeapYear(2500);
        isLeapYear(2600);
        isLeapYear(2016);

    }

    public static void isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
                System.out.println(year + "is leap year");
            } else {
                System.out.println(year + "is not leap year");
            }
        }
    }
}
