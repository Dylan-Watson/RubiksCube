
public class Util {
	
	public static void resetArray(ArrayJava.Colors[][][] cube){
		//Front = 0, Left = 1, Back = 2, Right = 3, Top = 4, Bottom = 5
		//Front is white center
		for(int thr = 0; thr < cube.length; thr++){
			for(int r = 0; r < cube[thr].length; r++){
				for(int c = 0; c < cube[thr][r].length; c++){
					cube[thr][r][c] = getColorFromFaceValue(thr);
				}
			}
		}
	}
	
	public static void UMove(ArrayJava.Colors[][][] cube){
		ArrayJava.Colors[][][] tempCube = copyArray(cube);
		cube[0][0][0] = tempCube[3][0][0];
		cube[0][0][1] = tempCube[3][0][1];
		cube[0][0][2] = tempCube[3][0][2];
		
		cube[1][0][0] = tempCube[0][0][0];
		cube[1][0][1] = tempCube[0][0][1];
		cube[1][0][2] = tempCube[0][0][2];
		
		cube[2][0][0] = tempCube[1][0][0];
		cube[2][0][1] = tempCube[1][0][1];
		cube[2][0][2] = tempCube[1][0][2];
		
		cube[3][0][0] = tempCube[2][0][0];
		cube[3][0][1] = tempCube[2][0][1];
		cube[3][0][2] = tempCube[2][0][2];
		
		cube[4][0][0] = tempCube[4][2][0];
		cube[4][0][1] = tempCube[4][1][0];
		cube[4][0][2] = tempCube[4][0][0];
		cube[4][1][0] = tempCube[4][2][1];
		cube[4][1][2] = tempCube[4][0][1];
		cube[4][2][0] = tempCube[4][2][2];
		cube[4][2][1] = tempCube[4][1][2];
		cube[4][2][2] = tempCube[4][0][2];
	}
	
	private static ArrayJava.Colors[][][] copyArray(ArrayJava.Colors[][][] cube){
		ArrayJava.Colors[][][] ret = new ArrayJava.Colors[6][3][3];
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