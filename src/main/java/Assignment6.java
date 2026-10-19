import java.util.Scanner;

public class Assignment6 {
    public static void main(String[] args){
        double SI;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle amount (P):");
        double p= sc.nextDouble();
        System.out.println("Enter the annual rate of interest (R):");
        double r= sc.nextDouble();
        System.out.println("Enter the Time period (T):");
        double t=sc.nextDouble();
        SI=(p*r*t)/100;
        System.out.println("-------------------------------");
        System.out.println("Simple interest=" +SI);
        System.out.println("-------------------------------");
    }
}
