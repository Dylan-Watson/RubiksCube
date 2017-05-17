import java.awt.*;
import java.awt.Polygon;
import java.util.*;

public class Util {
	
	public static int scale = 18;
	public static int xstart = 750;
	public static int ystart = 350;
	public static int thirdLineX = (int)((8.0 / 3) * scale);
	public static int thirdLineY = (int)((5.0 / 3) * scale);
	public static int botStartX = xstart;
	public static int botStartY = ystart + (20 * scale);
    public static int backStartX = xstart - (18 * scale);
	public static int backStartY = ystart - (10 * scale);
	public static int rightStartX = xstart + (18 * scale);
	public static int rightStartY = ystart - (10 * scale);
	
	private static ArrayList<Polygon> polys;
	
	public static void resetArray(PolyStorage[][][] cube){
		//Front = 0, Left = 1, Back = 2, Right = 3, Top = 4, Bottom = 5
		//Front is white center
		for(int thr = 0; thr < cube.length; thr++){
			for(int r = 0; r < cube[thr].length; r++){
				for(int c = 0; c < cube[thr][r].length; c++){
					cube[thr][r][c].setColor(getColorFromFaceValue(thr));
				}
			}
		}
	}
	
	public static void createArray(PolyStorage[][][] cube){
		createList();
		int i = 0;
		for(int thr = 0; thr < cube.length; thr++){
			for(int r = 0; r < cube[thr].length; r++){
				for(int c = 0; c < cube[thr][r].length; c++){
					Polygon tempPoly = polys.get(i);
					cube[thr][r][c] = new PolyStorage(tempPoly, getColorFromFaceValue(thr));
					i++;
				}
			}
		}
	}
	
	public static void redrawCube(Graphics g, PolyStorage[][][] cube){
		for(int thr = 0; thr < cube.length; thr++){
			for(int r = 0; r < cube[thr].length; r++){
				for(int c = 0; c < cube[thr][r].length; c++){
					g.setColor(getColorFromColor(cube[thr][r][c].getColor()));
					g.fillPolygon(cube[thr][r][c].getPoly());
				}
			}
		}
	}
	
	public static Color getColorFromColor(ArrayJava.Colors color){
		if(color == ArrayJava.Colors.white)
			return Color.white;
		else if(color == ArrayJava.Colors.yellow)
			return Color.yellow;
		else if(color == ArrayJava.Colors.red)
			return Color.red;
		else if(color == ArrayJava.Colors.blue)
			return Color.blue;
		else if(color == ArrayJava.Colors.green)
			return Color.green;
		else if(color == ArrayJava.Colors.orange)
			return new Color(255,140,0);
		return null;
	}
	
	public static void drawWin(Graphics g, PolyStorage[][][] cube)
	{
		g.setColor(Color.green);
		
		for(int thr = 0; thr < cube.length; thr++)
		{
			ArrayJava.Colors color = cube[thr][0][0].getColor();
			
			for(int r = 0; r < cube[thr].length; r++)
				for(int c = 0; c < cube[thr][r].length; c++)
					if(color != cube[thr][r][c].getColor())
						g.setColor(Color.white);
		}
		
		g.fillRect(0,0,10,10);
	}
	
