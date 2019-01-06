import java.io.IOException;
import java.util.Scanner;


public class main{
	public static void main(String[] args){
		ScoreBoard scoreboard = new ScoreBoard();
		System.out.println("1.Snake game   2.Card Game");
		System.out.println("Choose a game:");
		Scanner scanner = new Scanner(System.in);
		int chosenGame = scanner.nextInt();
		GameManager gm;
		if(chosenGame == 1) {
			gm = new SnakeGameManager();
			
		}
		if(chosenGame == 2) {
			//gm = new CardGameManager();
			
		}

	}
}
