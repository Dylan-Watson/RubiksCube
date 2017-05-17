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
		addKeyListener( this );
    }
    
    public void paint(Graphics g){
		this.g = g;
    	Util.redrawCube(this.g, cube);
		Util.drawLines(this.g);
		Util.drawWin(this.g, cube);
		g.setColor(Color.black);
		g.drawString("IS SOLVED: ", 10,20);
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
    
    
 //   boolean shActive = false; VK_SHIFT 
    public void keyPressed( KeyEvent e ){
    	if(e.getKeyCode() == 8)
    		Util.resetArray(cube);
    	repaint();
    	e.consume();
    }
    public void keyReleased( KeyEvent e ){ }
    public void keyTyped( KeyEvent e ){
    	char c = e.getKeyChar();
    
    	if(c=='/' || c=='?')
    		Util.randomizeCube(cube);
    	else if(c=='l')
    		Util.LMove(cube);
    	else if(c=='L')
    		Util.LPrime(cube);
    	else if(c=='r')	
    		Util.RMove(cube);
    	else if(c=='R')	
    		Util.RPrime(cube);
    	else if(c=='u')	
    		Util.UMove(cube);
    	else if(c=='U')	
    		Util.UPrime(cube);
    	else if(c=='d')	
    		Util.DMove(cube);
    	else if(c=='D')	
    		Util.DPrime(cube);
    	else if(c=='f')	
    		Util.FMove(cube);
    	else if(c=='F')	
    		Util.FPrime(cube);
    	else if(c=='b')	
    		Util.BMove(cube);
    	else if(c=='B')	
    		Util.BPrime(cube);
    	else if(c=='m')	
    		Util.MMove(cube);
    	else if(c=='M')	
    		Util.MPrime(cube);
    	else if(c=='s')	
			Util.SMove(cube);
    	else if(c=='S')	
			Util.SPrime(cube);
    	else if(c=='e')	
			Util.EMove(cube);
    	else if(c=='E')	
			Util.EPrime(cube);
    	
    	repaint();
		e.consume();		
    }
   	
}
