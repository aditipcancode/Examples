public class Sumodd {
    public static void main(String[] args) {
        //boolean true;
        // boolean false;
        isOdd(8);
    }

    public static boolean isOdd(int number) {
        if (number > 0) {
            if (number % 2 == 0) {
                System.out.println(number + "is even number");
                return false;
            } else {
                System.out.println(number + "is odd number");
                return true;
            }
        } else {
            return true;
        }
    }
}

//    private static int sumOdd(int start,int end)
//    {
//
//    }
