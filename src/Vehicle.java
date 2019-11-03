import Car.MonsterTruck.MonsterTruck;
import Car.Truck;


public class Vehicle {
    public static void main(String[] args) {
        Truck tk = new Truck();
        MonsterTruck mt = new MonsterTruck();
        // Car car = new Car();
        //car.m1();
        //car.m2();
        //car.toString();
        mt.m1();
        mt.m2();
        System.out.println(mt.toString());
        //tk.m1();
        //tk.m2();
        // tk.toString();

    }
}
