import java.util.Scanner;
import java.io.*;
public class AtmMachine1
{
   public static void main(String args[])
    {
                    
              boolean loop = true;
	      int balance=10000,withdraw  ,deposit,i,amount=100;
	      String pin="1234" ,cardNo,pin2, user,pass,enteredPin;
                      
              Scanner s=new Scanner(System.in);
     while(loop) //loop1
        {
                System.out.println(" Hello:enter your card no:");
                cardNo=s.nextLine();
     if(!(cardNo.equals("1234567890123456")))

            {
             System.out.println("Error: invalid card number!!!");
             System.out.println("...press the Enter key Enter the card no.again");
             System.out.println("Press ctrl-c to exit");
             s.nextLine();
            } // card wala if band kr diya

          else
             loop=false;
          }// while loop 1 closed

             System.out.print("Enter the pin Number:");
             enteredPin=s.nextLine();
             System.out.print("Enter the username: ");
             user=s.nextLine();
             System.out.print("Enter the password: ");
             pass=s.nextLine();

     if(( pin.equals(enteredPin)) && (user.equals("shalu")) && (pass.equals("kumari")))
              System.out.println("");
      else
        {
       for(i=0;i<2;i++)
           {
              System.out.println("incorrect credentials.try again.");
              System.out.print("Enter the pin Number:");
              pin=s.nextLine();
              System.out.print("Enter the username: ");
              user=s.nextLine(); 
              System.out.print("Enter the password: ");
              pass=s.nextLine();
       if(  pin.equals(enteredPin) && user.equals("shalu") && pass.equals("kumari"))
                break;
            } // for closed

               if(i==2)
		{
		System.out.println("you are blocked due to three times wrong credentials");
		java.lang.System.exit(0);
		}    

           }// kuchh to band hua hai pata nhi kya
      
    while(true) {   // while loop number 2 
               System.out.println("welcome Axis Bank of India.");
               System.out.println("**********ATM***********\n");
               System.out.println("if you want to change language:");
              Scanner s0=new Scanner(System.in);
               String choose=s0.nextLine();
                 String option="English";
                 if(choose.equals(option)){
             System.out.println("English");}
               else
                   {
                         System.exit(0);
                  }
               System.out.println("1.withdraw");
               System.out.println("2.deposit");
               System.out.println("3.ckeck balance");
               System.out.println("4.change pin:"); 
               System.out.println("choose 5 for exit");
               System.out.println("************?*************?*\n\n");
               System.out.println("choose  operation you want to be perform: ");
               int n=s.nextInt();
      switch(n)
            {
        case 1:  System.out.println("**1.saving account:**");
                 System.out.println("**2.current account:**");
                 System.out.println("Enter the amount in multiple of 100");
                 withdraw=s.nextInt();

        if(withdraw %100==0)
             {
                System.out.println("if you want to be print recepit:");
                 Scanner s1=new Scanner(System.in);
                 String choice=s1.nextLine();
         String check="yes";

   if(choice.equals(check))

{
     System.out.println("please collect your money:");

             

         if(withdraw>=balance-500)
             {
                System.out.println("insufficent balance:");
             }

         else{
             int r1=0,r2=0,r3=0,r4=0;
             amount = withdraw;
        while(amount!=0)
{
    if(amount >= 2000){ amount -= 2000; r4++; }
    else if(amount >= 500){ amount -= 500;  r3++; }
    else if(amount >= 200){ amount -= 200;  r2++; }
    else if(amount >= 100){ amount -= 100;  r1++; } 
}// while closed

if(r4 != 0) System.out.println("Rs.2000 x " + r4 + " = " + 2000 * r4);
if(r3 != 0) System.out.println("Rs.500 x " + r3 + " = " + 500 * r3);
if(r2 != 0) System.out.println("Rs.200 x " + r2 + " = " + 200 * r2);
if(r1 != 0) System.out.println("Rs.100 x " + r1 + " = " + 100 * r1);
balance -= withdraw;
               System.out.println(" please collect money:");                         
               System.out.println(" balance:"+balance);
       }    
  }
}
       break;
       case 2:
                System.out.println("Enter your deposit:");
                deposit=s.nextInt();
                balance=deposit+balance;
                System.out.println("your money has been successfully deposit");
                System.out.println(" balance:"+balance);
                System.out.println("");
       break;
       case 3:
                System.out.println("balance:"+balance);
                System.out.println("");
       break;
       case 4:
                System.out.println("want to change your pin:");
                System.out.println("Enter the previous pin:");
                s.nextLine();
                enteredPin=s.nextLine();
       if(pin.equals(enteredPin))
            {
       
do
{                
System.out.println("Enter  your new pin:");
 enteredPin=s.nextLine();
}while(enteredPin.length()!=4);
                pin=enteredPin;
                System.out.println("your pin is successfully changed:");
                s.nextLine();
            }
         else
                System.out.println("Incorrect pin !!!");
         break;
         case 5:
        
                 System.out.println("Thank you  for use the Atm services:");
                 System.exit(0);
          
 
          }

          // else
                  //   {
                         // System.exit(0);
                   //}
         }
   
      }
  
}
