package problems;
import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args){
        System.out.println("      WELCOME TO THE ROCK, PAPER, SCISSOR GAME");
        int chance = 5;
        int userWins = 0;
        int compWins = 0;
        while ( chance > 0) {
            System.out.println("Enter 1 for Rock  2 for Paper and 3 for Scissor");

            // User choice

            Scanner u = new Scanner(System.in);
            int user = u.nextInt();
            if (user == 1 || user == 2 || user == 3) {
                if (user == 1) {
                    System.out.println("Your Choice: Rock");
                } else if (user == 2) {
                    System.out.println("Your Choice: Paper");
                } else if (user == 3) {
                    System.out.println("Your Choice: Scissor");
                }

                // Computer choice function

                Random c = new Random();
                int comp = c.nextInt(4);
                if (comp == 1) {
                    System.out.println("Computer Choice: Rock");
                } else if (comp == 2) {
                    System.out.println("Computer Choice: Paper");
                } else if (comp == 3) {
                    System.out.println("Computer Choice: Scissor");
                }

                // Gaming code

                if (user == comp) {
                    System.out.println("It's a Tie");
                    chance -= 1;
                    System.out.printf("You have got %d chance \n", chance);
                } else if (user == 1 && comp == 3 || user == 2 && comp == 1 || user == 3 && comp == 2) {
                    System.out.println("You Won");
                    chance -= 1;
                    userWins += 1;
                    System.out.printf("You have got %d chance\n ", chance);
                } else {
                    System.out.println("Computer Won");
                    chance -= 1;
                    compWins += 1;
                    System.out.printf("You have got %d chance\n ", chance);
                }
            }
            else {
                System.out.println("Pls, Enter correct options");
            }
        }
        if (userWins > compWins){
            System.out.println("you won");
        }
        else{
            System.out.println("Computer Won");
        }
    }
}
