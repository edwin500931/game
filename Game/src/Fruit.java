import java.awt.Color;
import java.awt.Graphics;

public class Fruit {
	private int x,y,width,height;
	
	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}

	public Fruit(int x,int y,int size) {
		this.x = x;
		this.y = y;
		width = size;
		height = size;
	}
	
	public void tick() {
		
	}
	
	public void draw(Graphics g) {
		g.setColor(Color.RED);
		g.fillRect(x * width, y * height, width, height);
	}
}
