public class TeenNumberChecker {
    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));
        System.out.println(hasTeen(0, 1, -1));
        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int x, int y, int z) {
        if ((x >= 13 && x <= 19) || (y >= 13 && y <= 19) || (z >= 13 && z <= 19)) {
            return true;
        }
        return false;
    }
    public static boolean isTeen(int x){
        if(x>=13 && x<=19) {
            return true;
        }
        return false;
    }
}
