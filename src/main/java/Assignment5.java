import java.util.Scanner;

public class Assignment5 {
    public static void main(String[] args){
        int num3;
        Scanner sm = new Scanner(System.in);
        System.out.println("Enter the first number");
        int num1=sm.nextInt();
        System.out.println("Enter the second number");
        int num2= sm.nextInt();
        System.out.println("-------------------------------");
        num3=num1+num2;
        System.out.println("Sum        =" +num3);
        num3=num1-num2;
        System.out.println("Difference=" +num3);
        num3=num1*num2;
        System.out.println("Product   =" +num3);
        num3=num1/num2;
        System.out.println("Quotient  =" +num3);
        num3=num1%num2;
        System.out.println("Remainder =" +num3);
        System.out.println("-----------------------------");
    }
}
