public class PlayingCat {
    public static void main(String[] args) {
        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));
    }

    public static boolean isCatPlaying(boolean Summer, int temperature) {
        boolean isCatplaying = false;
        if (Summer) {
            if (temperature >= 25 && temperature <= 45) {
                isCatplaying = true;
            }
        } else if (!Summer) {
            if (temperature >= 25 && temperature <= 35) {
                isCatplaying = true;
            }
        }
        return isCatplaying;
    }
}
