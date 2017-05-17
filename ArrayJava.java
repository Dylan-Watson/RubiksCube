import static java.lang.System.*;
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class ArrayJava extends Applet implements KeyListener{
    public PolyStorage[][][] cube;
    
	public int scale = 18;
	public int xstart = 750;
	public int ystart = 350;
	public int thirdLineX = (int)((8.0 / 3) * scale);
	public int thirdLineY = (int)((5.0 / 3) * scale);
	
	private Graphics g;  
	  
    public enum Colors{
    	white,
    	yellow,
    	red,
    	blue,
    	green,
    	orange
    }  
    
    public void start(){
		cube = new PolyStorage[6][3][3];
		Util.createArray(cube);
    }
    
    public void paint(Graphics g){
		this.g = g;
    	Util.redrawCube(this.g, cube);
		Util.drawLines(this.g);
		
//		Util.RMove(cube);
		Util.redrawCube(this.g, cube);
		Util.drawLines(this.g);
		
		addKeyListener( this );
    }
	
	public String toString(){
    	String output = "";
    	for(PolyStorage[][] a2 : cube){
    		for(PolyStorage[] a : a2){
    			for(PolyStorage c : a )
    				output += c.getColor() + " ";
    			output += "\t";
    		}
    	output += "\n";
    	}
    	return output;
    }
    
    
    
    public void keyPressed( KeyEvent e ){ }
    public void keyReleased( KeyEvent e ){ }
    public void keyTyped( KeyEvent e ){
    
    	System.out.println("test");
    	
    }
   	
}