	public static void drawLines(Graphics g){
		g.setColor(Color.black);
		
		//MAIN BODY (TOP + LEFT + FRONT)
		//Vertical Lines 			(Left to Right)
		g.drawLine(xstart-(8*scale),ystart-(5*scale),xstart-(8*scale),ystart+(4*scale));	
  		g.drawLine(xstart-(8*scale)+thirdLineX,ystart-(5*scale)+thirdLineY,xstart-(8*scale)+thirdLineX,ystart+(4*scale)+thirdLineY);
  		g.drawLine(xstart-thirdLineX,ystart-thirdLineY,xstart-thirdLineX,ystart+(9*scale)-thirdLineY);
  		g.drawLine(xstart,ystart,xstart,ystart+(9*scale));
  		g.drawLine(xstart+thirdLineX,ystart-thirdLineY,xstart+thirdLineX,ystart+(9*scale)-thirdLineY);
  		g.drawLine(xstart+(8*scale)-thirdLineX,ystart-(5*scale)+thirdLineY,xstart+(8*scale)-thirdLineX,ystart+(4*scale)+thirdLineY);
  		g.drawLine(xstart+(8*scale),ystart-(5*scale),xstart+(8*scale),ystart+(4*scale));
  		//Downward Slanted Lines	(Bottom to Top)
  		g.drawLine(xstart-(8*scale),ystart+(4*scale),xstart,ystart+(9*scale));
  		g.drawLine(xstart-(8*scale),ystart+(1*scale),xstart,ystart+(6*scale));
  		g.drawLine(xstart-(8*scale),ystart-(2*scale),xstart,ystart+(3*scale));
  		g.drawLine(xstart-(8*scale),ystart-(5*scale),xstart,ystart);
  		g.drawLine(xstart-(8*scale)+thirdLineX,ystart-(5*scale)-thirdLineY,xstart+thirdLineX,ystart-thirdLineY);
  		g.drawLine(xstart-thirdLineX,ystart-(10*scale)+thirdLineY,xstart+(8*scale)-thirdLineX,ystart-(5*scale)+thirdLineY);
  		g.drawLine(xstart,ystart-(10*scale),xstart+(8*scale),ystart-(5*scale));
  		//Upward Slanted Lines		(Top to Bottom)
  		g.drawLine(xstart,ystart-(10*scale),xstart-(8*scale),ystart-(5*scale));
  		g.drawLine(xstart+thirdLineX,ystart-(10*scale)+thirdLineY,xstart-(8*scale)+thirdLineX,ystart-(5*scale)+thirdLineY);
  		g.drawLine(xstart+(8*scale)-thirdLineX,ystart-(5*scale)-thirdLineY,xstart-thirdLineX,ystart-thirdLineY);
  		g.drawLine(xstart+(8*scale),ystart-(5*scale),xstart,ystart);
  		g.drawLine(xstart+(8*scale),ystart-(2*scale),xstart,ystart+(3*scale));
  		g.drawLine(xstart+(8*scale),ystart+(1*scale),xstart,ystart+(6*scale));
		g.drawLine(xstart+(8*scale),ystart+(4*scale),xstart,ystart+(9*scale));
		
		//BACK
		g.drawLine(backStartX,backStartY,backStartX,backStartY+(9*scale));
  		g.drawLine(backStartX+thirdLineX,backStartY-thirdLineY,backStartX+thirdLineX,backStartY+(9*scale)-thirdLineY);
  		g.drawLine(backStartX+(8*scale)-thirdLineX,backStartY-(5*scale)+thirdLineY,backStartX+(8*scale)-thirdLineX,backStartY+(4*scale)+thirdLineY);
  		g.drawLine(backStartX+(8*scale),backStartY-(5*scale),backStartX+(8*scale),backStartY+(4*scale));
  		g.drawLine(backStartX+(8*scale),backStartY-(5*scale),backStartX,backStartY);
  		g.drawLine(backStartX+(8*scale),backStartY-(2*scale),backStartX,backStartY+(3*scale));
  		g.drawLine(backStartX+(8*scale),backStartY+(1*scale),backStartX,backStartY+(6*scale));
		g.drawLine(backStartX+(8*scale),backStartY+(4*scale),backStartX,backStartY+(9*scale));
		
		//RIGHT
		g.drawLine(rightStartX-(8*scale),rightStartY-(5*scale),rightStartX-(8*scale),rightStartY+(4*scale));	
  		g.drawLine(rightStartX-(8*scale)+thirdLineX,rightStartY-(5*scale)+thirdLineY,rightStartX-(8*scale)+thirdLineX,rightStartY+(4*scale)+thirdLineY);
  		g.drawLine(rightStartX-thirdLineX,rightStartY-thirdLineY,rightStartX-thirdLineX,rightStartY+(9*scale)-thirdLineY);
  		g.drawLine(rightStartX,rightStartY,rightStartX,rightStartY+(9*scale));
		g.drawLine(rightStartX-(8*scale),rightStartY+(4*scale),rightStartX,rightStartY+(9*scale));
  		g.drawLine(rightStartX-(8*scale),rightStartY+(1*scale),rightStartX,rightStartY+(6*scale));
  		g.drawLine(rightStartX-(8*scale),rightStartY-(2*scale),rightStartX,rightStartY+(3*scale));
  		g.drawLine(rightStartX-(8*scale),rightStartY-(5*scale),rightStartX,rightStartY);
  		
  		//BOT
		g.drawLine(botStartX-(8*scale),botStartY-(5*scale),botStartX,botStartY);
  		g.drawLine(botStartX-(8*scale)+thirdLineX,botStartY-(5*scale)-thirdLineY,botStartX+thirdLineX,botStartY-thirdLineY);
  		g.drawLine(botStartX-thirdLineX,botStartY-(10*scale)+thirdLineY,botStartX+(8*scale)-thirdLineX,botStartY-(5*scale)+thirdLineY);
  		g.drawLine(botStartX,botStartY-(10*scale),botStartX+(8*scale),botStartY-(5*scale));
  		g.drawLine(botStartX,botStartY-(10*scale),botStartX-(8*scale),botStartY-(5*scale));
  		g.drawLine(botStartX+thirdLineX,botStartY-(10*scale)+thirdLineY,botStartX-(8*scale)+thirdLineX,botStartY-(5*scale)+thirdLineY);
  		g.drawLine(botStartX+(8*scale)-thirdLineX,botStartY-(5*scale)-thirdLineY,botStartX-thirdLineX,botStartY-thirdLineY);
  		g.drawLine(botStartX+(8*scale),botStartY-(5*scale),botStartX,botStartY);
  		
	}
	
	public static void MMove(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		
		cube[0][0][1].setColor(tempCube[4][0][1].getColor());
		cube[0][1][1].setColor(tempCube[4][1][1].getColor());
		cube[0][2][1].setColor(tempCube[4][2][1].getColor());
		
		cube[4][0][1].setColor(tempCube[2][2][1].getColor());
		cube[4][1][1].setColor(tempCube[2][1][1].getColor());
		cube[4][2][1].setColor(tempCube[2][0][1].getColor());
		
		cube[2][0][1].setColor(tempCube[5][2][1].getColor());
		cube[2][1][1].setColor(tempCube[5][1][1].getColor());
		cube[2][2][1].setColor(tempCube[5][0][1].getColor());
		
		cube[5][0][1].setColor(tempCube[0][0][1].getColor());
		cube[5][1][1].setColor(tempCube[0][1][1].getColor());
		cube[5][2][1].setColor(tempCube[0][2][1].getColor());
	}
	
	public static void MPrime(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		
		cube[0][0][1].setColor(tempCube[5][0][1].getColor());
		cube[0][1][1].setColor(tempCube[5][1][1].getColor());
		cube[0][2][1].setColor(tempCube[5][2][1].getColor());
		
		cube[4][0][1].setColor(tempCube[0][0][1].getColor());
		cube[4][1][1].setColor(tempCube[0][1][1].getColor());
		cube[4][2][1].setColor(tempCube[0][2][1].getColor());
		
		cube[2][0][1].setColor(tempCube[4][2][1].getColor());
		cube[2][1][1].setColor(tempCube[4][1][1].getColor());
		cube[2][2][1].setColor(tempCube[4][0][1].getColor());
		
		cube[5][0][1].setColor(tempCube[2][2][1].getColor());
		cube[5][1][1].setColor(tempCube[2][1][1].getColor());
		cube[5][2][1].setColor(tempCube[2][0][1].getColor());
	}
	
