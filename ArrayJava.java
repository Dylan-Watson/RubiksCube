import static java.lang.System.*;
import java.awt.*;

public class ArrayJava {
    
    public PolyStorage[][][] cube;
      
    public enum Colors{
    	white,
    	yellow,
    	red,
    	blue,
    	green,
    	orange
    }  
    	
    public ArrayJava() {
    	cube = new PolyStorage[6][3][3];
		Util.createArray(cube);
    }
    
    public static void main(String[] args) {
		ArrayJava stuff = new ArrayJava();
		out.print(stuff);
		out.print("\n\n+===========================================================================+\n\n");
		Util.UPrime(stuff.cube);
		out.print(stuff);
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
}
