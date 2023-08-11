import java.util.*;
public class RockPaperScissors
{
    public static void main (String[] args)
    {
        Scanner input = new Scanner(System.in);
        int w = 0;
    while(true)
    {
        Random a = new Random();
        System.out.print("Enter your move.\n1 = Rock, 2 = Paper, 3 = Scissors.");
        int player = input.nextInt();
        int comp = 0; 
        comp = a.nextInt(3)+1;
    
    if(player != 1 && player != 2 && player != 3)
    {
        System.out.println("Your move is not valid.");
    }
    else
    {      
        System.out.println("Computer: " + comp);
    }
    if(player == comp)
    {
       System.out.println("Is a tie."); 
    }
    else if (player == 1 && comp ==3)
    {
        System.out.println("Rock beats scissors, because a rock can break a pair of scissors.\nYou win.");
        w++;
    }
    else if (player == 2 && comp == 1)
    {
        System.out.println("Paper beats rock, because a piece of paper can cover a rock.\nYou win.");
        w++;
    }
    else if (player == 3 && comp == 2)
    {
        System.out.println("Scissors beats paper, because scissors can cut paper.\nYou win.");
        w++;
    }
    else if (player == 1 && comp == 2)
    {
        System.out.println("Paper beats rock, because a piece of paper can cover a rock.\nYou lose.");
    }
    else if (player == 2 && comp ==3)
    {
        System.out.println("Scissors beats paper, because scissors can cut paper.\nYou lose.");
    }
    else if (player == 3 && comp ==1)
    {
        System.out.println("Rock beats scissors, because a rock can break a pair of scissors.\nYou lose.");
    }
    System.out.println("Type Yes to countinue or No to stop.");
    String answer = input.next();
    if(answer.equalsIgnoreCase("no"))
    {
        break;
    }
    }
    System.out.println("Total wins: " + w);
}
}
