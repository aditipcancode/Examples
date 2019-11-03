public class numberToWords {
    public static void main(String[] args) {
        //NumberToWords(87);
        System.out.println(NumberToWords(87));
    }


    public static int NumberToWords(int number) {
        if (number < 0) {
            System.out.println("INVALID VALUE");
        }

            int lasdigit = number % 10;
            switch (lasdigit) {
                case 0:
                    System.out.println("ZERO");
                    break;
                case 1:
                    System.out.println("ONE");
                    break;
                case 2:
                    System.out.println("TWO");
                    break;
                case 3:
                    System.out.println("THREE");
                    break;
                case 4:
                    System.out.println("FOUR");
                    break;
                case 5:
                    System.out.println("FIVE");
                    break;
                case 6:
                    System.out.println("SIX");
                    break;
                case 7:
                    System.out.println("SEVEN");
                    break;
                case 8:
                    System.out.println("EIGHT");
                    break;
                case 9:
                    System.out.println("NINE");
                    break;
            }
            number = number - lasdigit;
            return number;
        }
    }



/*
    public int getDigitCount() {

    }

    public static int reverse() {

    }*/

