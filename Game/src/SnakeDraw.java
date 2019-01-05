import java.awt.*;
import javax.swing.*;

import java.util.ArrayList;
import java.util.Random;

public class SnakeDraw extends JPanel implements Renderer{
	JFrame frame;
	SnakeInput si;
	
	private snake part;
	private ArrayList<snake> Snake;
	private int snakeX = 10,snakeY = 10;
	private int size = 5;
	private int ticks = 0;
	
	public SnakeDraw() {
		frame = new JFrame("Test");
		frame.setSize(640, 480);
		si = new SnakeInput();
		frame.addKeyListener(si);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().add(this);
		frame.setVisible(true);
		
		Snake = new ArrayList<snake>();
		part = new snake(snakeX,snakeY,10);
		Snake.add(part);
	}
	
	public void tick() {
		ticks++;
		
		if(ticks>250000) {
			if(si.getInput()==input.right) {
				snakeX++;
			}
			if(si.getInput()==input.left) {
				snakeX--;
			}
			if(si.getInput()==input.down) {
				snakeY++;
			}
			if(si.getInput()==input.up) {
				snakeY--;
			}
			ticks=0;
			
			part = new snake(snakeX,snakeY,10);
			Snake.add(part);
			
			if(Snake.size() > size) {
				Snake.remove(0);
			}
		}
		
		
	}
	
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, 640, 480);
		super.paint(g);
		
		for(int i = 0;i < 640 /10; i ++) {
			g.drawLine(i * 10, 0, i * 10, 480);
		}
		for(int i = 0;i < 480 /10; i ++) {
			g.drawLine(0, i * 10, 640, i * 10);
		}
		for(int i = 0;i < Snake.size();i++) {
			Snake.get(i).draw(g);
		}
		draw();
		repaint();
	}
	
	@Override
	public void draw() {
		tick();
	}
}