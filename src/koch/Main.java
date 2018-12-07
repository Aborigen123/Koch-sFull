package koch;
import ch.aplu.turtle.Turtle;

public class Main extends Turtle {

	public Main() {
		
		hideTurtle();
		setPos(-100, -150);
		for(int i = 0; i<3; i++) {
			koch(300,4);
			right(120);
		}
	}
	
	private void koch(double s, int levels) {
		if(levels == 0) {
			forward(s);
			return;
		}else {
			s /= 3; 
			
			koch(s, levels - 1);
			left(60); 
			koch(s, levels - 1);
			right(120);
			koch(s, levels - 1);
			left(60);
			koch(s, levels - 1);
			
			
		}
	}
	public static void main(String[] args) {
		new Main();
		
	}
	

}
