import java.util.Scanner;



public class Nim {

public static void main(String[] args){


Scanner in = new Scanner(System.in);
System.out.println("Welcome to Nim!" );
System.out.println("How many sticks to start?");
System.out.println("Choose a number between 5 and 20");
int stickNumber = in.nextInt();
int round = 0;


if((stickNumber < 5) || (stickNumber > 20)){
    System.out.println("You won't play nice? Fine, neither will I.");
    System.out.println("The computer took " +stickNumber+ " sticks! 0 remain. You lose!");
}
else{
    while (stickNumber > 0){
        round++;

       double random = Math.random();
        if(stickNumber > 1){
       if(0.5 > random){
            stickNumber--;
            System.out.println("Round " +round+ ":");
            System.out.println("The computer took 1 stick.");
            System.out.println("Now, " +stickNumber+ " remain.");
        }
            else{
                stickNumber--;
                stickNumber--;
                System.out.println("Round " +round+ ":");
                System.out.println("The computer took 2 sticks.");
            System.out.println("Now, " +stickNumber+ " remain.");
            }
        }
        else{
            System.out.println("Round " +round+ ":");
            System.out.println("The computer took 1 stick.");
            System.out.println("Now, " +stickNumber+ " remain.");
        }
    
            if(stickNumber > 0){


            round++;


            System.out.println("Round " +round+ ":");
            System.out.println("How many sticks will you take? ");
            System.out.println("(Enter 2 for 2 sticks, and anything else for 1): ");
            int humanSticks = in.nextInt();
            
            if(humanSticks == 2){
                stickNumber--;
                stickNumber--;
                  System.out.println("You took 2 sticks.");
                System.out.println("Now, " +stickNumber+ " remain.");

            }
            else{
                stickNumber--;
                System.out.println("You took 1 stick.");
                System.out.println("Now, " +stickNumber+ " remain.");
            }
            }
            

        }
    }
if(stickNumber == -1){
    System.out.println("You took too many sticks! You lose.");
}
else{
    if(round % 2 == 0){
        System.out.println("You win!");
    }
    else{
        System.out.println("You lose!");
    }
}


}



}



