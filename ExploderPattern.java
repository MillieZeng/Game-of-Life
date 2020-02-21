/*
 *child class ExploderPattern
 *reference:pattern file on blackboard
 *convert ' ' to false, and '*' to true
 *enable to be invoked by initializing the father class
 */

public class ExploderPattern extends ArrayPatternResources {
    private boolean [][] Exploder; 
    
    public ExploderPattern() {
        // Load this 2D array as a resource into the father class
        super(new boolean [][] {{false,true,false},
			                    {true,true,true},
			                    {true,false,true},
			                    {false,true,false}}); 
    
    }
}

