// This program calculates the sum of digits of a given number using recursion.
import java.util.Scanner;
class metho{
    public static int digi(int n){
        if(n<=0){
            return 0;
        }
        else{
            return (n%10 )+digi(n/10);
        }

    }
}
public class Sumofdig {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       // meth ob=new meth();
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        int result=metho.digi(num);
        System.out.print("Result="+result);
        sc.close();
    }
}