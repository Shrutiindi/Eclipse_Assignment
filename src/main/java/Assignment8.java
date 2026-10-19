import java.util.Scanner;

public class Assignment8 {
    public static void main(String[] args){
        Scanner sr= new Scanner(System.in);
        System.out.println("Enter the Delivery Amount");
        double order_fee=sr.nextDouble();
        String delivery_status= (order_fee>=999) ? "Free_Delivery" : "Paid_Delivery";
        System.out.println("Delivery Status=" +delivery_status);

    }
}
