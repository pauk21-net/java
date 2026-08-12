// This program calculates the perimeter of different shapes (circle, rectangle, triangle, trapezium) using method overloading. It prompts the user for input and displays the calculated perimeter for each shape.
import java.util.Scanner;
class PerimeterMethod {
    float pi=3.14f;
    void peri(double radius) {
        System.out.println("Perimeter of Circle is: "+(2*pi*radius));
    }
    void peri(int side) {
        System.out.println("Perimeter of Rectangle is: "+(4*side));
    }
    void peri(int side1,int side2,int side3){
        System.out.println("Perimeter of Triangle is: "+(side1+side2+side3));
    }
    void peri(double side1,double side2,double side3,double side4){
        System.out.println("Perimeter of Trapezium is: "+(2*(side1+side2)));
    }
}


public class Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PerimeterMethod p = new PerimeterMethod();
        System.out.println("enter side rectangle:");
        int side =sc.nextInt();
        p.peri(side);
        System.out.println("enter radius circle:");
        double radius = sc.nextDouble();
        p.peri(radius);
        System.out.println("enter sides of triangle :");
        int side1 =sc.nextInt();
        int side2 =sc.nextInt();
        int side3 =sc.nextInt();
        p.peri(side1, side2, side3);
        System.out.println("enter sides of trapezium :");
        double side4 =sc.nextDouble();
        double side5 =sc.nextDouble();
        double side6 =sc.nextDouble();
        double side7 =sc.nextDouble();
        p.peri(side4, side5, side6, side7); 
    
        sc.close();
    }
    
}
