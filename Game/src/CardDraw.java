
public class CardDraw implements Renderer{
	
	
	
	@Override //Change the methods below if you want
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
