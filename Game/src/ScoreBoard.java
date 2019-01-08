import java.util.Observable;
import java.util.Observer;

public abstract class ScoreBoard implements Observer{
	
	int score;
	
	@Override
	public abstract void update(Observable o, Object arg);
	
}
