/*
 *class of CellularAutomata
 *designed for rules of game of life
 *after updating the status, print all the members
 *print false as ' ', print true as '*'
 */

public class CellularAutomata {
    private int boardSize;
    private boolean[][] cGrid;
    private boolean[][] pGrid;

    public CellularAutomata(int boardSize) {
        //initialize boardSize, cGrid, pGrid
        this.boardSize = boardSize;//size of board
        //current status; boolean only has true or false
        cGrid = new boolean[boardSize][boardSize];
        //previous status
        pGrid = new boolean[boardSize][boardSize];
    }

    public void init() {
        // initialize cGrid
        // set all members in boolean[][]cGrid as false
        for(int i = 0; i < cGrid.length; i++){
			for(int j = 0; j < cGrid[i].length; j++){
                cGrid[i][j] = false;
            }
        }
    }

    // load resource here and enable resource to run the rules of game of life 
    // same as the feature of set() 
    // creating set() here is because we creating and initializing cGrid in this class
    public void setPattern(ArrayPatternResources resource) {
        // invoke put() method
        // reference: ArrayPatternResources.java line 22
        resource.put(cGrid);
    }

    //update() is to update the value of cGrid (current status)
    //save the status of pGrid <- cGrid; 
    //then the cGrid values are updated in turn according to the pGrid status and the rules of game of life
    public void update() {
        //initially, use pGrid (previous status) to save cGrid(current status)
        //unless the status won't update
        for(int i = 0; i < pGrid.length; i++)
            for(int j = 0; j < pGrid[i].length; j++){
                pGrid[i][j] = cGrid[i][j];
            }

        //this for loop is a traversal & same as countNeighbors in our HW
        for(int y = 0; y < pGrid.length; y++){
            for(int x = 0; x < pGrid[y].length; x++){
                //res is the abbreviation of result
                //same as count in our HW
                int res = 0;
                //xx0,yy0,xx1,yy1 are describing the neighbors of (x,y)
                int xx0 = x - 1;
                int yy0 = y - 1;
                int xx1 = x + 1;
                int yy1 = y + 1;

                //let's start counting
                //count all the nodes around (x,y)
                if(x != 0)//check edges: if x=0, there's no (xx0,y)
                    //check if pGrid[xx0][y] is true or not;
                    //if it's true, count 1 as result
                    res += pGrid[xx0][y] ? 1 : 0;
                if(y != 0)
                    res += pGrid[x][yy0] ? 1 : 0;
                if(x != pGrid[y].length - 1)
                    res += pGrid[xx1][y] ? 1 : 0;
                if(y != pGrid.length - 1)
                    res += pGrid[x][yy1] ? 1 : 0;
                if(x != 0 && y != 0)
                    res += pGrid[xx0][yy0] ? 1 : 0;
                if(x != 0 && y != pGrid.length - 1)
                    res += pGrid[xx0][yy1] ? 1 : 0;
                if(x != pGrid[y].length - 1 && y != 0)
                    res += pGrid[xx1][yy0] ? 1 : 0;
                if(x != pGrid[y].length - 1 && y != pGrid.length - 1)
                    res += pGrid[xx1][yy1] ? 1 : 0;
                
                // the rules of game of life 
                if(!(pGrid[x][y] && (res == 3 || res == 2)))
                    cGrid[x][y] = false;
                if(!pGrid[x][y] && res == 3)
                    cGrid[x][y] = true;
                
            }
        }
    }

    public void print() {
        //print all the members of boolean[][]cGrid
        for(int i = 0; i < cGrid.length; i++){
			for(int j = 0; j < cGrid[i].length; j++){
                if (cGrid[i][j])//if (i,j) = true, print '*'
                    System.out.print('*');
                else
                    System.out.print(' ');//if (i,j) != true, print ' '
			}
				System.out.println();
		}
    }
}

