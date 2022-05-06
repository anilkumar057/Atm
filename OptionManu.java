import java.util.*;

public class OptionManu extends Account{
    Scanner input=new Scanner(System.in);
    public OptionManu(){
        super();
    }
    public void login(){
        int x;
        System.out.println("\nWelcome to the Atm Project!\n");
        do{
            x=1;
            int acc=0,pin=0;
            try{
                System.out.print("Please Enter the Account number: ");
                acc=input.nextInt();
                System.out.print("Please Enter pin: ");
                pin=input.nextInt();
            }
            catch (Exception e){
                System.out.println("\nPlease enter in correct format");
                x=2;
            }
            if(x==1){
                if(userAuthentication(acc,pin)){
                    getAccountTye(acc);
                }
            }
        }
        while(x<3);
    }
    public void getAccountTye(int acc){
        int choice=0;
        do{
            System.out.println("\nSelect the Account Type to access");
            System.out.println("1. Checking Account");
            System.out.println("2 .Saving Account");
            System.out.println("3. Exit");
            System.out.print("choice: ");
            choice=input.nextInt();
            switch(choice){
                case 1:
                    checkingAccount(acc);
                    break;
                case 2:
                    savingAccount(acc);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("You have entered invalid key");
            }
        }
        while(choice!=3);
        
    }
    public void checkingAccount(int acc){
        System.out.println("\n1. View Balance");
        System.out.println("2. Withdrawl Amount");
        System.out.println("3. Deposit Amount");
        System.out.print("choice: ");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                float amount=viewBalance(acc);
                System.out.println("Your balance is: "+amount);
                break;
            case 2:
                System.out.println("Enter amount to withdrawal");
                amount=input.nextFloat();
                withdrawl(acc,amount);
                break;
            case 3:
                System.out.print("\nEnter amount to deposit: ");
                amount=input.nextFloat();
                deposit(acc,amount);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
    public void savingAccount(int acc){
        System.out.println("1. View Balance");
        System.out.println("2. Withdrawl Amount");
        System.out.println("3. Deposit Amount");
        System.out.print("choice: ");
        int choice=input.nextInt();
        switch(choice){
            case 1:
                float amount=viewBalance(acc);
                System.out.println("Your balance is: "+amount);
                break;
            case 2:
                System.out.println("Enter amount to withdrawal");
                amount=input.nextFloat();
                withdrawl(acc,amount);
                break;
            case 3:
                System.out.print("\nEnter amount to deposit: ");
                amount=input.nextFloat();
                deposit(acc,amount);
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
