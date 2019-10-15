public class Area {
    public static void main(String[] args) {

        System.out.println(area(5));
        System.out.println(area(-1));
        System.out.println(area(-1.0,4.0));
        System.out.println(area(5.0,4.0));


    }

    public static double area(double radius) {
        double area;
        double areaofcircle = Math.PI * radius * radius;
        if (radius < 0) {
            return -1.0;
        } else {
            return areaofcircle;
        }
    }

    public static double area(double length, double breadth) {
        double areaofrectangle = length * breadth;
        if (length < 0 || breadth < 0) {
            return -1;
        } else {
            return areaofrectangle;
        }
    }
}
