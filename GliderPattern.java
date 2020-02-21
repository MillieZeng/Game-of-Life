/*
 *child class GliderPattern
 *reference:pattern file on blackboard
 *convert ' ' to false, and '*' to true
 *enable to be invoked by initializing the father class
 */

public class GliderPattern extends ArrayPatternResources {
    private boolean [][] Glider;   
    
    public GliderPattern() {
        // Load this 2D array as a resource into the father class
        super(new boolean [][] {{false,true,false},
				                {false,true,true},
				                {true,false,true}}); 
    
    }
}
