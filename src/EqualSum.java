public class EqualSum {

    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }

    public static boolean hasEqualSum(int no1, int no2, int no3) {
        if (no3 == (no1 + no2)) {
            return true;
        }
      return false;
    }

}
