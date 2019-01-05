import java.awt.*;
import java.io.IOException;

public class SnakeGameManager extends GameManager  {

	SnakeDraw gameBoard;
	public SnakeGameManager() {
		super(game.Snake);
		gameBoard = new SnakeDraw();
		start();
	}
	
	
	
	
	@Override
	public void start() {
		
		
		while(this.gameState == state.menu) {
			gameBoard.draw();
			gameBoard.repaint();
		}
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub

	}
}
