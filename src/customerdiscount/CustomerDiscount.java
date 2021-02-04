/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package customerdiscount;

import java.util.Scanner;

/**
 *
 * @author Balraj
 */
public class CustomerDiscount {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      	    Scanner scanCusType = new Scanner(System.in); 
       	    Scanner scanSubTotal = new Scanner(System.in); 
            String custmertype =  null;
            double subTotal =0;
            double discount =0;
            double discountAmt =0;
            double total =0;

            System.out.println("Enter Customer Type: ");    
        custmertype = scanCusType.nextLine();
        System.out.println("Enter Subtotal: ");    

        subTotal = scanSubTotal.nextDouble();
                System.out.println("Entered from Github: ");    

        
       
        if (custmertype.equals("R"))                
                {
                    if (subTotal >=250){
                        discount = 25;
                        discountAmt = subTotal * discount/100;
                        total = subTotal - discountAmt;
                        System.out.println("Discount Percent "+discount+" %");
                        System.out.println("Discounted Amount: $" +discountAmt);
                        System.out.println("Total: $" +total);
                    }
                     
                        else if (subTotal >=100 && subTotal <250){
                        discount = 10;
                        discountAmt = subTotal * discount/100;
                        total = subTotal - discountAmt;
                        System.out.println("Discount Percent "+discount+" %");
                        System.out.println("Discounted Amount: $" +discountAmt);
                        System.out.println("Total: $" +total);              
                    }
                          else if (subTotal <100){
                        discount = 0;
                        discountAmt = subTotal * discount/100;
                        total = subTotal - discountAmt;
                        System.out.println("Discount Percent "+discount+" %");
                        System.out.println("Discounted Amount: $" +discountAmt);
                        System.out.println("Total: $" +total);              
                    }
 
                }
        else  if (custmertype.equals("C"))                
                {
                    if (subTotal >=250){
                        discount = 30;
                        discountAmt = subTotal * discount/100;
                        total = subTotal - discountAmt;
                        System.out.println("Discount Percent "+discount+" %");
                        System.out.println("Discounted Amount: $" +discountAmt);
                        System.out.println("Total: $" +total);
                    }
                     
                        else if (subTotal <250){
                        discount = 20;
                        discountAmt = subTotal * discount/100;
                        total = subTotal - discountAmt;
                        System.out.println("Discount Percent "+discount+" %");
                        System.out.println("Discounted Amount: $" +discountAmt);
                        System.out.println("Total: $" +total);              
                    }
 
                }       
    }
    
}
