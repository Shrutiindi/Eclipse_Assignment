import java.util.Scanner;

public class Assignment7 {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the age:");
        int age=sc.nextInt();
        System.out.println("Enter the salary");
        double salary=sc.nextDouble();
        if(age>=18 && salary>=25000){
            System.out.println("Status: Eligible");
        }
        else{
            System.out.println("Status: Not Eligible");
        }
    }
}
