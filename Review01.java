// Review01.java
// 07-23-10 by Leon Schram
// This program demonstrates how to draw lines.
// Lines are drawn from (X1,Y1) to (X2,Y2) with drawLine(X1,Y1,X2,Y2).


import java.awt.*;
import java.applet.*;

public class Review01 extends Applet {
 public void paint(Graphics g) {
  int scale = 18;
  int xstart = 750;
  int ystart = 350;
  int thirdLineX = (int)((8.0 / 3) * scale);
  int thirdLineY = (int)((5.0 / 3) * scale);

  /*	g.drawLine(xstart,ystart,xstart,ystart+(9*scale));
  	
  	g.setColor(Color.red);
  	g.drawLine(xstart,ystart,xstart-(8*scale),ystart-(5*scale));
  	g.drawLine(xstart,ystart,xstart+(8*scale),ystart-(5*scale));
  	
  	g.setColor(Color.yellow);
  	g.drawLine(xstart+(8*scale),ystart+(4*scale),xstart+(8*scale),ystart-(5*scale));
  	g.drawLine(xstart-(8*scale),ystart+(4*scale),xstart-(8*scale),ystart-(5*scale));
  	
  	g.setColor(Color.blue);
  	g.drawLine(xstart,ystart+(9*scale),xstart+(8*scale),ystart+(4*scale));
  	g.drawLine(xstart,ystart+(9*scale),xstart-(8*scale),ystart+(4*scale));
  	
  	g.setColor(Color.orange);
  	g.drawLine(xstart-(8*scale),ystart-(5*scale),xstart,ystart-(10*scale));
  	g.drawLine(xstart+(8*scale),ystart-(5*scale),xstart,ystart-(10*scale));
  	
  	g.setColor(Color.pink);
  	g.drawLine(xstart,ystart+(3*scale),xstart-(8*scale),ystart-(2*scale));
  	g.drawLine(xstart,ystart+(3*scale),xstart+(8*scale),ystart-(2*scale));
  	
  	g.setColor(Color.cyan);
  	g.drawLine(xstart,ystart+(6*scale),xstart-(8*scale),ystart+(1*scale));
  	g.drawLine(xstart,ystart+(6*scale),xstart+(8*scale),ystart+(1*scale));
  	
  	g.setColor(Color.magenta);
  	g.drawLine(xstart-thirdLineX,ystart-thirdLineY,xstart-thirdLineX,ystart+(9*scale)-thirdLineY);
  	g.drawLine(xstart+thirdLineX,ystart-thirdLineY,xstart+thirdLineX,ystart+(9*scale)-thirdLineY);
  	
  	g.setColor(Color.gray);
  	g.drawLine(xstart-(thirdLineX*2),ystart-(thirdLineY*2),xstart-(thirdLineX*2),ystart+(9*scale)-(thirdLineY*2));
  	g.drawLine(xstart+(thirdLineX*2),ystart-(thirdLineY*2),xstart+(thirdLineX*2),ystart+(9*scale)-(thirdLineY*2));
  	
  	g.setColor(Color.lightGray);
  	g.drawLine(xstart-thirdLineX,ystart-thirdLineY,xstart+(8*scale)-thirdLineX,ystart-(5*scale)-thirdLineY);
  	g.drawLine(xstart+thirdLineX,ystart-thirdLineY,xstart-(8*scale)+thirdLineX,ystart-(5*scale)-thirdLineY);
  	
  	g.setColor(Color.darkGray);
  	g.drawLine(xstart-(thirdLineX*2),ystart-(thirdLineY*2),xstart+(8*scale)-(thirdLineX*2),ystart-(5*scale)-(thirdLineY*2));
  	g.drawLine(xstart+(thirdLineX*2),ystart-(thirdLineY*2),xstart-(8*scale)+(thirdLineX*2),ystart-(5*scale)-(thirdLineY*2));*/


  int rightStartX = xstart + (18 * scale);
  int rightStartY = ystart - (10 * scale);

  /*	g.drawLine(rightStartX,rightStartY,rightStartX,rightStartY+(9*scale));
  	g.drawLine(rightStartX,rightStartY,rightStartX-(8*scale),rightStartY-(5*scale));
  	g.drawLine(rightStartX-(8*scale),rightStartY+(4*scale),rightStartX-(8*scale),rightStartY-(5*scale));
  	g.drawLine(rightStartX,rightStartY+(9*scale),rightStartX-(8*scale),rightStartY+(4*scale));
  	g.drawLine(rightStartX,rightStartY+(3*scale),rightStartX-(8*scale),rightStartY-(2*scale));
  	g.drawLine(rightStartX,rightStartY+(6*scale),rightStartX-(8*scale),rightStartY+(1*scale));
  	g.drawLine(rightStartX-thirdLineX,rightStartY-thirdLineY,rightStartX-thirdLineX,rightStartY+(9*scale)-thirdLineY);
  	g.drawLine(rightStartX-(thirdLineX*2),rightStartY-(thirdLineY*2),rightStartX-(thirdLineX*2),rightStartY+(9*scale)-(thirdLineY*2));*/

  int backStartX = xstart - (18 * scale);
  int backStartY = ystart - (10 * scale);

  /*	g.drawLine(backStartX,backStartY,backStartX,backStartY+(9*scale));
  	g.drawLine(backStartX,backStartY,backStartX+(8*scale),backStartY-(5*scale));
  	g.drawLine(backStartX+(8*scale),backStartY+(4*scale),backStartX+(8*scale),backStartY-(5*scale));
  	g.drawLine(backStartX,backStartY+(9*scale),backStartX+(8*scale),backStartY+(4*scale));
  	g.drawLine(backStartX,backStartY+(3*scale),backStartX+(8*scale),backStartY-(2*scale));
  	g.drawLine(backStartX,backStartY+(6*scale),backStartX+(8*scale),backStartY+(1*scale));
  	g.drawLine(backStartX+thirdLineX,backStartY-thirdLineY,backStartX+thirdLineX,backStartY+(9*scale)-thirdLineY);
  	g.drawLine(backStartX+(thirdLineX*2),backStartY-(thirdLineY*2),backStartX+(thirdLineX*2),backStartY+(9*scale)-(thirdLineY*2));*/

  int botStartX = xstart;
  int botStartY = ystart + (20 * scale);

  /*	g.drawLine(botStartX,botStartY,botStartX-(8*scale),botStartY-(5*scale));
  	g.drawLine(botStartX,botStartY,botStartX+(8*scale),botStartY-(5*scale));
  	
  	g.drawLine(botStartX-(8*scale),botStartY-(5*scale),botStartX,botStartY-(10*scale));
  	g.drawLine(botStartX+(8*scale),botStartY-(5*scale),botStartX,botStartY-(10*scale));
  	
  	g.drawLine(botStartX-thirdLineX,botStartY-thirdLineY,botStartX+(8*scale)-thirdLineX,botStartY-(5*scale)-thirdLineY);
  	g.drawLine(botStartX+thirdLineX,botStartY-thirdLineY,botStartX-(8*scale)+thirdLineX,botStartY-(5*scale)-thirdLineY);
  	
  	g.drawLine(botStartX-(thirdLineX*2),botStartY-(thirdLineY*2),botStartX+(8*scale)-(thirdLineX*2),botStartY-(5*scale)-(thirdLineY*2));
  	g.drawLine(botStartX+(thirdLineX*2),botStartY-(thirdLineY*2),botStartX-(8*scale)+(thirdLineX*2),botStartY-(5*scale)-(thirdLineY*2));*/

  //		g.fillPolygon(new int[]{xstart-(8*scale) , xstart-(thirdLineX*2) , xstart-thirdLineX , xstart-(thirdLineX*2)},new int[]{ystart-(5*scale) , ystart-(thirdLineY*4) , ystart-(thirdLineY*3) , ystart-(thirdLineY*2)},4);

  /*		g.drawOval(	(xstart-(8*scale)) 				-5, (ystart-(5*scale))  				-5,10,10);//a1
  		g.drawOval(	(xstart-(8*scale)) 				-5, (ystart-(2*scale))  				-5,10,10);//a2
  		g.drawOval(	(xstart-(8*scale)) 				-5, (ystart+(1*scale))  				-5,10,10);//a3
  		g.drawOval(	(xstart-(8*scale)) 				-5, (ystart+(4*scale))  				-5,10,10);//a4
  		
  		g.drawOval(	(xstart-(8*scale)+thirdLineX) 	-5, (ystart-(5*scale)-thirdLineY)  		-5,10,10);//a5
  		g.drawOval(	(xstart-(8*scale)+thirdLineX) 	-5, (ystart-(5*scale)+thirdLineY)  		-5,10,10);//a6
  		g.drawOval(	(xstart-(8*scale)+thirdLineX) 	-5, (ystart-(2*scale)+thirdLineY)  		-5,10,10);//a7
  		g.drawOval(	(xstart-(8*scale)+thirdLineX) 	-5, (ystart+(1*scale)+thirdLineY)		-5,10,10);//a8
  		g.drawOval(	(xstart-(8*scale)+thirdLineX) 	-5, (ystart+(4*scale)+thirdLineY)		-5,10,10);//a9
  		
  		g.drawOval(	(xstart-thirdLineX) 			-5, (ystart-(10*scale)+thirdLineY)		-5,10,10);//a10
  		g.drawOval(	(xstart-thirdLineX)				-5, (ystart-(5*scale))  				-5,10,10);//a11
  		g.drawOval(	(xstart-thirdLineX)				-5, (ystart-thirdLineY)	 				-5,10,10);//a12
  		g.drawOval(	(xstart-thirdLineX)				-5, (ystart+(3*scale)-thirdLineY)		-5,10,10);//a13
  		g.drawOval(	(xstart-thirdLineX)				-5, (ystart+(6*scale)-thirdLineY)	 	-5,10,10);//a14
  		g.drawOval(	(xstart-thirdLineX)				-5, (ystart+(9*scale)-thirdLineY)		-5,10,10);//a15
  		
  		g.drawOval(	(xstart)						-5, (ystart-(10*scale))  				-5,10,10);//a16
  		g.drawOval(	(xstart)						-5, (ystart-(5*scale)-thirdLineY)  		-5,10,10);//a17
  		g.drawOval(	(xstart)						-5, (ystart-(5*scale)+thirdLineY)  		-5,10,10);//a18
  		g.drawOval(	(xstart)						-5, (ystart)  							-5,10,10);//a19
  		g.drawOval(	(xstart)						-5, (ystart+(3*scale))  				-5,10,10);//a20
  		
  		g.drawOval(	(xstart)						-5, (ystart+(9*scale))  				-5,10,10);//a22
  		
  		g.drawOval(	(xstart+thirdLineX)				-5, (ystart-(10*scale)+thirdLineY)		-5,10,10);//a23
  		g.drawOval(	(xstart+thirdLineX)				-5, (ystart-(5*scale))					-5,10,10);//a24
  		g.drawOval(	(xstart+thirdLineX)				-5, (ystart-thirdLineY)					-5,10,10);//a25
  		g.drawOval(	(xstart+thirdLineX)				-5, (ystart+(3*scale)-thirdLineY)		-5,10,10);//a26
  		g.drawOval(	(xstart+thirdLineX)				-5, (ystart+(6*scale)-thirdLineY)		-5,10,10);//a27
  		g.drawOval(	(xstart+thirdLineX)				-5, (ystart+(9*scale)-thirdLineY)		-5,10,10);//a28
  		
  		g.drawOval(	(xstart+(8*scale)-thirdLineX)	-5, (ystart-(5*scale)-thirdLineY)		-5,10,10);//a29
  		g.drawOval(	(xstart+(8*scale)-thirdLineX)	-5, (ystart-(5*scale)+thirdLineY)		-5,10,10);//a30
  		g.drawOval(	(xstart+(8*scale)-thirdLineX)	-5, (ystart-(2*scale)+thirdLineY)		-5,10,10);//a31
  		g.drawOval(	(xstart+(8*scale)-thirdLineX)	-5, (ystart+(1*scale)+thirdLineY)		-5,10,10);//a32
  		g.drawOval(	(xstart+(8*scale)-thirdLineX)	-5, (ystart+(4*scale)+thirdLineY)		-5,10,10);//a33
  		
  		g.drawOval(	(xstart+(8*scale))				-5, (ystart-(5*scale))					-5,10,10);//a34
  		g.drawOval(	(xstart+(8*scale))				-5, (ystart-(2*scale))					-5,10,10);//a35
  		g.drawOval(	(xstart+(8*scale))				-5, (ystart+(1*scale))					-5,10,10);//a36
  		g.drawOval(	(xstart+(8*scale))				-5, (ystart+(4*scale))					-5,10,10);//a37
  		
  		
  		g.drawOval(	(botStartX-(8*scale))				-5, (botStartY-(5*scale))					-5,10,10);//b1
  		g.drawOval(	(botStartX-(8*scale)+thirdLineX)	-5, (botStartY-(5*scale)-thirdLineY)  		-5,10,10);//b2
  		g.drawOval(	(botStartX-(8*scale)+thirdLineX)	-5, (botStartY-(5*scale)+thirdLineY)  		-5,10,10);//b3
  		g.drawOval(	(botStartX-thirdLineX) 				-5, (botStartY-(10*scale)+thirdLineY)		-5,10,10);//b4
  		g.drawOval(	(botStartX-thirdLineX)				-5, (botStartY-(5*scale))  					-5,10,10);//b5
  		g.drawOval(	(botStartX-thirdLineX)				-5, (botStartY-thirdLineY)	 				-5,10,10);//b6
  		g.drawOval(	(botStartX)							-5, (botStartY-(10*scale))  				-5,10,10);//b7
  		g.drawOval(	(botStartX)							-5, (botStartY-(5*scale)-thirdLineY)  		-5,10,10);//b8
  		g.drawOval(	(botStartX)							-5, (botStartY-(5*scale)+thirdLineY)  		-5,10,10);//b9
  		g.drawOval(	(botStartX)							-5, (botStartY)  							-5,10,10);//b10
  		g.drawOval(	(botStartX+thirdLineX)				-5, (botStartY-(10*scale)+thirdLineY)		-5,10,10);//b11
  		g.drawOval(	(botStartX+thirdLineX)				-5, (botStartY-(5*scale))					-5,10,10);//b12
  		g.drawOval(	(botStartX+thirdLineX)				-5, (botStartY-thirdLineY)					-5,10,10);//b13
  		g.drawOval(	(botStartX+(8*scale)-thirdLineX)	-5, (botStartY-(5*scale)-thirdLineY)		-5,10,10);//b14
  		g.drawOval(	(botStartX+(8*scale)-thirdLineX)	-5, (botStartY-(5*scale)+thirdLineY)		-5,10,10);//b15
  		g.drawOval(	(botStartX+(8*scale))				-5, (botStartY-(5*scale))					-5,10,10);//b16
  		
  		
  		g.drawOval(	(backStartX)						-5, (backStartY)							-5,10,10);//c1
  		g.drawOval(	(backStartX)						-5, (backStartY+(3*scale))  				-5,10,10);//c2
  		g.drawOval(	(backStartX)						-5, (backStartY+(6*scale))  				-5,10,10);//c3
  		g.drawOval(	(backStartX)						-5, (backStartY+(9*scale))  				-5,10,10);//c4
  		g.drawOval(	(backStartX+thirdLineX)				-5, (backStartY-thirdLineY)					-5,10,10);//c5
  		g.drawOval(	(backStartX+thirdLineX)				-5, (backStartY+(3*scale)-thirdLineY)		-5,10,10);//c6
  		g.drawOval(	(backStartX+thirdLineX)				-5, (backStartY+(6*scale)-thirdLineY)		-5,10,10);//c7
  		g.drawOval(	(backStartX+thirdLineX)				-5, (backStartY+(9*scale)-thirdLineY)		-5,10,10);//c8
  		g.drawOval(	(backStartX+(8*scale)-thirdLineX)	-5, (backStartY-(5*scale)+thirdLineY)		-5,10,10);//c9
  		g.drawOval(	(backStartX+(8*scale)-thirdLineX)	-5, (backStartY-(2*scale)+thirdLineY)		-5,10,10);//c10
  		g.drawOval(	(backStartX+(8*scale)-thirdLineX)	-5, (backStartY+(1*scale)+thirdLineY)		-5,10,10);//c11
  		g.drawOval(	(backStartX+(8*scale)-thirdLineX)	-5, (backStartY+(4*scale)+thirdLineY)		-5,10,10);//c12
  		g.drawOval(	(backStartX+(8*scale))				-5, (backStartY-(5*scale))					-5,10,10);//c13
  		g.drawOval(	(backStartX+(8*scale))				-5, (backStartY-(2*scale))					-5,10,10);//c14
  		g.drawOval(	(backStartX+(8*scale))				-5, (backStartY+(1*scale))					-5,10,10);//c15
  		g.drawOval(	(backStartX+(8*scale))				-5, (backStartY+(4*scale))					-5,10,10);//c16
  		
  		
  		g.drawOval(	(rightStartX-(8*scale)) 			-5, (rightStartY-(5*scale))  				-5,10,10);//d1
  		g.drawOval(	(rightStartX-(8*scale)) 			-5, (rightStartY-(2*scale))  				-5,10,10);//d2
  		g.drawOval(	(rightStartX-(8*scale)) 			-5, (rightStartY+(1*scale))  				-5,10,10);//d3
  		g.drawOval(	(rightStartX-(8*scale)) 			-5, (rightStartY+(4*scale))  				-5,10,10);//d4
  		g.drawOval(	(rightStartX-(8*scale)+thirdLineX) 	-5, (rightStartY-(5*scale)+thirdLineY)  	-5,10,10);//d5
  		g.drawOval(	(rightStartX-(8*scale)+thirdLineX) 	-5, (rightStartY-(2*scale)+thirdLineY)  	-5,10,10);//d6
  		g.drawOval(	(rightStartX-(8*scale)+thirdLineX) 	-5, (rightStartY+(1*scale)+thirdLineY)		-5,10,10);//d7
  		g.drawOval(	(rightStartX-(8*scale)+thirdLineX) 	-5, (rightStartY+(4*scale)+thirdLineY)		-5,10,10);//d8
  		g.drawOval(	(rightStartX-thirdLineX)			-5, (rightStartY-thirdLineY)	 			-5,10,10);//d9
  		g.drawOval(	(rightStartX-thirdLineX)			-5, (rightStartY+(3*scale)-thirdLineY)		-5,10,10);//d10
  		g.drawOval(	(rightStartX-thirdLineX)			-5, (rightStartY+(6*scale)-thirdLineY)	 	-5,10,10);//d11
  		g.drawOval(	(rightStartX-thirdLineX)			-5, (rightStartY+(9*scale)-thirdLineY)		-5,10,10);//d12
  		g.drawOval(	(rightStartX)						-5, (rightStartY)  							-5,10,10);//d13
  		g.drawOval(	(rightStartX)						-5, (rightStartY+(3*scale))  				-5,10,10);//d14
  		g.drawOval(	(rightStartX)						-5, (rightStartY+(6*scale))  				-5,10,10);//d15
  		g.drawOval(	(rightStartX)						-5, (rightStartY+(9*scale))  				-5,10,10);//d16		*/



  /****	 g.fillPolygon(new int[]{	x1		,	x2	,	x3	,	x4	},		**********************************************
   *******				new int[]{		y1		,	y2	,	y3	,	y4	},4); //[ArrayIndex,ArrayIndex]		*****************/

  //TOP
  g.fillPolygon(new int[] {
    (xstart - (8 * scale)), (xstart - (8 * scale) + thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale)), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY)
   }, 4); //[0,0]

  g.fillPolygon(new int[] {
    (xstart - (8 * scale) + thirdLineX), (xstart - thirdLineX), (xstart), (xstart - thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale) - thirdLineY), (ystart - (10 * scale) + thirdLineY), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale))
   }, 4); //[0,1]

  g.fillPolygon(new int[] {
    (xstart - thirdLineX), (xstart), (xstart + thirdLineX), (xstart)
   },
   new int[] {
    (ystart - (10 * scale) + thirdLineY), (ystart - (10 * scale)), (ystart - (10 * scale) + thirdLineY), (ystart - (5 * scale) - thirdLineY)
   }, 4); //[0,2]

  g.fillPolygon(new int[] {
    (xstart - (8 * scale) + thirdLineX), (xstart - thirdLineX), (xstart), (xstart - thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY), (ystart - thirdLineY)
   }, 4); //[1,0]

  g.fillPolygon(new int[] {
    (xstart - thirdLineX), (xstart), (xstart + thirdLineX), (xstart)
   },
   new int[] {
    (ystart - (5 * scale)), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY)
   }, 4); //[1,1]

  g.fillPolygon(new int[] {
    (xstart), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale) - thirdLineY), (ystart - (10 * scale) + thirdLineY), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale))
   }, 4); //[1,2]

  g.fillPolygon(new int[] {
    (xstart - thirdLineX), (xstart), (xstart + thirdLineX), (xstart)
   },
   new int[] {
    (ystart - thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - thirdLineY), (ystart)
   }, 4); //[2,0]

  g.fillPolygon(new int[] {
    (xstart), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY), (ystart - thirdLineY)
   }, 4); //[2,1]

  g.fillPolygon(new int[] {
    (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale) - thirdLineX)
   },
   new int[] {
    (ystart - (5 * scale)), (ystart - (5 * scale) - thirdLineY), (ystart - (5 * scale)), (ystart - (5 * scale) + thirdLineY)
   }, 4); //[2,2]


  //FRONT
  g.setColor(Color.red); //randi color(not needed)

  g.fillPolygon(new int[] {
    (xstart), (xstart), (xstart + thirdLineX), (xstart + thirdLineX)
   },
   new int[] {
    (ystart + (3 * scale)), (ystart), (ystart - thirdLineY), (ystart + (3 * scale) - thirdLineY)
    }, 4); //[0,0]

   g.fillPolygon(new int[] {
     (xstart + thirdLineX), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX)
    },
    new int[] {
     (ystart + (3 * scale) - thirdLineY), (ystart - thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY)
    }, 4); //[0,1]

   g.fillPolygon(new int[] {
     (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale))
    },
    new int[] {
     (ystart - (2 * scale) + thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (2 * scale))
    }, 4); //[0,2]

   g.fillPolygon(new int[] {
     (xstart), (xstart), (xstart + thirdLineX), (xstart + thirdLineX)
    },
    new int[] {
     (ystart + (6 * scale)), (ystart + (3 * scale)), (ystart + (3 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY)
    }, 4); //[1,0]

   g.fillPolygon(new int[] {
     (xstart + thirdLineX), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX)
    },
    new int[] {
     (ystart + (6 * scale) - thirdLineY), (ystart + (3 * scale) - thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY)
    }, 4); //[1,1]

   g.fillPolygon(new int[] {
     (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale))
    },
    new int[] {
     (ystart + (1 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart - (2 * scale)), (ystart + (1 * scale))
    }, 4); //[1,2]

   g.fillPolygon(new int[] {
     (xstart), (xstart), (xstart + thirdLineX), (xstart + thirdLineX)
    },
    new int[] {
     (ystart + (9 * scale)), (ystart + (6 * scale)), (ystart + (6 * scale) - thirdLineY), (ystart + (9 * scale) - thirdLineY)
    }, 4); //[2,0]

   g.fillPolygon(new int[] {
     (xstart + thirdLineX), (xstart + thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX)
    },
    new int[] {
     (ystart + (9 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (4 * scale) + thirdLineY)
    }, 4); //[2,1]

   g.fillPolygon(new int[] {
     (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale) - thirdLineX), (xstart + (8 * scale)), (xstart + (8 * scale))
    },
    new int[] {
     (ystart + (4 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (1 * scale)), (ystart + (4 * scale))
    }, 4); //[2,2]


   //LEFT
   g.setColor(Color.blue);

   g.fillPolygon(new int[] {
     (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale)), (xstart - (8 * scale))
    },
    new int[] {
     (ystart - (2 * scale) + thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (5 * scale)), (ystart - (2 * scale))
    }, 4); //[0,0]

   g.fillPolygon(new int[] {
     (xstart - thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX)
    },
    new int[] {
     (ystart + (3 * scale) - thirdLineY), (ystart - thirdLineY), (ystart - (5 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY)
    }, 4); //[0,1]

   g.fillPolygon(new int[] {
     (xstart), (xstart), (xstart - thirdLineX), (xstart - thirdLineX)
    },
    new int[] {
     (ystart + (3 * scale)), (ystart), (ystart - thirdLineY), (ystart + (3 * scale) - thirdLineY)
    }, 4); //[0,2]

   g.fillPolygon(new int[] {
     (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale)), (xstart - (8 * scale))
    },
    new int[] {
     (ystart + (1 * scale) + thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart - (2 * scale)), (ystart + (1 * scale))
    }, 4); //[1,0]			

   g.fillPolygon(new int[] {
     (xstart - thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX)
    },
    new int[] {
     (ystart + (6 * scale) - thirdLineY), (ystart + (3 * scale) - thirdLineY), (ystart - (2 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY)
    }, 4); //[1,1]

   g.fillPolygon(new int[] {
     (xstart), (xstart), (xstart - thirdLineX), (xstart - thirdLineX)
    },
    new int[] {
     (ystart + (6 * scale)), (ystart + (3 * scale)), (ystart + (3 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY)
    }, 4); //[1,2]

   g.fillPolygon(new int[] {
     (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale)), (xstart - (8 * scale))
    },
    new int[] {
     (ystart + (4 * scale) + thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (1 * scale)), (ystart + (4 * scale))
    }, 4); //[2,0]

   g.fillPolygon(new int[] {
     (xstart - thirdLineX), (xstart - thirdLineX), (xstart - (8 * scale) + thirdLineX), (xstart - (8 * scale) + thirdLineX)
    },
    new int[] {
     (ystart + (9 * scale) - thirdLineY), (ystart + (6 * scale) - thirdLineY), (ystart + (1 * scale) + thirdLineY), (ystart + (4 * scale) + thirdLineY)
    }, 4); //[2,1]

   g.fillPolygon(new int[] {
     (xstart), (xstart), (xstart - thirdLineX), (xstart - thirdLineX)
    },
    new int[] {
     (ystart + (9 * scale)), (ystart + (6 * scale)), (ystart + (6 * scale) - thirdLineY), (ystart + (9 * scale) - thirdLineY)
    }, 4); //[2,2]


   //BOT
   g.fillPolygon(new int[] {
     (botStartX - (8 * scale)), (botStartX - (8 * scale) + thirdLineX), (botStartX - thirdLineX), (botStartX - (8 * scale) + thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale)), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY)
    }, 4); //[2,0]

   g.fillPolygon(new int[] {
     (botStartX - (8 * scale) + thirdLineX), (botStartX - thirdLineX), (botStartX), (botStartX - thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale) - thirdLineY), (botStartY - (10 * scale) + thirdLineY), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale))
    }, 4); //[2,1]

   g.fillPolygon(new int[] {
     (botStartX - thirdLineX), (botStartX), (botStartX + thirdLineX), (botStartX)
    },
    new int[] {
     (botStartY - (10 * scale) + thirdLineY), (botStartY - (10 * scale)), (botStartY - (10 * scale) + thirdLineY), (botStartY - (5 * scale) - thirdLineY)
    }, 4); //[2,2]

   g.fillPolygon(new int[] {
     (botStartX - (8 * scale) + thirdLineX), (botStartX - thirdLineX), (botStartX), (botStartX - thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale) + thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY), (botStartY - thirdLineY)
    }, 4); //[1,0]

   g.fillPolygon(new int[] {
     (botStartX - thirdLineX), (botStartX), (botStartX + thirdLineX), (botStartX)
    },
    new int[] {
     (botStartY - (5 * scale)), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY)
    }, 4); //[1,1]

   g.fillPolygon(new int[] {
     (botStartX), (botStartX + thirdLineX), (botStartX + (8 * scale) - thirdLineX), (botStartX + thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale) - thirdLineY), (botStartY - (10 * scale) + thirdLineY), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale))
    }, 4); //[1,2]

   g.fillPolygon(new int[] {
     (botStartX - thirdLineX), (botStartX), (botStartX + thirdLineX), (botStartX)
    },
    new int[] {
     (botStartY - thirdLineY), (botStartY - (5 * scale) + thirdLineY), (botStartY - thirdLineY), (botStartY)
    }, 4); //[0,0]

   g.fillPolygon(new int[] {
     (botStartX), (botStartX + thirdLineX), (botStartX + (8 * scale) - thirdLineX), (botStartX + thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale) + thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY), (botStartY - thirdLineY)
    }, 4); //[0,1]

   g.fillPolygon(new int[] {
     (botStartX + thirdLineX), (botStartX + (8 * scale) - thirdLineX), (botStartX + (8 * scale)), (botStartX + (8 * scale) - thirdLineX)
    },
    new int[] {
     (botStartY - (5 * scale)), (botStartY - (5 * scale) - thirdLineY), (botStartY - (5 * scale)), (botStartY - (5 * scale) + thirdLineY)
    }, 4); //[0,2]


   //BACK
   g.fillPolygon(new int[] {
     (backStartX), (backStartX), (backStartX + thirdLineX), (backStartX + thirdLineX)
    },
    new int[] {
     (backStartY + (3 * scale)), (backStartY), (backStartY - thirdLineY), (backStartY + (3 * scale) - thirdLineY)
    }, 4); //[0,2]

   g.fillPolygon(new int[] {
     (backStartX + thirdLineX), (backStartX + thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX)
    },
    new int[] {
     (backStartY + (3 * scale) - thirdLineY), (backStartY - thirdLineY), (backStartY - (5 * scale) + thirdLineY), (backStartY - (2 * scale) + thirdLineY)
    }, 4); //[0,1]

   g.fillPolygon(new int[] {
     (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale)), (backStartX + (8 * scale))
    },
    new int[] {
     (backStartY - (2 * scale) + thirdLineY), (backStartY - (5 * scale) + thirdLineY), (backStartY - (5 * scale)), (backStartY - (2 * scale))
    }, 4); //[0,0]

   g.fillPolygon(new int[] {
     (backStartX), (backStartX), (backStartX + thirdLineX), (backStartX + thirdLineX)
    },
    new int[] {
     (backStartY + (6 * scale)), (backStartY + (3 * scale)), (backStartY + (3 * scale) - thirdLineY), (backStartY + (6 * scale) - thirdLineY)
    }, 4); //[1,2]

   g.fillPolygon(new int[] {
     (backStartX + thirdLineX), (backStartX + thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX)
    },
    new int[] {
     (backStartY + (6 * scale) - thirdLineY), (backStartY + (3 * scale) - thirdLineY), (backStartY - (2 * scale) + thirdLineY), (backStartY + (1 * scale) + thirdLineY)
    }, 4); //[1,1]

   g.fillPolygon(new int[] {
     (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale)), (backStartX + (8 * scale))
    },
    new int[] {
     (backStartY + (1 * scale) + thirdLineY), (backStartY - (2 * scale) + thirdLineY), (backStartY - (2 * scale)), (backStartY + (1 * scale))
    }, 4); //[1,0]

   g.fillPolygon(new int[] {
     (backStartX), (backStartX), (backStartX + thirdLineX), (backStartX + thirdLineX)
    },
    new int[] {
     (backStartY + (9 * scale)), (backStartY + (6 * scale)), (backStartY + (6 * scale) - thirdLineY), (backStartY + (9 * scale) - thirdLineY)
    }, 4); //[2,2]

   g.fillPolygon(new int[] {
     (backStartX + thirdLineX), (backStartX + thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX)
    },
    new int[] {
     (backStartY + (9 * scale) - thirdLineY), (backStartY + (6 * scale) - thirdLineY), (backStartY + (1 * scale) + thirdLineY), (backStartY + (4 * scale) + thirdLineY)
    }, 4); //[2,1]

   g.fillPolygon(new int[] {
     (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale) - thirdLineX), (backStartX + (8 * scale)), (backStartX + (8 * scale))
    },
    new int[] {
     (backStartY + (4 * scale) + thirdLineY), (backStartY + (1 * scale) + thirdLineY), (backStartY + (1 * scale)), (backStartY + (4 * scale))
    }, 4); //[2,0]


   //RIGHT
   g.fillPolygon(new int[] {
     (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale)), (rightStartX - (8 * scale))
    },
    new int[] {
     (rightStartY - (2 * scale) + thirdLineY), (rightStartY - (5 * scale) + thirdLineY), (rightStartY - (5 * scale)), (rightStartY - (2 * scale))
    }, 4); //[0,2]

   g.fillPolygon(new int[] {
     (rightStartX - thirdLineX), (rightStartX - thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX)
    },
    new int[] {
     (rightStartY + (3 * scale) - thirdLineY), (rightStartY - thirdLineY), (rightStartY - (5 * scale) + thirdLineY), (rightStartY - (2 * scale) + thirdLineY)
    }, 4); //[0,1]

   g.fillPolygon(new int[] {
     (rightStartX), (rightStartX), (rightStartX - thirdLineX), (rightStartX - thirdLineX)
    },
    new int[] {
     (rightStartY + (3 * scale)), (rightStartY), (rightStartY - thirdLineY), (rightStartY + (3 * scale) - thirdLineY)
    }, 4); //[0,0]

   g.fillPolygon(new int[] {
     (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale)), (rightStartX - (8 * scale))
    },
    new int[] {
     (rightStartY + (1 * scale) + thirdLineY), (rightStartY - (2 * scale) + thirdLineY), (rightStartY - (2 * scale)), (rightStartY + (1 * scale))
    }, 4); //[1,2]			

   g.fillPolygon(new int[] {
     (rightStartX - thirdLineX), (rightStartX - thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX)
    },
    new int[] {
     (rightStartY + (6 * scale) - thirdLineY), (rightStartY + (3 * scale) - thirdLineY), (rightStartY - (2 * scale) + thirdLineY), (rightStartY + (1 * scale) + thirdLineY)
    }, 4); //[1,1]

   g.fillPolygon(new int[] {
     (rightStartX), (rightStartX), (rightStartX - thirdLineX), (rightStartX - thirdLineX)
    },
    new int[] {
     (rightStartY + (6 * scale)), (rightStartY + (3 * scale)), (rightStartY + (3 * scale) - thirdLineY), (rightStartY + (6 * scale) - thirdLineY)
    }, 4); //[1,0]

   g.fillPolygon(new int[] {
     (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale)), (rightStartX - (8 * scale))
    },
    new int[] {
     (rightStartY + (4 * scale) + thirdLineY), (rightStartY + (1 * scale) + thirdLineY), (rightStartY + (1 * scale)), (rightStartY + (4 * scale))
    }, 4); //[2,2]

   g.fillPolygon(new int[] {
     (rightStartX - thirdLineX), (rightStartX - thirdLineX), (rightStartX - (8 * scale) + thirdLineX), (rightStartX - (8 * scale) + thirdLineX)
    },
    new int[] {
     (rightStartY + (9 * scale) - thirdLineY), (rightStartY + (6 * scale) - thirdLineY), (rightStartY + (1 * scale) + thirdLineY), (rightStartY + (4 * scale) + thirdLineY)
    }, 4); //[2,1]

   g.fillPolygon(new int[] {
     (rightStartX), (rightStartX), (rightStartX - thirdLineX), (rightStartX - thirdLineX)
    },
    new int[] {
     (rightStartY + (9 * scale)), (rightStartY + (6 * scale)), (rightStartY + (6 * scale) - thirdLineY), (rightStartY + (9 * scale) - thirdLineY)
    }, 4); //[2,0]







  }
 }