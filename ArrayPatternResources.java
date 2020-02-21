/*
 *father class of patterns
 *designed for choosing different pattern
 *users input a pattern (boolean[][]input), and the pattern will be copied as boolean[][]resources
 *and then will be put in a 2D array - boolean [][] cGrid
 *location can be set with r and c
 */

public class ArrayPatternResources {
	// father of the children
	private boolean [][] resources;
	
    public ArrayPatternResources(boolean [][] input) {
		// copy input as resources 
		// enable to choose the pattern
		resources = input;
    }
	  
	// put boolean[][]resources into boolean[][]cGrid
	// starts at (15,15) of cGrid[][] to avoid touching edges early
	// boolean[][]cGrid hasn't been created or declared in this class, so we need to invoke this put() method in a class which containing the initialized cGrid
    public void put(boolean[][] cGrid){
		int r = 15;
		int c = 15;
		int resourcesRow = 0;
		int resourcesCol;
		
		for(int i= r-1; i < ((r-1)+resources.length); i++){
			resourcesCol = 0;
			for(int j =c-1; j < ((c-1)+resources[resourcesRow].length); j++){
				cGrid[i][j] = resources[resourcesRow][resourcesCol++];
			}
			resourcesRow++;
		}

	}
}

