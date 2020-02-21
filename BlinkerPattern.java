/*
 *child class BlinkerPattern
 *reference:pattern file on blackboard
 *convert ' ' to false, and '*' to true
 *enable to be invoked by initializing the father class
 */

public class BlinkerPattern extends ArrayPatternResources {
    private boolean [][] Blinker;
    
    public BlinkerPattern() {
        
        // Load this 2D array as a resource into the father class
        super(new boolean [][] {{false,false,false},
                                {true,true,true},
                                {false,false,false}}); 
    
    }
}


