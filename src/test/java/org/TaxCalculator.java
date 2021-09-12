/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Taqyuldeen Alzubaidi
 */



import java.util.Scanner;
import java.lang.Math;


public class TaxCalculator
{
    public static void main (String[] args)
        {
        double order_amount;
        double tax;
        double result;

        tax = 5.5/10; //defining and give "tax" formula

            //Entering the order amount from user:
        Scanner reader = new Scanner (System.in);
        System.out.print ("What is the order amount? ");
        order_amount = reader.nextDouble();

        //user will input the name of State:
        System.out.print("What is the state? ");
        String state_name = reader.next();

        //if-loop used in case user entered 'WI' as an input
        if(state_name .equalsIgnoreCase("WI"))
        {
            System.out.printf ("The subtotal is $%.2f.\n", order_amount );
            System.out.printf("The tax is $%.2f.\n", tax);

        }
             else
                 {
                      tax = 0; //otherwise it's 0 if WI is not entered
                 }

        result = order_amount + tax; //this will add up tax to the order amount that was entered

        // now, displaying the total amount
        System.out.printf("The total is $%.2f.\n", result);

        reader.close();
    }

}