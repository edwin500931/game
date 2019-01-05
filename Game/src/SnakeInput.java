import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class SnakeInput extends InputManager {
	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		
		if(key == KeyEvent.VK_LEFT) {
			setInput(input.left);
		}
		else if(key == KeyEvent.VK_DOWN) {
			setInput(input.down);
		}
		else if(key == KeyEvent.VK_UP) {
			setInput(input.up);
		}
		else if(key == KeyEvent.VK_RIGHT) {
			setInput(input.right);
		}
	}
	
	/*public static void main(String[] args) { //For Testing
		
		JFrame frame = new JFrame("Test");
		frame.setSize(640, 480);
        frame.setLayout(null);
        frame.setVisible(true);
		SnakeInput si = new SnakeInput();
		frame.addKeyListener(si);
		
		while(si.getInput()!=input.down){
			System.out.println(si.getInput().toString());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}*/
}
