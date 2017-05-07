import static java.lang.System.*;
import java.awt.*;

public class ArrayJava {
    
    public Colors[][][] cube;
      
    public enum Colors{
    	white,
    	yellow,
    	red,
    	blue,
    	green,
    	orange
    }  
    	
    public ArrayJava() {
    	cube = new Colors[6][3][3];
		Util.resetArray(cube);
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
    	for(Colors[][] a2 : cube){
    		for(Colors[] a : a2){
    			for(Colors c : a )
    				output += c + " ";
    			output += "\t";
    		}
    	output += "\n";
    	}
    	return output;
    }
}
