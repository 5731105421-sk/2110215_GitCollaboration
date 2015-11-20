import java.awt.Color;
import java.awt.Polygon;

public class Shape implements Transitionable{
	
	public int x,y,width,height,a;
	
	public Color color;
	
	private int redValue = 255;
	
	public Shape(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = new Color(redValue, 0, 0);
		this.a = 15;
		
	}
	public void transition(){
		if(x+width>=Main.SCREEN_WIDTH){
			a = -a;
		}
		else if(x<=0){
			a = -a;
		}
		x +=a;
	}

	
}
