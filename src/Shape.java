import java.awt.Color;
import java.awt.Polygon;

public class Shape implements Shadable{
	
	public int x,y,width,height,a;
	
	public Color color;
	
	private  int redValue = 255;
	int count = 0;
	public Shape(int x, int y, int width, int height) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.color = new Color(redValue, 0, 0);
		a = 17;
		
		
	}
	public void shade(){
		
		if(redValue<=0||redValue>=255)count++;
	
		if(count%2==1)redValue-=17;
		else redValue+=17;
	
	    
	    
	    this.color =  new Color(redValue, 0, 0);
		
	}
	
	
	
}
