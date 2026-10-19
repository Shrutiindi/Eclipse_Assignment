import java.util.Scanner;

public class Assignment4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = scanner.nextInt();
        if(num%3==0)
        {
         System.out.println("Number is divisible by 3");
        }
        else
        {
         System.out.println("Number is not divisible by 3");
        }

    }
}
