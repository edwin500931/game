import java.awt.*;
import javax.swing.*;

import java.util.concurrent.TimeUnit;

import java.util.ArrayList;
import java.util.Random;

public class SnakeDraw extends JPanel implements Renderer{
	JFrame frame;
	SnakeInput si;
	SnakeGameManager client;
	
	private snake part;
	private ArrayList<snake> Snake;
	private int snakeX = 10,snakeY = 10;
	private int size = 5;
	private int ticks = 0;
	private Fruit food;
	private ArrayList<Fruit> fruits;
	private Random r = new Random();
	
	public SnakeDraw(SnakeGameManager client) {
		frame = new JFrame("Test");
		frame.setSize(640, 480);
		si = new SnakeInput();
		frame.addKeyListener(si);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.getContentPane().add(this);
		frame.setVisible(true);
		frame.requestFocus();

		Snake = new ArrayList<snake>();
		part = new snake(snakeX,snakeY,10);
		Snake.add(part);
		fruits = new ArrayList<Fruit>();
		
		this.client = client;
		
	}
	
	@Override
	public void draw() {
		ticks++;
		if(si.getInput()==input.stop)
			return;
		if(ticks>300000) {
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
		if(fruits.size()==0) {
			int x = r.nextInt(60);
			int y = r.nextInt(44);
			food = new Fruit(x,y,10);
			fruits.add(food);
		}
		for(int i = 0;i < fruits.size();i++) {
			if(snakeX == fruits.get(i).getX() && snakeY == fruits.get(i).getY()){
				size++;
				fruits.remove(i);
				i--;
			}
		}
		for(int i = 0;i < Snake.size();i++) {
			if(snakeX == Snake.get(i).getX() && snakeY == Snake.get(i).getY()) {
				if(i != Snake.size() - 1) {
					client.setState(state.ended);
				}
			}
		}
		if(snakeX >= 64) {
			snakeX=0;
		}
		else if(snakeX<0) {
			snakeX=63;
		}
		if(snakeY >= 48) {
			snakeY=0;
		}
		else if(snakeY<0) {
			snakeY=47;
		}
	}
	
	@Override
	public void paint(Graphics g) {
		g.clearRect(0, 0, 640, 480);
		super.paint(g);
		
		/*for(int i = 0;i < 640 /10; i ++) {
			g.drawLine(i * 10, 0, i * 10, 480);
		}
		for(int i = 0;i < 480 /10; i ++) {
			g.drawLine(0, i * 10, 640, i * 10);
		}*/
		for(int i = 0;i < Snake.size();i++) {
			Snake.get(i).draw(g);
		}
		for(int i = 0;i < fruits.size();i++) {
			fruits.get(i).draw(g);
		}
		draw();
		repaint();
		
	}
}