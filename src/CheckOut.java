import java.util.Scanner;

public class CheckOut
{
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        double itemPrice = 0;
        double totalPrice = 0;
        boolean newItem = false;

        do
        {
            itemPrice = SafeInput.getRangedDouble(in, "Enter price of item [0.50-9.99]: ", 0.50, 9.99);
            totalPrice = totalPrice + itemPrice;
            totalPrice = Math.round( totalPrice * 100.0 ) / 100.0;
            newItem = SafeInput.getYNConfirm(in, "Do you have another item? [Y/N]: ");
        }while(newItem);
        if (newItem = true)
            System.out.println("Your total cost for the item(s) is: " + totalPrice);
    }
}