
import java.util.Scanner;

public class SalesTax {

    public static void main(String[] args) {
        System.out.println("This is the Sales Tax Problem");
        Scanner keyboard = new Scanner(System.in);

        //Prompt use for amount purchased
        System.out.println("Please enter amount purchased");
        //Get amount purchased as a double
        Double AmountPurchased = keyboard.nextDouble();
        //Display amount purchased
        System.out.println("Your amount purchased is $" + AmountPurchased);

        //Set a StateTax variable as double
        //StateTax = Amount Purchased * 0.04
        Double StateTax = AmountPurchased * 0.04;
        System.out.println("Your state sales tax is $" + StateTax);

        //Set a CountyTax variable as double
        //CountyTax = Amount Purchased * 0.02
        Double CountyTax = AmountPurchased * 0.02;
        System.out.println("Your county sales tax is $" + CountyTax);

        //Set a TotalTax variable as double
        //TotalTax = StateTax + CountyTax
        Double TotalTax = StateTax + CountyTax;
        System.out.println("Your total sales tax is $" + TotalTax);
        
        //Set Total variable as double
        //Total = AmountPurchased + TotalTax
        Double Total = AmountPurchased + TotalTax;
        System.out.println("Your total of the sale is $" + Total);
    }

}
