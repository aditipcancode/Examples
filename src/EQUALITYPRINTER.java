public class EQUALITYPRINTER {
    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int x, int y, int z) {
        if (x < 0 || y < 0 || z < 0) {
            System.out.println("Invalid");
        } else if (x == y && y == z) {
            System.out.println("Equal");
        } else if ((x != y) && (y != z) && (x != z)) {
            System.out.println("Different");
        } else {
            System.out.println("Neither all are equal or different");
        }

    }
}

