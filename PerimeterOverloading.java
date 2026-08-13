package OOPSC26CS070;

import java.util.Scanner;

class Perimeter
{
    void perimeter(double radius)
    {
        double p = 2 * 3.14 * radius;
        System.out.println("Perimeter of Circle = " + p);
    }

    void perimeter(int side)
    {
        int p = 4 * side;
        System.out.println("Perimeter of Square = " + p);
    }
    
    void perimeter(int a, int b, int c)
    {
        int p = a + b + c;
        System.out.println("Perimeter of Triangle = " + p);
    }

    void perimeter(double a, double b, double c, double d)
    {
        double p = a + b + c + d;
        System.out.println("Perimeter of Trapezium = " + p);
    }
}

public class PerimeterOverloading
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Perimeter obj = new Perimeter();

        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();
        obj.perimeter(r);

        System.out.print("\nEnter side of square: ");
        int s = sc.nextInt();
        obj.perimeter(s);

        System.out.print("\nEnter three sides of triangle: ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        obj.perimeter(x, y, z);

        System.out.print("\nEnter four sides of trapezium: ");
        double t1 = sc.nextDouble();
        double t2 = sc.nextDouble();
        double t3 = sc.nextDouble();
        double t4 = sc.nextDouble();
        obj.perimeter(t1, t2, t3, t4);

        sc.close();
    }
}
