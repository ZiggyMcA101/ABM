package abm;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class ABM { 
    public static void main(String[] args) {
    int PIN = 2378, amnt, CB = 0, inptPIN, i=0, menu, rtn;        
    String name;
    
    Scanner input = new Scanner(System.in);
       name = JOptionPane.showInputDialog("What is your name?");
    
    System.out.println("Please input your PIN:");
    inptPIN = input.nextInt();
    
    System.out.println();
   
    while (inptPIN != PIN)
    {
        JOptionPane.showMessageDialog(null, "Please input the correct PIN");
        
        System.out.println("Please input your PIN:");
        inptPIN = input.nextInt();
    System.out.println();
    i++;
    
    if(i > 1)
    {
        JOptionPane.showMessageDialog(null, "Three Incorrect PINs");
        break;
    }
    }
    
    while (inptPIN == PIN)
    {
        System.out.println("Welcome to the Bank of Nassau \nCustomer: "+name);
    
    System.out.println();
    
    System.out.println("ABM MENUE\n------------------------------");
    
    System.out.println("1. Withdrawn\n2. Deposit\n3. Check Balance\n4. Logout");
    
System.out.println();

    menu = input.nextInt();
    
System.out.println();    
    if (menu == 1)
    {
        System.out.println("Account Withdraw \n------------------------");
        System.out.print("Amount: $");
        amnt = input.nextInt();
        System.out.println("------------------------");
        
System.out.println();

    if (CB < amnt)
    {
        JOptionPane.showMessageDialog(null, "Insufficient funds");
    }
    
    else 
    {
        CB = CB - amnt;
        
    System.out.println("Account Withdrawal \n------------------------------\nAmount withdrawn: $"+amnt+""
            + "\nCurrent balance: $"+CB+"\n------------------------------");
    
System.out.println();

    System.out.println("1. Return");
    rtn = input.nextInt();
    
System.out.println();    
    }
    
    }
    
    if (menu == 2)
    {
        System.out.println("Account Deposit \n------------------------");
        System.out.print("Amount: $");
        amnt = input.nextInt();
        System.out.println("------------------------");    
        
System.out.println();        
        
      CB = CB + amnt;
      
    System.out.println("Account Deposit \n------------------------------\nAmount deposited: $"+amnt+""
            + "\nCurrent balance: $"+CB+"\n------------------------------");    
    
System.out.println();

    System.out.println("1. Return");
    rtn = input.nextInt();
    
System.out.println();    
    }
    
    if (menu == 3)
    {
    System.out.println("Current balance"
            + "\nSavings: $"+CB+"\n------------------------------");  
    
System.out.println();    

    System.out.println("1. Return");
    rtn = input.nextInt();

System.out.println();
    }
    
    if (menu == 4)
    {
     break;
    }
    }
    
    }
}
