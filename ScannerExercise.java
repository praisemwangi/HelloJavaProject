import java.util.Scanner;
public class ScannerExercise {

    /* A shopkeeper wants to streamline the process of calculating the total price of items purchase by a customer and offer discounts based on the total amount. Write a java program using the 'Scanner' class to assist the shopkeeper in achieving this.
     The shop offers the following items with respective prices:
     Milk - Ksh 67.50
     Bread - Ksh 95.00
     Eggs - Ksh 20.50
     Sugar - Ksh 250.00
     Tea Masala - Ksh 76.99

     The java program should perform the following tasks:
     1. prompt the shopkeeper to input the quantity of each item sold (in integers) using the Scanner class.
     2. Calculate the total price of all items.
     3. Apply a discount of 10% if the total is over Ksh 1000.
     4. Display the total price, the applied discount(if any) and the final balance payable by the customer.
     */

    public static void main(String[] args){
        Scanner  sc = new Scanner(System.in);
        double milk = 67.50;
        double bread = 95.00;
        double eggs = 20.50;
        double sugar = 250.00;
        double tea_masala = 76.99;

        System.out.print("Please enter quantity of milk sold: ");
        int milkquantity = sc.nextInt();

        System.out.print("Please enter quantity of bread sold: ");
        int breadquantity = sc.nextInt();

        System.out.print("Please enter quantity of eggs sold: ");
        int eggsquantity = sc.nextInt();

        System.out.print("Please enter quantity of sugar sold: ");
        int sugarquantity = sc.nextInt();


        System.out.print("Please enter quantity of tea masala sold: ");
        int tea_masalaquantity = sc.nextInt();

        // Calculate the total price of each item.

        double totalPrice = (milk * milkquantity) + (bread * breadquantity) + (eggs * eggsquantity) + (sugar * sugarquantity) + (tea_masala * tea_masalaquantity);

        double discount = (totalPrice > 1000) ? (totalPrice * 0.10) : 0.0;

        double finalBalance = totalPrice - discount;

        System.out.println("totalPrice: Ksh" + totalPrice);
        System.out.println("Discount Applied: Ksh. " + discount);
        System.out.println("Final Balance: Ksh. " + finalBalance);

        sc.close();





    }
}


