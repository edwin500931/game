import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class SnakeDraw implements Renderer{
	JFrame frame;
	SnakeInput si;
	public SnakeDraw() {
		frame = new JFrame("Test");
		frame.setSize(640, 480);
        frame.setLayout(null);
        frame.setVisible(true);
		si = new SnakeInput();
		frame.addKeyListener(si);
	}
	
	@Override
	public void draw(int count,char c) {
		for(int i = 0;i < count;i++) {
			System.out.print(c);
		}
	}
	@Override
	public void draw(char c) {
		System.out.print(c);
	}
}
