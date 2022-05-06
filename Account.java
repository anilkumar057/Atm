import java.util.*;

public class Account {

    private HashMap<Integer,Float> amount=new HashMap<>();
    private HashMap<Integer,Integer> user=new HashMap<>();
    public Account(){
        user.put(88244613, 1234);
        user.put(88244614, 2345);
        amount.put(88244613, 0F);
        amount.put(88244614,0F);
    }
    public boolean userAuthentication(int acc,int pin){
        if(user.containsKey(acc) && user.get(acc)==pin){
            return true;
        }
        else{
            System.out.println("\nYour have enter wrong account number or pin");
            return false;
        }
    }
    public float viewBalance(int acc){
        return amount.get(acc);
    }
    public void withdrawl(int acc,float amountWithdrawl){
        float availableAmount=amount.get(acc);
        if(availableAmount>=amountWithdrawl){
            availableAmount=availableAmount-amountWithdrawl;
            amount.replace(acc, availableAmount);
            System.out.println("Your remaining balance is: "+availableAmount);
        }
        else{
            System.out.println("you don't have sufficent amount to withdrawl");
            System.out.println("your balance is: "+availableAmount);
        }
    }
    public void deposit(int acc,float depositAmount){
        float availableAmount=amount.get(acc);
        availableAmount=availableAmount+depositAmount;
        amount.replace(acc,availableAmount);
        System.out.println("Your balance is: "+availableAmount);
    }
}
