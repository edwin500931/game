import java.util.Observable;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class SnakeScore extends ScoreBoard {
	
	JFrame frame;
	JLabel label;
	
	public SnakeScore() {
		frame = new JFrame("Score");
		frame.setSize(100, 100);
		label = new JLabel("Test");
		label.setText(String.valueOf(score));
		frame.add(label);
		frame.setVisible(true);
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(arg instanceof Integer) {
			this.score = ((Integer)arg).intValue();
			label.setText(String.valueOf(score));
		}
		
	}
}
