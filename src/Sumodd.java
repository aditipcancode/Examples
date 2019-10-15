public class Sumodd {
    public static void main(String[] args) {

        System.out.println(isOdd(8));
        System.out.println(isOdd(-8));
        System.out.println(isOdd(7));
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
    }

    public static boolean isOdd(int number) {
        boolean isOdd = false;

        if (number > 0) {
            if (number % 2 != 0) {
                isOdd = true;
            }
        }
        return isOdd;
    }


    private static int sumOdd(int start, int end) {
        int sumOdd = -1;
        int sum = 0;
        if (start > 0 && end >= start) {
            for (int i = start; i <= end; i++) {

                if (isOdd(i))
                    sum += i;


            }
            return sum;
        }
        {
            return -1;
        }

    }

}