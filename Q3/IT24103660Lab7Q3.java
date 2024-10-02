import java.util.Scanner;

public class IT24103660Lab7Q3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        //using for loop for 5 customers

        for (int customer = 1; customer <= 5; customer++) 
            {
            System.out.println("Customer " + customer);

            // Enter total bill amount

            System.out.print("Enter total bill amount: ");

            double billAmount = sc.nextDouble();

            // Enter payment mode
            System.out.print("Enter mode of payment (C for cash, O for other): ");

            char paymentMode = sc.next().charAt(0);

            // Check payment mode  

            if (paymentMode == 'C' || paymentMode == 'c')
                {
              
                  //calculate discount

                double discount = billAmount * 0.05; // 5% discount
              
             //calculate amount to pay
                double PayAmount = billAmount - discount;

                System.out.println("Discount is: " + discount);
                System.out.println("Amount to be paid: " + PayAmount);

            } 
            else if (paymentMode == 'O' || paymentMode == 'o') 
             {
                System.out.println("No discount applicable");

                System.out.println("Amount to be paid: " + billAmount);
            }  
             else 
                    {
                System.out.println("Payment Mode is Not Valid");
                 }
                     
             //blank line
            System.out.println();        
            }

        
    }
}
