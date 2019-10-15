public class printyearanddays {
    public static void main(String[] args) {
        printYearAndDays(525600);
        printYearAndDays(1051200);
        printYearAndDays(561600);
        printYearAndDays(2345600);
    }

    public static void printYearAndDays(long minutes) {
        long hr;
        long day;
        long year;
        if (minutes > 0) {
            hr = minutes / 60;
           // minutes=minutes%60;
            {
                if (hr > 24) {
                    day = hr / 24;
                    hr=hr%24;
                    if (day >=365) {
                        year = day / 365;
                        day=day%365;
                        System.out.println(minutes + "min" + "=" + year + "y" + "and" + day + "d");
                    }
                }
            }
        } else {
            System.out.println("Invalid");
        }

    }
}

