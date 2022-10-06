import java.util.*;
interface ATM{
    public void History();
    public void Deposit(int amount);
    public void Withdraw(int amount1);
    public void Transfer(int amount3);
}
class ATM1 implements ATM{
    ArrayList<String> ar = new ArrayList<>();
    
    public int balance=1000; 
    ATM1(){
        boolean f=false;
        Scanner sc= new Scanner(System.in);
        System.out.println("--------------------------Welcome to ATM-------------------------------------");
        System.out.println("*******************************");
        System.out.print("Enter UserId :- ");
        String u =sc.next();
        System.out.print("Enter Password :- ");
        int p =sc.nextInt();
        System.out.println("*******************************");
        
        if(u.equals("Abhay") && p==1234){
           f=true;
           
           while(f==true){
            System.out.println("SELECT WHAT YOU WANT TO DO?");
           System.out.println("PRESS 1 --------->Deposit");
           System.out.println("PRESS 2 --------->Withdraw");
           System.out.println("PRESS 3 --------->Transfer");
           System.out.println("PRESS 4 --------->History");
           System.out.println("PRESS 5 --------->EXIT");
           int c=sc.nextInt();
           switch(c){
               case 1:
                   System.out.println("Enter Amount You Want To Deposit");
                   int amount=sc.nextInt();
                   Deposit(amount);
                   break;
               case 2:
                   System.out.println("Enter Amount You Want To Withdraw");
                   int amount1=sc.nextInt();
                   Withdraw(amount1);
                   break;
               case 3:
                   System.out.println("Enter Amount You Want To Transfer");
                   int amount3=sc.nextInt();
                   Transfer(amount3);
                   break;
               case 4:
                   System.out.println("---------------------------------------------------------------");
                   System.out.println("Transaction History are : ");
                   History();
                   break;
                   
               case 5:
                   System.out.println("Please Collect your Card!");
                   System.out.println("Thank You for Choosing Us!");
                   System.out.println("Logging Out");
                   f=false;
           }
           
           
        }
        }
        else{
            System.out.println("Invalid UserId or Password");
            System.out.println("Please Enter Valid UserId and Password");
            System.out.println("Thank You");
        }
    }
    
    public void Deposit(int amount){
        balance+=amount;
        System.out.println("---------------------------------------------------------------");
        System.out.println("--------------Amount Depositted Sucessfully--------------------");
        System.out.println("Amount Depositted is: "+amount);
        System.out.println("Total Balance of Account is: "+balance);
        System.out.println("---------------------------------------------------------------");
        ar.add("Deposit: "+amount+"  ||  Balance: "+balance);
        System.out.println("");
        System.out.println("");
    }
    public void Withdraw(int amount1){
        Scanner sc = new Scanner(System.in);
        if(balance>=amount1){
        balance-=amount1;
        System.out.println("---------------------------------------------------------------");
        System.out.println("-----------------Withdraw Successfull--------------------------");
        System.out.println("---------------Please Collect Your Cash------------------------");
        System.out.println("Amount Withdrawn is: "+amount1);
        System.out.println("Total Balance of Account After Withdraw is: "+balance);
        System.out.println("---------------------------------------------------------------");
        ar.add("Withdraw: "+amount1+"  ||  Balance: "+balance);
        System.out.println("");
        System.out.println("");
    }
    else{
        System.out.println("Insufficient Balance");
        System.out.println("Please Enter a Valid Amount");
        amount1=sc.nextInt();
        Withdraw(amount1);
    }
    }
    public void Transfer(int amount3){
        Scanner sc=new Scanner(System.in);
        if(balance>=amount3){
        balance-=amount3;
        System.out.println("----------------------------------------------------------------");
        System.out.println("Enter 4 Digit Account Number to which you want to Transfer Money");
        int a=sc.nextInt();
        System.out.println("--------------------Transaction Successfull!--------------------");
        System.out.println("You Transferred Rs "+amount3+" to Account Number "+a);
        System.out.println("Total Balance of Account After Transfer is: "+balance);
        System.out.println("----------------------------------------------------------------");
        ar.add("Tranfer: "+amount3+"  ||  Balance: "+balance);
        System.out.println("");
        System.out.println("");
        
    }
    else{
        System.out.println("Insufficient Balance");
        System.out.println("Please Enter a Valid Amount");
        amount3=sc.nextInt();
        Transfer(amount3);
        
    }
    }
    public void History(){
        if(ar.size()==0){
           System.out.println("No History Available"); 
        }
        for(int i=ar.size()-1;i>=0;i--){
            System.out.println(ar.get(i));
            System.out.println("----------------------------------------------------------------");
            
        }
        System.out.println("Initial Balance: 1000");
        System.out.println("----------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        
    }
}
public class classATM
{
	public static void main(String[] args) {
		ATM1 a=new ATM1();
		
	}
}
