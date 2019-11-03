public class sumFirstAndLastDigit {
    public static void main(String[] args) {
        System.out.println(SumFirstAndLastDigit(87));
    }

    public static int SumFirstAndLastDigit(int number) {
        if (number < 0) {
            System.out.println("INVALID ERROR");
        }

        int lastdigit = number % 10;
        System.out.println(lastdigit);
        number = number - lastdigit;
        while (number < 1) {
            number /= 10;
        }
        return number;
    }
}
