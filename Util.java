public class Util {
	
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
		for(int thr = 0; thr < cube.length; thr++){
			for(int r = 0; r < cube[thr].length; r++){
				for(int c = 0; c < cube[thr][r].length; c++){
					cube[thr][r][c] = new PolyStorage(getColorFromFaceValue(thr));
				}
			}
		}
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

		cube[2][2][0].setColor(tempCube[4][0][2].getColor());
		cube[2][1][0].setColor(tempCube[4][1][2].getColor());
		cube[2][0][0].setColor(tempCube[4][2][2].getColor());
		
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
					ret[thr][r][c] = cube[thr][r][c];
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
		return ArrayJava.Colors.orange;
	}
}