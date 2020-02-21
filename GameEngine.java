/* GameEngine is designed for time control and display 
 * make connection between APR & CA & GE by initializing a CA (CellularAutomata scene)
 */
import java.util.Scanner;
import java.lang.ProcessBuilder;//used for clearing screen

public class GameEngine{
 
    private double generationSpeed;//can be set by users
    private CellularAutomata scene;
 
    private double frameCut;

    private int generations;
   
    
    public GameEngine(){//initialize gameEngine
        // initialize scene, set the board size as 39 x 39
        scene = new CellularAutomata(39);
        // initialize cGrid and set all values as "false"
        scene.init();

        //enable to input the generation speed
        Scanner input2 = new Scanner(System.in);
        System.out.print("Input generation speed: ");
        generationSpeed = input2.nextDouble();
        
        //set framecut as "How many frames per second"
        //because originally it's "How many frames per milli second" 
        frameCut = 1000.0 / generationSpeed;
        
        //give value to generations
        generations = 1;
    }
    
    //same as the feature get()
    //work flow: put() in APR -> ArrayPatternResources.set() in CA -> CellularAutomata.get() in GE -> GameEngine.get().set() in GD
    public CellularAutomata getScene() {
        return scene;
    }

    //run() method is a timer because we need to determine how long it takes to refresh the display
    public void run(){

        while(true){
            
            try
            {
                //sleep thread: have a break (break time can be set) after every execution
                Thread.sleep((long)(frameCut / 1000000.0));
            }
            catch(Exception ex) {}

            //invoke update() method 
            scene.update();
            generations++;

            // clear screen (only works in Windows)
            // unless the results will be shown next by next
            try {
                // method is used for clearing screen
                //reference: https://stackoverflow.com/questions/2979383/java-clear-the-console
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }
            catch (Exception ex) {}
            
            //invoke the print() method
            //reference: CellularAutomata.java line 95
            scene.print();  

           
        }
    }
}


