public class LeapYear {
    public static void main(String[] args) {
        isLeapYear(-1600);
        isLeapYear(1600);
        isLeapYear(2017);
        isLeapYear(2000);
        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));

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

    public static int getDaysInMonth(int month, int year) {
        int numberOfDays;
        if ((month < 1 || month > 12) && (year >= 1 || year <= 9999)) {
            return -1;
        }
        {

            if (month == 4 || month == 6 || month == 9 || month == 11)
                numberOfDays = 30;
            else if (month == 2) {
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                if (isLeapYear)
                    numberOfDays = 29;
                else
                    numberOfDays = 28;
            } else
                numberOfDays = 31;

        }
        return numberOfDays;
    }
}