	public static void BMove(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		
		cube[4][0][0].setColor(tempCube[3][0][2].getColor());
		cube[4][0][1].setColor(tempCube[3][1][2].getColor());
		cube[4][0][2].setColor(tempCube[3][2][2].getColor());
	
		cube[3][0][2].setColor(tempCube[5][2][2].getColor());
		cube[3][1][2].setColor(tempCube[5][2][1].getColor());
		cube[3][2][2].setColor(tempCube[5][2][0].getColor());
		
		cube[5][2][0].setColor(tempCube[1][0][0].getColor());		
		cube[5][2][1].setColor(tempCube[1][1][0].getColor());
		cube[5][2][2].setColor(tempCube[1][2][0].getColor());
		
		cube[1][0][0].setColor(tempCube[4][0][2].getColor());		
		cube[1][1][0].setColor(tempCube[4][0][1].getColor());
		cube[1][2][0].setColor(tempCube[4][0][0].getColor());

		cube[2][0][0].setColor(tempCube[2][2][0].getColor());		
		cube[2][0][1].setColor(tempCube[2][1][0].getColor());
		cube[2][0][2].setColor(tempCube[2][0][0].getColor());
		cube[2][1][0].setColor(tempCube[2][2][1].getColor());		
		cube[2][1][2].setColor(tempCube[2][0][1].getColor());
		cube[2][2][0].setColor(tempCube[2][2][2].getColor());
		cube[2][2][1].setColor(tempCube[2][1][2].getColor());		
		cube[2][2][2].setColor(tempCube[2][0][2].getColor());
		
	}
	
	public static void BPrime(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		
		cube[4][0][0].setColor(tempCube[1][2][0].getColor());
		cube[4][0][1].setColor(tempCube[1][1][0].getColor());
		cube[4][0][2].setColor(tempCube[1][0][0].getColor());
		
		cube[1][0][0].setColor(tempCube[5][2][0].getColor());
		cube[1][1][0].setColor(tempCube[5][2][1].getColor());
		cube[1][2][0].setColor(tempCube[5][2][2].getColor());
		
		cube[5][2][0].setColor(tempCube[3][2][2].getColor());
		cube[5][2][1].setColor(tempCube[3][1][2].getColor());
		cube[5][2][2].setColor(tempCube[3][0][2].getColor());
		
		cube[3][0][2].setColor(tempCube[4][0][0].getColor());
		cube[3][1][2].setColor(tempCube[4][0][1].getColor());
		cube[3][2][2].setColor(tempCube[4][0][2].getColor());
		
		cube[2][0][0].setColor(tempCube[2][0][2].getColor());		
		cube[2][0][1].setColor(tempCube[2][1][2].getColor());
		cube[2][0][2].setColor(tempCube[2][2][2].getColor());
		cube[2][1][0].setColor(tempCube[2][0][1].getColor());		
		cube[2][1][2].setColor(tempCube[2][2][1].getColor());
		cube[2][2][0].setColor(tempCube[2][0][0].getColor());
		cube[2][2][1].setColor(tempCube[2][1][0].getColor());		
		cube[2][2][2].setColor(tempCube[2][2][0].getColor());
	}
	
	public static void FMove(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		
		cube[1][0][2].setColor(tempCube[5][0][0].getColor());
		cube[1][1][2].setColor(tempCube[5][0][1].getColor());
		cube[1][2][2].setColor(tempCube[5][0][2].getColor());
		
		cube[5][0][0].setColor(tempCube[3][2][0].getColor());
		cube[5][0][1].setColor(tempCube[3][1][0].getColor());
		cube[5][0][2].setColor(tempCube[3][0][0].getColor());
		
		cube[3][0][0].setColor(tempCube[4][2][0].getColor());
		cube[3][1][0].setColor(tempCube[4][2][1].getColor());
		cube[3][2][0].setColor(tempCube[4][2][2].getColor());
		
		cube[4][2][0].setColor(tempCube[1][2][2].getColor());
		cube[4][2][1].setColor(tempCube[1][1][2].getColor());
		cube[4][2][2].setColor(tempCube[1][0][2].getColor());
		
		cube[0][0][0].setColor(tempCube[0][2][0].getColor());
		cube[0][0][1].setColor(tempCube[0][1][0].getColor());
		cube[0][0][2].setColor(tempCube[0][0][0].getColor());
		cube[0][1][0].setColor(tempCube[0][2][1].getColor());
		cube[0][1][2].setColor(tempCube[0][0][1].getColor());
		cube[0][2][0].setColor(tempCube[0][2][2].getColor());
		cube[0][2][1].setColor(tempCube[0][1][2].getColor());
		cube[0][2][2].setColor(tempCube[0][0][2].getColor());		
	}
	
	public static void FPrime(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		
		cube[1][0][2].setColor(tempCube[4][2][2].getColor());
		cube[1][1][2].setColor(tempCube[4][2][1].getColor());
		cube[1][2][2].setColor(tempCube[4][2][0].getColor());

		cube[4][2][0].setColor(tempCube[3][0][0].getColor());
		cube[4][2][1].setColor(tempCube[3][1][0].getColor());
		cube[4][2][2].setColor(tempCube[3][2][0].getColor());
	
		cube[3][0][0].setColor(tempCube[5][0][2].getColor());
		cube[3][1][0].setColor(tempCube[5][0][1].getColor());
		cube[3][2][0].setColor(tempCube[5][0][0].getColor());

		cube[5][0][0].setColor(tempCube[1][0][2].getColor());
		cube[5][0][1].setColor(tempCube[1][1][2].getColor());
		cube[5][0][2].setColor(tempCube[1][2][2].getColor());
		
		cube[0][0][0].setColor(tempCube[0][0][2].getColor());
		cube[0][0][1].setColor(tempCube[0][1][2].getColor());
		cube[0][0][2].setColor(tempCube[0][2][2].getColor());
		cube[0][1][0].setColor(tempCube[0][0][1].getColor());
		cube[0][1][2].setColor(tempCube[0][2][1].getColor());
		cube[0][2][0].setColor(tempCube[0][0][0].getColor());
		cube[0][2][1].setColor(tempCube[0][1][0].getColor());
		cube[0][2][2].setColor(tempCube[0][2][0].getColor());
	}
	
