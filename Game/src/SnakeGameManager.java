import java.awt.*;
import java.io.IOException;

public class SnakeGameManager extends GameManager  {

	SnakeDraw gameBoard;
	public SnakeGameManager() {
		super(game.Snake);
		gameBoard = new SnakeDraw(this);
		start();
	}
	
	public void setState(state state) {
		this.gameState = state;
	}
	
	
	@Override
	public void start() {
		
		
		while(this.gameState == state.menu) {
			gameBoard.draw();
			gameBoard.repaint();
		}
		end();
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub

	}
}
