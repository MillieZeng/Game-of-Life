/*
 *child class BlockPattern
 *reference:pattern file on blackboard
 *convert ' ' to false, and '*' to true
 *enable to be invoked by initializing the father class
 */

public class BlockPattern extends ArrayPatternResources {
    private boolean [][] Block;   
    
    public BlockPattern() {
        // Load this 2D array as a resource into the father class
        super(new boolean [][] {{true,true},
				                {true,true}}); 
    
    }
}