	public static void DMove(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		
		cube[0][2][0].setColor(tempCube[1][2][0].getColor());
		cube[0][2][1].setColor(tempCube[1][2][1].getColor());
		cube[0][2][2].setColor(tempCube[1][2][2].getColor());
		
		cube[1][2][0].setColor(tempCube[2][2][0].getColor());		
		cube[1][2][1].setColor(tempCube[2][2][1].getColor());
		cube[1][2][2].setColor(tempCube[2][2][2].getColor());
	
		cube[2][2][0].setColor(tempCube[3][2][0].getColor());
		cube[2][2][1].setColor(tempCube[3][2][1].getColor());
		cube[2][2][2].setColor(tempCube[3][2][2].getColor());
		
		cube[3][2][0].setColor(tempCube[0][2][0].getColor());
		cube[3][2][1].setColor(tempCube[0][2][1].getColor());
		cube[3][2][2].setColor(tempCube[0][2][2].getColor());
		
		cube[5][0][0].setColor(tempCube[5][2][0].getColor());
		cube[5][0][1].setColor(tempCube[5][1][0].getColor());
		cube[5][0][2].setColor(tempCube[5][0][0].getColor());
		cube[5][1][0].setColor(tempCube[5][2][1].getColor());
		cube[5][1][2].setColor(tempCube[5][0][1].getColor());
		cube[5][2][0].setColor(tempCube[5][2][2].getColor());
		cube[5][2][1].setColor(tempCube[5][1][2].getColor());
		cube[5][2][2].setColor(tempCube[5][0][2].getColor());		
	}
	
	public static void DPrime(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		
		cube[0][2][0].setColor(tempCube[3][2][0].getColor());
		cube[0][2][1].setColor(tempCube[3][2][1].getColor());
		cube[0][2][2].setColor(tempCube[3][2][2].getColor());
		
		cube[3][2][0].setColor(tempCube[2][2][0].getColor());
		cube[3][2][1].setColor(tempCube[2][2][1].getColor());
		cube[3][2][2].setColor(tempCube[2][2][2].getColor());
		
		cube[2][2][0].setColor(tempCube[1][2][0].getColor());
		cube[2][2][1].setColor(tempCube[1][2][1].getColor());
		cube[2][2][2].setColor(tempCube[1][2][2].getColor());
		
		cube[1][2][0].setColor(tempCube[0][2][0].getColor());
		cube[1][2][1].setColor(tempCube[0][2][1].getColor());
		cube[1][2][2].setColor(tempCube[0][2][2].getColor());
	
		cube[5][0][0].setColor(tempCube[5][0][2].getColor());
		cube[5][0][1].setColor(tempCube[5][1][2].getColor());
		cube[5][0][2].setColor(tempCube[5][2][2].getColor());
		cube[5][1][0].setColor(tempCube[5][0][1].getColor());
		cube[5][1][2].setColor(tempCube[5][2][1].getColor());
		cube[5][2][0].setColor(tempCube[5][0][0].getColor());
		cube[5][2][1].setColor(tempCube[5][1][0].getColor());
		cube[5][2][2].setColor(tempCube[5][2][0].getColor());	
	}
	
	public static void UMove(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		cube[0][0][0].setColor(tempCube[3][0][0].getColor());
		cube[0][0][1].setColor(tempCube[3][0][1].getColor());
		cube[0][0][2].setColor(tempCube[3][0][2].getColor());

		cube[1][0][0].setColor(tempCube[0][0][0].getColor());
		cube[1][0][1].setColor(tempCube[0][0][1].getColor());
		cube[1][0][2].setColor(tempCube[0][0][2].getColor());

		cube[2][0][0].setColor(tempCube[1][0][0].getColor());
		cube[2][0][1].setColor(tempCube[1][0][1].getColor());
		cube[2][0][2].setColor(tempCube[1][0][2].getColor());

		cube[3][0][0].setColor(tempCube[2][0][0].getColor());
		cube[3][0][1].setColor(tempCube[2][0][1].getColor());
		cube[3][0][2].setColor(tempCube[2][0][2].getColor());

		cube[4][0][0].setColor(tempCube[4][2][0].getColor());
		cube[4][0][1].setColor(tempCube[4][1][0].getColor());
		cube[4][0][2].setColor(tempCube[4][0][0].getColor());
		cube[4][1][0].setColor(tempCube[4][2][1].getColor());
		cube[4][1][2].setColor(tempCube[4][0][1].getColor());
		cube[4][2][0].setColor(tempCube[4][2][2].getColor());
		cube[4][2][1].setColor(tempCube[4][1][2].getColor());
		cube[4][2][2].setColor(tempCube[4][0][2].getColor());
	}
	
	public static void UPrime(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
			
		cube[0][0][0].setColor(tempCube[1][0][0].getColor());
		cube[0][0][1].setColor(tempCube[1][0][1].getColor());
		cube[0][0][2].setColor(tempCube[1][0][2].getColor());

		cube[1][0][0].setColor(tempCube[2][0][0].getColor());
		cube[1][0][1].setColor(tempCube[2][0][1].getColor());
		cube[1][0][2].setColor(tempCube[2][0][2].getColor());

		cube[2][0][0].setColor(tempCube[3][0][0].getColor());
		cube[2][0][1].setColor(tempCube[3][0][1].getColor());
		cube[2][0][2].setColor(tempCube[3][0][2].getColor());

		cube[3][0][0].setColor(tempCube[0][0][0].getColor());
		cube[3][0][1].setColor(tempCube[0][0][1].getColor());
		cube[3][0][2].setColor(tempCube[0][0][2].getColor());

		cube[4][0][0].setColor(tempCube[4][0][2].getColor());
		cube[4][0][1].setColor(tempCube[4][1][2].getColor());
		cube[4][0][2].setColor(tempCube[4][2][2].getColor());
		cube[4][1][0].setColor(tempCube[4][0][1].getColor());
		cube[4][1][2].setColor(tempCube[4][2][1].getColor());
		cube[4][2][0].setColor(tempCube[4][0][0].getColor());
		cube[4][2][1].setColor(tempCube[4][1][0].getColor());
		cube[4][2][2].setColor(tempCube[4][2][0].getColor());
	}
	
