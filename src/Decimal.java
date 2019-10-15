public class Decimal {
    public static void main(String[] args) {

        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.213, 3.213));
    }

    public static boolean areEqualByThreeDecimalPlaces(double no1, double no2) {

        String inputStr1 = Double.toString(no1);
        String inputStr2 = Double.toString(no2);

        String[] inputArrStr1 = inputStr1.split("\\.");
        String[] inputArrStr2 = inputStr2.split("\\.");
        boolean isEqual = false;

        if (inputArrStr1[0].compareTo(inputArrStr2[0])==0) {

            if (inputArrStr1[1].length() >= 3 && inputArrStr2[1].length() >= 3) {
                if (inputArrStr1[1].substring(0, 3) .compareTo(inputArrStr2[1].substring(0, 3))==0)
            {
                    isEqual = true;
                }
            }
           else if (inputArrStr1[1].length() >= 2 && inputArrStr2[1].length() >= 2) {
                if (inputArrStr1[1].substring(0, 2).compareTo(inputArrStr2[1].substring(0, 2))==0) {
                    isEqual = true;
                }
            }
           else if (inputArrStr1[1].length() >= 1 && inputArrStr2[1].length() >= 1) {
                if (inputArrStr1[1].substring(0, 1).compareTo( inputArrStr2[1].substring(0, 1))==0) {
                    isEqual = true;
                }
            }
        }
        return isEqual;
    }
}


