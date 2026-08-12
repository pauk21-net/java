// This program demonstrates encapsulation in Java by defining a StudentDemo class with private attributes for name and age. It provides public getter and setter methods to access and modify these attributes. The main method prompts the user for input and displays the student's information.
import java.util.Scanner;
class StudentDemo{
    private String name ;
    private int age;
    public String getname(){
        return name;
    }
    public int getage(){
        return age;
    }
    void setname(String name){
        this.name=name;
    }
    void setage(int b){
        age=b;
    }

}
public class StudentEncap {
    public static void main (String [] args){
        String name;
        Scanner sc=new Scanner(System.in);
        StudentDemo ob=new StudentDemo();
        System.out.println("Enter name:");
        name = sc.nextLine();
        ob.setname(name);
        System.out.println("Enter age:");
        int age=sc.nextInt();
        ob.setage(age);
        System.out.println("Name="+ob.getname()+"\nAge="+ob.getage());
        sc.close();
    }
}
