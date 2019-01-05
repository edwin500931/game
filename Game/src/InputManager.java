import java.awt.event.KeyAdapter;

public abstract class InputManager extends KeyAdapter{
	
	input currentInput = input.stop;
	public input getInput() {
		return currentInput;
	}
	
	public void setInput(input i) {
		this.currentInput = i;
	}
	
	public void resetInput() {
		currentInput = input.stop;
	}
}
