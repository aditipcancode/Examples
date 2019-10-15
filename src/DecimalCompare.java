public class DecimalCompare {
    public static void main(String[] args) {
        System.out.println( DecimalCheck(-3.1567,-3.1568));
        System.out.println( DecimalCheck(3.157,3.156));
    }
    public static boolean DecimalCheck(double d1,double d2)
    {
        if(((int)(d1*1000)) == ((int)(d2*1000)))
        {
           return true;
        }
        return false;
    }
}
