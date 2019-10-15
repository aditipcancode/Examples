public class speedConverter {
    public static void main(String[] args) {
        long kiloMetersPerHour = 2;
        long milesperhour = toMilesPerHours(kiloMetersPerHour);
        System.out.println(milesperhour);
        printConversion(kiloMetersPerHour);
    }

    public static long toMilesPerHours(long kiloMetersPerHour) {
        long milesperhour;
        if (kiloMetersPerHour < 0) {
            milesperhour = -1;
        } else {
            milesperhour = (Math.round(kiloMetersPerHour * 0.621371));
        }
        return milesperhour;
    }

    public static void printConversion(double kiloMeterPerHours) {
        double milesPerHour;
        if (kiloMeterPerHours < 0) {
            System.out.println("Invalid value");
        } else {
            //convert miles to kilometer;
            milesPerHour = kiloMeterPerHours * 0.621371;
            //print km/h to miles/h
            System.out.println(kiloMeterPerHours + "km/h=" + milesPerHour + "mi/h");
        }


    }
}