	public static void RMove(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		
		cube[0][0][2].setColor(tempCube[5][0][2].getColor());	
		cube[0][1][2].setColor(tempCube[5][1][2].getColor());	
		cube[0][2][2].setColor(tempCube[5][2][2].getColor());

		cube[4][0][2].setColor(tempCube[0][0][2].getColor());
		cube[4][1][2].setColor(tempCube[0][1][2].getColor());
		cube[4][2][2].setColor(tempCube[0][2][2].getColor());

		cube[2][2][0].setColor(tempCube[4][0][2].getColor());
		cube[2][1][0].setColor(tempCube[4][1][2].getColor());
		cube[2][0][0].setColor(tempCube[4][2][2].getColor());
		
		cube[5][2][2].setColor(tempCube[2][0][0].getColor());
		cube[5][1][2].setColor(tempCube[2][1][0].getColor());
		cube[5][0][2].setColor(tempCube[2][2][0].getColor());
		
		cube[3][0][0].setColor(tempCube[3][2][0].getColor());
		cube[3][0][1].setColor(tempCube[3][1][0].getColor());
		cube[3][0][2].setColor(tempCube[3][0][0].getColor());
		cube[3][1][0].setColor(tempCube[3][2][1].getColor());
		cube[3][1][2].setColor(tempCube[3][0][1].getColor());
		cube[3][2][0].setColor(tempCube[3][2][2].getColor());
		cube[3][2][1].setColor(tempCube[3][1][2].getColor());
		cube[3][2][2].setColor(tempCube[3][0][2].getColor());	
	}
	
	public static void RPrime(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
			
		cube[0][0][2].setColor(tempCube[4][0][2].getColor());	
		cube[0][1][2].setColor(tempCube[4][1][2].getColor());			
		cube[0][2][2].setColor(tempCube[4][2][2].getColor());

		cube[4][0][2].setColor(tempCube[2][2][0].getColor());
		cube[4][1][2].setColor(tempCube[2][1][0].getColor());
		cube[4][2][2].setColor(tempCube[2][0][0].getColor());

		cube[2][2][0].setColor(tempCube[5][2][2].getColor());
		cube[2][1][0].setColor(tempCube[5][1][2].getColor());
		cube[2][0][0].setColor(tempCube[5][0][2].getColor());
		
		cube[5][2][2].setColor(tempCube[0][2][2].getColor());
		cube[5][1][2].setColor(tempCube[0][1][2].getColor());
		cube[5][0][2].setColor(tempCube[0][0][2].getColor());
		
		cube[3][0][0].setColor(tempCube[3][0][2].getColor());
		cube[3][0][1].setColor(tempCube[3][1][2].getColor());
		cube[3][0][2].setColor(tempCube[3][2][2].getColor());
		cube[3][1][0].setColor(tempCube[3][0][1].getColor());
		cube[3][1][2].setColor(tempCube[3][2][1].getColor());
		cube[3][2][0].setColor(tempCube[3][0][0].getColor());
		cube[3][2][1].setColor(tempCube[3][1][0].getColor());
		cube[3][2][2].setColor(tempCube[3][2][0].getColor());	
	}
	
	public static void LMove(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		
		cube[0][0][0].setColor(tempCube[4][0][0].getColor());
		cube[0][1][0].setColor(tempCube[4][1][0].getColor());
		cube[0][2][0].setColor(tempCube[4][2][0].getColor());
		
		cube[5][0][0].setColor(tempCube[0][0][0].getColor());
		cube[5][1][0].setColor(tempCube[0][1][0].getColor());
		cube[5][2][0].setColor(tempCube[0][2][0].getColor());
		
		cube[2][0][2].setColor(tempCube[5][2][0].getColor());
		cube[2][1][2].setColor(tempCube[5][1][0].getColor());
		cube[2][2][2].setColor(tempCube[5][0][0].getColor());

		cube[4][2][0].setColor(tempCube[2][0][2].getColor());
		cube[4][1][0].setColor(tempCube[2][1][2].getColor());
		cube[4][0][0].setColor(tempCube[2][2][2].getColor());
		
		cube[1][0][0].setColor(tempCube[1][2][0].getColor());
		cube[1][0][1].setColor(tempCube[1][1][0].getColor());
		cube[1][0][2].setColor(tempCube[1][0][0].getColor());
		cube[1][1][0].setColor(tempCube[1][2][1].getColor());
		cube[1][1][2].setColor(tempCube[1][0][1].getColor());
		cube[1][2][0].setColor(tempCube[1][2][2].getColor());
		cube[1][2][1].setColor(tempCube[1][1][2].getColor());
		cube[1][2][2].setColor(tempCube[1][0][2].getColor());
		
	}	
	
