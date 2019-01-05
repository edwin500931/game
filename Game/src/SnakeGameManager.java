
public class SnakeGameManager extends GameManager {

	SnakeDraw gameBoard;
	public SnakeGameManager() {
		super(game.Snake);
		gameBoard = new SnakeDraw();
		gameBoard.si.getInput();
		start();
	}
	
	
	
	
	@Override
	public void start() {
		
		
		while(this.gameState == state.menu) {
			System.out.println(gameBoard.si.getInput().toString());
		}
	}

	@Override
	public void end() {
		// TODO Auto-generated method stub

	}
}
