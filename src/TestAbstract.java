public class TestAbstract {
    public static void main(String[] args) {

       // Shape s=new Circle1();//In real scenario, object is provided through method e.g. getShape() method
       // s.draw();
        Student ft = new Fulltime();
        ft.tutionFee();

        Student pt = new Parttime();
        pt.tutionFee();

        Student ts= new Student() {
            @Override
            void tutionFee() {
                System.out.println(456);
            }
        };
        ts.tutionFee();
    }
}
/*
abstract class Shape{
    abstract void draw();
}
//In real scenario, implementation is provided by others i.e. unknown by end user
class Rectangle extends Shape{
    void draw(){System.out.println("drawing rectangle");}
}

class Circle1 extends Shape{
    void draw(){System.out.println("drawing circle");}
}*/

abstract class Student {

    //private String Name;
    //private Boolean Status;
    abstract void tutionFee();

}
class Fulltime extends Student {
    @Override
     void  tutionFee() {
        System.out.println(2000);
    }
}
 class Parttime extends Student {

     void tutionFee() {

        System.out.println(200);

    }
}
