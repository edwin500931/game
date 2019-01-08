import java.io.IOException;
import java.util.Scanner;


public class main{
	public static void main(String[] args){
		ScoreBoard sb;
		System.out.println("1.Snake game   2.Card Game");
		System.out.println("Choose a game:");
		Scanner scanner = new Scanner(System.in);
		int chosenGame = scanner.nextInt();
		GameManager gm;
		if(chosenGame == 1) {
			sb = new SnakeScore();
			gm = new SnakeGameManager(sb);
		}
		if(chosenGame == 2) {
			//gm = new CardGameManager();
			
		}

	}
}