	public static void LPrime(PolyStorage[][][] cube){
		PolyStorage[][][] tempCube = copyArray(cube);
		
		cube[0][0][0].setColor(tempCube[5][0][0].getColor());
		cube[0][1][0].setColor(tempCube[5][1][0].getColor());
		cube[0][2][0].setColor(tempCube[5][2][0].getColor());
		
		cube[5][0][0].setColor(tempCube[2][2][2].getColor());
		cube[5][1][0].setColor(tempCube[2][1][2].getColor());
		cube[5][2][0].setColor(tempCube[2][0][2].getColor());

		cube[2][0][2].setColor(tempCube[4][2][0].getColor());
		cube[2][1][2].setColor(tempCube[4][1][0].getColor());
		cube[2][2][2].setColor(tempCube[4][0][0].getColor());
		
		cube[4][0][0].setColor(tempCube[0][0][0].getColor());
		cube[4][1][0].setColor(tempCube[0][1][0].getColor());
		cube[4][2][0].setColor(tempCube[0][2][0].getColor());
		
		cube[1][0][0].setColor(tempCube[1][0][2].getColor());
		cube[1][0][1].setColor(tempCube[1][1][2].getColor());
		cube[1][0][2].setColor(tempCube[1][2][2].getColor());
		cube[1][1][0].setColor(tempCube[1][0][1].getColor());
		cube[1][1][2].setColor(tempCube[1][2][1].getColor());
		cube[1][2][0].setColor(tempCube[1][0][0].getColor());
		cube[1][2][1].setColor(tempCube[1][1][0].getColor());
		cube[1][2][2].setColor(tempCube[1][2][0].getColor());
	}
	
	private static PolyStorage[][][] copyArray(PolyStorage[][][] cube){
		PolyStorage[][][] ret = new PolyStorage[6][3][3];
		for(int thr = 0; thr < cube.length; thr++){
			for(int r = 0; r < cube[thr].length; r++){
				for(int c = 0; c < cube[thr][r].length; c++){
					ret[thr][r][c] = new PolyStorage(cube[thr][r][c].getPoly(), cube[thr][r][c].getColor());
				}
			}
		}
		return ret;
	}
	
	private static ArrayJava.Colors getColorFromFaceValue(int val){
		if(val == 0)
			return ArrayJava.Colors.white;
		else if(val == 1)
			return ArrayJava.Colors.blue;
		else if(val == 2)
			return ArrayJava.Colors.yellow;
		else if(val == 3)
			return ArrayJava.Colors.green;
		else if(val == 4)
			return ArrayJava.Colors.red;
		else if(val == 5)
			return ArrayJava.Colors.orange;
		return null;
	}
	
	private static void createList(){
		polys = new ArrayList<Polygon>();
		
   //FRONT
	
   polys.add(new Polygon(new int[] {(xstart), (xstart), (xstart + thirdLineX), (xstart + thirdLineX)},
    new int[] {(ystart + (3 * scale)), (ystart), (ystart - thirdLineY), (ystart + (3 * scale) - thirdLineY)}, 4)); //[0,0]

   polys.add(new Polygon(new int[] {(xstart + thirdLineX), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX)},
    new int[] {(ystart + (3 * scale) - thirdLineY), (ystart - thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY)}, 4)); //[0,1]

