import java.util.*;
public class Rockpaperscissors 
{
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);
        int wins = 0;
    while(true){
        System.out.println("Enter rock paper or scissors.");
        String player = scan.nextLine();
        
        if(!player.equals("rock")&&!player.equals("paper")&& !player.equals("scissors")){
                System.out.println("Invalid entry. Enter rock, paper, or scissors.");
        }else{
            int rand =(int) (Math.random()*3);
            String computer="";
            if(rand==0){
                    computer="rock";
            }else if( rand == 1){
                    computer = "paper";
            }else{
                    computer= "scissors";
                }
                System.out.println("Opponent move: " + computer);
            if(player.equals(computer)){
                    System.out.println("Tie!");
            }else if(player.equals("rock")&&computer.equals("scissors")||player.equals("scissors")&&computer.equals("paper")||player.equals("paper")&&computer.equals("rock"))
            {
                System.out.println("You won");
                wins++;
            }else{
                System.out.println("You lost!");
            }
        }
        System.out.println("Play again? yes or no?");
        String play = scan.nextLine();
        if(!play.equals("yes")&&(!play.equals("no")))
        {
            System.out.println("Invalid entry. Enter yes or no.");
            play= scan.nextLine();
        }
        if(!play.equals("yes"))
        {
            System.out.println("You have won " + wins + " games");
            break;
        }
}
}
}