import java.util.Observable;

public abstract class GameManager extends Observable{
	enum state {menu,running,ended};
	enum game {Snake,Card};
	
	game gameType;
	state gameState;
	
	public GameManager(game gameType) {
		this.gameType = gameType;
		this.gameState = state.menu;
	}
	public abstract void start();
	public abstract void end();
}