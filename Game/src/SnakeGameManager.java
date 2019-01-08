import java.awt.*;
import java.io.IOException;
import java.util.Observer;

public class SnakeGameManager extends GameManager  {
	
	SnakeDraw gameBoard;
	int score = 0;
	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
		this.setChanged();
		this.notifyObservers(new Integer(score));
	}

	public SnakeGameManager(Observer sb) {
		super(game.Snake);
		gameBoard = new SnakeDraw(this);
		this.addObserver(sb);
		start();
	}
	
	public void setState(state state) {
		this.gameState = state;
	}
	
	
	@Override
	public void start() {
		while(this.gameState == state.running) {
			gameBoard.draw();
			gameBoard.repaint();
		}
		end();
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub
		if(this.gameState == state.ended) {
			System.out.println("Game Over!");
		}
	}
}
