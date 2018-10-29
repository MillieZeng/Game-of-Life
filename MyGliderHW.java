/*
 * a class for working with Gliders
 * Spring 2017 update
 * 
 */

 public class MyGliderHW
 {
	//members 
	private char[][] gameBoard;
 	private char[][] glider = {{' ','*',' '},
 							   {' ','*','*'},
 							   {'*',' ','*'}
 							  };
	/* constructor */
 	public MyGliderHW()
 	{
		//assume gameboard is 10 x 10
		gameBoard = new char[10][10];
	}

	/*
	 * prints a glider
	 */
	private void printGlider()
	{
		for(int i = 0; i < glider.length; i++)
		{
			for(int j = 0; j < glider[i].length; j++)
			{
				System.out.print(glider[i][j]);
			}
			System.out.println();
		}
	}

	/*
	 * put a glider into the gameboard starting at row r
	 * column c
	 * Note: There is no error checking for edges!!!
	 */

	public void putGlider(int r, int c)
	{
		System.out.println("Putting glider at: "+r+","+c);
		int gliderRow = 0;
		int gliderCol;
		for(int i= r-1; i < ((r-1)+glider.length); i++)
		{
			gliderCol = 0;
			for(int j =c-1; j < ((c-1)+glider.length); j++)
			{
				gameBoard[i][j] = glider[gliderRow][gliderCol++];
			}
			//advance to next row in glider matrix
			gliderRow++;
		}
		//print the board
		printBoard();
		
		//TODO : Count the neighbors 
		
	}

	/*
	 * print the game board
	 */
	public void printBoard()
	{
		System.out.println("Printing the game board");

		for(int i =0; i < gameBoard.length; i++)
		{
			for(int j = 0; j< gameBoard[i].length; j++)
			{
				System.out.print(gameBoard[i][j]);
			}
			System.out.println();
		}
	}
	
	/*
	 * count the neighbors 
	 * no error checking 
	 */
	 
	 private int countNeighbors(int r, int c) 
	 { 
		int count = 0; 
		//TODO: implement this method
		char ch = gameBoard[x][y];

		for (int x = r - 1; x < r + 2; x++) {
			for (int y = c - 1; y < c + 2; y++){
				c++;
				if (x > 0 && x < gameBoard.length && x != r && y > 0 && y < gameBoard[0].length && y != c){
					System.out.println("(" + x + "," + y + ")");
				}
				count++;	
			}
			r++;
			x = 0;	
        }
		return count; 
	 }

	

 } ///~