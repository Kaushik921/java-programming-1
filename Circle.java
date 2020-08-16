import java.util.*;

class Circle{
    private double radius;
    private String color;
    Circle(){
        radius = 1.0;
        color="red";
    }
    Circle(double r){
        radius = r;
        color="red";
    }
    public double getRadius(){
        return radius;
    }
    public double getArea(){
        return radius*radius*3.14;
    }
}
class Circle1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Creating the instance1
        Circle c1 = new Circle();
        System.out.println("The circle has radius of "+ c1.getRadius() + " and area of " + c1.getArea());
        System.out.println("Enter the radius");
        double r1= sc.nextDouble();
        //Creating the instance2
        Circle c2 = new Circle(r1);
        System.out.println("The circle has radius of "+ c2.getRadius() + " and area of " + c2.getArea());
    }
}
