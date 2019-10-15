public class sumDigit {
    public static void main(String[] args) {
        System.out.println(sumDigits(555555));
    }

    public static int sumDigits(int number) {

        int sum = 0;
        int remainder = 0;
        int quotient = 0;
        while (number > 10) {
            remainder = number % 10;
            quotient = number / 10;
            if (quotient < 10) {
                sum += quotient;
                number=0;
            } else {
                number = quotient;
            }
            if (remainder > 0) {
                sum += remainder;
            }
           // System.out.println(number);
        }

        return sum;
    }
}
