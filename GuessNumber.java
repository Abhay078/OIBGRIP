import java.util.*;
class Game{
    public int x;
    public int a;
    int noOfGuesses=0;
    
    Game(){
        System.out.println("--------------------Welcome to the Guess Number Game-------------------------");
        
        Random rand =new Random();
        x = rand.nextInt(100);
    }
    void takeUserInput(){
            
            System.out.println("-----------------------Enter your Guessed number-------------------------");
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
    }
    boolean isCorrectNumber(){
        
        int count=0;
        
        noOfGuesses +=1;
        if(a==x){
            
            System.out.format("Correct Answer, You did it in %d attempt",noOfGuesses);
            return true;
        }
        else if(a>x){
            if(noOfGuesses>=7){
                System.out.println("The Guessed number is higher than the actual number.");
                System.out.println("");
                System.out.println("7 trials exhausted");
                return true;
		    
            }
        System.out.println("The Guessed number is higher than the actual number.");
        System.out.println("");
        }
        else if(a<x){
            if(noOfGuesses>=7){
                System.out.println("The Guessed number is Lower than the actual number.");
                System.out.println("");
                System.out.println("7 trials exhausted");
                return true;
                
            }
        System.out.println("The Guessed number is Lower than the actual number.");
        System.out.println("");
        }
        
        return false;
    }
        
    
}
public class GuessNumber
{
	public static void main(String[] args) {
		Game g=new Game();
		boolean b=false;
		while(!b){
		    g.takeUserInput();
		    b=g.isCorrectNumber();
		   
		}
		
		    
		}
		
		
	}
