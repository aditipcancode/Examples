public class Exampler {
    public static void main(String[] args) {
        System.out.println(numberofdaysinmonth(9));
    }
    public static int numberofdaysinmonth(int months)
    {
        int daysInCurrentMonth = java.time.LocalDate.now().lengthOfMonth();
        return  daysInCurrentMonth;
    }

    /*public static boolean getDaysInMonth(int month, int year) {
        if ((month < 1&&month > 12) ) {
            int numberOfDays;
            if (month == 4 || month == 6 || month == 9 || month == 11)
                numberOfDays = 30;
            else if (month == 2)
            {
                boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
                if (isLeapYear)
                    numberOfDays = 29;
                else
                    numberOfDays = 28;
            }
            else
                numberOfDays = 31;
            return true;
        }

        return false;
    }*/
}
