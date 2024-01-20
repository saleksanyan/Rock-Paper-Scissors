import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        System.out.println("Hi there! Do you want to play Rock-Paper-Scissors?(y/n)");
        Scanner reader = new Scanner(System.in);
        String answer = reader.nextLine();
        History history = new History();
        while(answer.equalsIgnoreCase("y")){
            String[] randomChoices = new String[]{"Rock","Paper","Scissors"};
            String myChoice = randomChoices[(int) (Math.random()*(randomChoices.length-1))];
            System.out.println("What is your choice?");
            String playerChoice = reader.next();
            while(!((playerChoice.equalsIgnoreCase("Rock")
                    || (playerChoice.equalsIgnoreCase("Paper"))
                    || (playerChoice.equalsIgnoreCase("Scissors"))))){
                System.out.println("Please choose something among \"Rock\",\"Paper\",\"Scissors\"");
                playerChoice = reader.next();
            }
            Player player = new Player(new Choice(playerChoice));
            if(player.getChoice().compareTo(myChoice) < 0) {
                history.addHistory("win");
                System.out.println("you won since my choice was" + myChoice);
            }
            else if(player.getChoice().compareTo(myChoice) > 0) {
                history.addHistory("lose");
                System.out.println("you lost since my choice was" + myChoice);
            }
            else {
                history.addHistory("tie");
                System.out.println("its a tie since my choice was " + myChoice);
            }
            System.out.println("Do you want ot play again? ");

            answer = reader.next();
        }
        ArrayList<String> h = history.getHistory();
        if(h.size()>0) {
            System.out.println("Here you can see the history of the game: ");
            for (int i = 0; i < h.size(); i++) {
                System.out.println((i + 1) + ". " + h.get(i));
            }
        }

    }
}