import java.awt.*;

public class PolyStorage{
	
	private Polygon poly;
	private ArrayJava.Colors color;
	
	public PolyStorage(int[] xVals, int[] yVals, int numVals, ArrayJava.Colors color){
		poly = new Polygon(xVals, yVals, numVals);
		this.color = color;
	}
	
	public PolyStorage(ArrayJava.Colors color){
		poly = null;
		this.color = color;
	}
	
	public Polygon getPoly(){ return poly; }
	
	public ArrayJava.Colors getColor(){ return color; }
	
	public void setColor(ArrayJava.Colors color){ this.color = color; }
}