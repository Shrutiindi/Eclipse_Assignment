public class Assignment2 {
    public static void main(String[] args)
    {
        String productName = "Wireless Headphones";
        double price = 49.99;
        int quantity = 3;
        final double TAX_RATE = 0.18; // 18% Tax

        // Perform calculations
        double subtotal = price * quantity;
        double taxAmount = subtotal * TAX_RATE;
        double finalTotal = subtotal + taxAmount;

        // Display the invoice details
        System.out.println("----- INVOICE -----");
        System.out.println("Product:  " + productName);
        System.out.println("Price:    "+ price);
        System.out.println("Quantity: " + quantity);
        System.out.println("-------------------");
        System.out.println("Subtotal:     " +subtotal);
        System.out.println("Tax (18%%):   " +taxAmount);
        System.out.println("Total:        " +finalTotal);
        System.out.println("-------------------");
    }
}
