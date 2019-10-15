public class printMegaBytesAndKiloBytes {
    public static void main(String[] args) {
        int Kilobytes = 5000;
        printMegaBytesAndKiloByte(2500);
        printMegaBytesAndKiloByte(-1024);
        printMegaBytesAndKiloByte(5000);
    }

    public static void printMegaBytesAndKiloByte(int Kilobytes) {
        int Megabytes;
        int RemKB;
        // kb to mb
        //1024kb=1mb
        if (Kilobytes < 0) {
            System.out.println("Invalid Error");
        } else {
            Megabytes = Kilobytes/1024;
            RemKB=Kilobytes%1024;

            System.out.println(Kilobytes + "KB" +" "+ "="+" " + Megabytes +" "+ "MB" +" "+ "and" +" " + RemKB +" "+ "KB");
        }

    }
}