   polys.add(new Polygon(new int[] {(xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale))},
    new int[] {(ystart - (2 * scale) + thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (2 * scale))}, 4)); //[0,2]

   polys.add(new Polygon(new int[] {(xstart), (xstart), (xstart + thirdLineX), (xstart + thirdLineX)},
    new int[] {(ystart + (6 * scale)), (ystart + (3 * scale)), (ystart + (3 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY)}, 4)); //[1,0]

   polys.add(new Polygon(new int[] {(xstart + thirdLineX), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX)},
    new int[] {(ystart + (6 * scale) - thirdLineY), (ystart + (3 * scale) - thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY)}, 4)); //[1,1]

   polys.add(new Polygon(new int[] {(xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale))},
    new int[] {(ystart + (1 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart - (2 * scale)), (ystart + (1 * scale))}, 4)); //[1,2]

   polys.add(new Polygon(new int[] {(xstart), (xstart), (xstart + thirdLineX), (xstart + thirdLineX)},
    new int[] {(ystart + (9 * scale)), (ystart + (6 * scale)), (ystart + (6 * scale) - thirdLineY), (ystart + (9 * scale) - thirdLineY)}, 4)); //[2,0]

   polys.add(new Polygon(new int[] {(xstart + thirdLineX), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX)},
    new int[] {(ystart + (9 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (4 * scale) + thirdLineY)}, 4)); //[2,1]

   polys.add(new Polygon(new int[] {(xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale))},
    new int[] {(ystart + (4 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (1 * scale)), (ystart + (4 * scale))}, 4)); //[2,2]

 

   //LEFT

   polys.add(new Polygon(new int[] {(xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale)), (xstart - (8 * scale))},
    new int[] {(ystart - (2 * scale) + thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (2 * scale))}, 4)); //[0,0]

   polys.add(new Polygon(new int[] {(xstart - thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX)},
    new int[] {(ystart + (3 * scale) - thirdLineY), (ystart - thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY)}, 4)); //[0,1]

   polys.add(new Polygon(new int[] {(xstart), (xstart), (xstart - thirdLineX), (xstart - thirdLineX)},
    new int[] {(ystart + (3 * scale)), (ystart), (ystart - thirdLineY), (ystart + (3 * scale) - thirdLineY)}, 4)); //[0,2]

   polys.add(new Polygon(new int[] {(xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale)), (xstart - (8 * scale))},
    new int[] {(ystart + (1 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart - (2 * scale)), (ystart + (1 * scale))}, 4)); //[1,0]			

   polys.add(new Polygon(new int[] {(xstart - thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX)},
    new int[] {(ystart + (6 * scale) - thirdLineY), (ystart + (3 * scale) - thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY)}, 4)); //[1,1]

   polys.add(new Polygon(new int[] {(xstart), (xstart), (xstart - thirdLineX), (xstart - thirdLineX)},
    new int[] {(ystart + (6 * scale)), (ystart + (3 * scale)), (ystart + (3 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY)}, 4)); //[1,2]

   polys.add(new Polygon(new int[] {(xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale)), (xstart - (8 * scale))},
    new int[] {(ystart + (4 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (1 * scale)), (ystart + (4 * scale))}, 4)); //[2,0]

   polys.add(new Polygon(new int[] {(xstart - thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX)},
    new int[] {(ystart + (9 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (4 * scale) + thirdLineY)}, 4)); //[2,1]

   polys.add(new Polygon(new int[] {(xstart), (xstart), (xstart - thirdLineX), (xstart - thirdLineX)},
    new int[] {(ystart + (9 * scale)), (ystart + (6 * scale)), (ystart + (6 * scale) - thirdLineY), (ystart + (9 * scale) - thirdLineY)}, 4)); //[2,2]


	
   //BACK
   
   polys.add(new Polygon(new int[] {(backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale)), (backStartX + (8 * scale))},
    new int[] {(backStartY - (2 * scale) + thirdLineY), (backStartY - (5 * scale) + thirdLineY), (backStartY - (5 * scale)), (backStartY - (2 * scale))}, 4)); //[0,0]

   polys.add(new Polygon(new int[] {(backStartX + thirdLineX), (backStartX + thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX)},
    new int[] {(backStartY + (3 * scale) - thirdLineY), (backStartY - thirdLineY), (backStartY - (5 * scale) + thirdLineY), (backStartY - (2 * scale) + thirdLineY)}, 4)); //[0,1]

   polys.add(new Polygon(new int[] {(backStartX), (backStartX), (backStartX + thirdLineX), (backStartX + thirdLineX)},
    new int[] {(backStartY + (3 * scale)), (backStartY), (backStartY - thirdLineY), (backStartY + (3 * scale) - thirdLineY)}, 4)); //[0,2]

   polys.add(new Polygon(new int[] {(backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale)), (backStartX + (8 * scale))},
    new int[] {(backStartY + (1 * scale) + thirdLineY), (backStartY - (2 * scale) + thirdLineY), (backStartY - (2 * scale)), (backStartY + (1 * scale))}, 4)); //[1,0]

   polys.add(new Polygon(new int[] {(backStartX + thirdLineX), (backStartX + thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX)},
    new int[] {(backStartY + (6 * scale) - thirdLineY), (backStartY + (3 * scale) - thirdLineY), (backStartY - (2 * scale) + thirdLineY), (backStartY + (1 * scale) + thirdLineY)}, 4)); //[1,1]

   polys.add(new Polygon(new int[] {(backStartX), (backStartX), (backStartX + thirdLineX), (backStartX + thirdLineX)},
    new int[] {(backStartY + (6 * scale)), (backStartY + (3 * scale)), (backStartY + (3 * scale) - thirdLineY), (backStartY + (6 * scale) - thirdLineY)}, 4)); //[1,2]

   polys.add(new Polygon(new int[] {(backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale)), (backStartX + (8 * scale))},
    new int[] {(backStartY + (4 * scale) + thirdLineY), (backStartY + (1 * scale) + thirdLineY), (backStartY + (1 * scale)), (backStartY + (4 * scale))}, 4)); //[2,0]

   polys.add(new Polygon(new int[] {(backStartX + thirdLineX), (backStartX + thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX)},
    new int[] {(backStartY + (9 * scale) - thirdLineY), (backStartY + (6 * scale) - thirdLineY), (backStartY + (1 * scale) + thirdLineY), (backStartY + (4 * scale) + thirdLineY)}, 4)); //[2,1]

   polys.add(new Polygon(new int[] {(backStartX), (backStartX), (backStartX + thirdLineX), (backStartX + thirdLineX)},
    new int[] {(backStartY + (9 * scale)), (backStartY + (6 * scale)), (backStartY + (6 * scale) - thirdLineY), (backStartY + (9 * scale) - thirdLineY)}, 4)); //[2,2]



   //RIGHT
   
   polys.add(new Polygon(new int[] {(rightStartX), (rightStartX), (rightStartX - thirdLineX), (rightStartX - thirdLineX)},
    new int[] {(rightStartY + (3 * scale)), (rightStartY), (rightStartY - thirdLineY), (rightStartY + (3 * scale) - thirdLineY)}, 4)); //[0,0]
   
   polys.add(new Polygon(new int[] {(rightStartX - thirdLineX), (rightStartX - thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX)},
    new int[] {(rightStartY + (3 * scale) - thirdLineY), (rightStartY - thirdLineY), (rightStartY - (5 * scale) + thirdLineY), (rightStartY - (2 * scale) + thirdLineY)}, 4)); //[0,1]

   polys.add(new Polygon(new int[] {(rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale)), (rightStartX - (8 * scale))},
    new int[] {(rightStartY - (2 * scale) + thirdLineY), (rightStartY - (5 * scale) + thirdLineY), (rightStartY - (5 * scale)), (rightStartY - (2 * scale))}, 4)); //[0,2]

   polys.add(new Polygon(new int[] {(rightStartX), (rightStartX), (rightStartX - thirdLineX), (rightStartX - thirdLineX)},
    new int[] {(rightStartY + (6 * scale)), (rightStartY + (3 * scale)), (rightStartY + (3 * scale) - thirdLineY), (rightStartY + (6 * scale) - thirdLineY)}, 4)); //[1,0]			

   polys.add(new Polygon(new int[] {(rightStartX - thirdLineX), (rightStartX - thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX)},
    new int[] {(rightStartY + (6 * scale) - thirdLineY), (rightStartY + (3 * scale) - thirdLineY), (rightStartY - (2 * scale) + thirdLineY), (rightStartY + (1 * scale) + thirdLineY)}, 4)); //[1,1]
    
   polys.add(new Polygon(new int[] {(rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale)), (rightStartX - (8 * scale))},
    new int[] {(rightStartY + (1 * scale) + thirdLineY), (rightStartY - (2 * scale) + thirdLineY), (rightStartY - (2 * scale)), (rightStartY + (1 * scale))}, 4)); //[1,2]

   polys.add(new Polygon(new int[] {(rightStartX), (rightStartX), (rightStartX - thirdLineX), (rightStartX - thirdLineX)},
    new int[] {(rightStartY + (9 * scale)), (rightStartY + (6 * scale)), (rightStartY + (6 * scale) - thirdLineY), (rightStartY + (9 * scale) - thirdLineY)}, 4)); //[2,0]

   polys.add(new Polygon(new int[] {(rightStartX - thirdLineX), (rightStartX - thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX)},
    new int[] {(rightStartY + (9 * scale) - thirdLineY), (rightStartY + (6 * scale) - thirdLineY), (rightStartY + (1 * scale) + thirdLineY), (rightStartY + (4 * scale) + thirdLineY)}, 4)); //[2,1]

   polys.add(new Polygon(new int[] {(rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale)), (rightStartX - (8 * scale))},
    new int[] {(rightStartY + (4 * scale) + thirdLineY), (rightStartY + (1 * scale) + thirdLineY), (rightStartY + (1 * scale)), (rightStartY + (4 * scale))}, 4)); //[2,2]
	
	
	
   //TOP
   
   polys.add(new Polygon(new int[] {(xstart - (8 * scale)), (xstart - (8 * scale) + thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX)},
   	new int[] {(ystart - (5 * scale)), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY)}, 4)); //[0,0]

   polys.add(new Polygon(new int[] {(xstart - (8 * scale) + thirdLineX), (xstart - thirdLineX), (xstart), (xstart - thirdLineX)},
    new int[] {(ystart - (5 * scale) - thirdLineY), (ystart - (10 * scale) + thirdLineY), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale))}, 4)); //[0,1]

   polys.add(new Polygon(new int[] {(xstart - thirdLineX), (xstart), (xstart + thirdLineX), (xstart)},
    new int[] {(ystart - (10 * scale) + thirdLineY), (ystart - (10 * scale)), (ystart - (10 * scale) + thirdLineY), (ystart - (5 * scale) - thirdLineY)}, 4)); //[0,2]

   polys.add(new Polygon(new int[] {(xstart - (8 * scale) + thirdLineX), (xstart - thirdLineX), (xstart), (xstart - thirdLineX)},
    new int[] {(ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY), (ystart - thirdLineY)}, 4)); //[1,0]

   polys.add(new Polygon(new int[] {(xstart - thirdLineX), (xstart), (xstart + thirdLineX), (xstart)},
    new int[] {(ystart - (5 * scale)), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY)}, 4)); //[1,1]

   polys.add(new Polygon(new int[] {(xstart), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + thirdLineX)},
    new int[] {(ystart - (5 * scale) - thirdLineY), (ystart - (10 * scale) + thirdLineY), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale))}, 4)); //[1,2]

   polys.add(new Polygon(new int[] {(xstart - thirdLineX), (xstart), (xstart + thirdLineX), (xstart)},
    new int[] {(ystart - thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - thirdLineY), (ystart)}, 4)); //[2,0]

   polys.add(new Polygon(new int[] {(xstart), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + thirdLineX)},
    new int[] {(ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY), (ystart - thirdLineY)}, 4)); //[2,1]

   polys.add(new Polygon(new int[] {(xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale) - thirdLineX)},
    new int[] {(ystart - (5 * scale)), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY)}, 4)); //[2,2]


	
   //BOT
   
   polys.add(new Polygon(new int[] {(botStartX - thirdLineX), (botStartX), (botStartX + thirdLineX), (botStartX)},
    new int[] {(botStartY - thirdLineY), (botStartY - (5 * scale) + thirdLineY), (botStartY - thirdLineY), (botStartY)}, 4)); //[0,0]

   polys.add(new Polygon(new int[] {(botStartX), (botStartX + thirdLineX), (botStartX + (8 * scale) - thirdLineX), (botStartX + thirdLineX)},
    new int[] {(botStartY - (5 * scale) + thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY), (botStartY - thirdLineY)}, 4)); //[0,1]

   polys.add(new Polygon(new int[] {(botStartX + thirdLineX), (botStartX + (8 * scale) - thirdLineX), (botStartX + (8 * scale)), (botStartX + (8 * scale) - thirdLineX)},
    new int[] {(botStartY - (5 * scale)), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY)}, 4)); //[0,2]

   polys.add(new Polygon(new int[] {(botStartX - (8 * scale) + thirdLineX), (botStartX - thirdLineX), (botStartX), (botStartX - thirdLineX)},
    new int[] {(botStartY - (5 * scale) + thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY), (botStartY - thirdLineY)}, 4)); //[1,0]

   polys.add(new Polygon(new int[] {(botStartX - thirdLineX), (botStartX), (botStartX + thirdLineX), (botStartX)},
    new int[] {(botStartY - (5 * scale)), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY)}, 4)); //[1,1]

   polys.add(new Polygon(new int[] {(botStartX), (botStartX + thirdLineX), (botStartX + (8 * scale) - thirdLineX), (botStartX + thirdLineX)},
    new int[] {(botStartY - (5 * scale) - thirdLineY), (botStartY - (10 * scale) + thirdLineY), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale))}, 4)); //[1,2]

   polys.add(new Polygon(new int[] {(botStartX - (8 * scale)), (botStartX - (8 * scale) + thirdLineX), (botStartX - thirdLineX), (botStartX - (8 * scale) + thirdLineX)},
    new int[] {(botStartY - (5 * scale)), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY)}, 4)); //[2,0]

   polys.add(new Polygon(new int[] {(botStartX - (8 * scale) + thirdLineX), (botStartX - thirdLineX), (botStartX), (botStartX - thirdLineX)},
    new int[] {(botStartY - (5 * scale) - thirdLineY), (botStartY - (10 * scale) + thirdLineY), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale))}, 4)); //[2,1]

   polys.add(new Polygon(new int[] {(botStartX - thirdLineX), (botStartX), (botStartX + thirdLineX), (botStartX)},
    new int[] {(botStartY - (10 * scale) + thirdLineY), (botStartY - (10 * scale)), (botStartY - (10 * scale) + thirdLineY), (botStartY - (5 * scale) - thirdLineY)}, 4)); //[2,2]

	}
	
	
}