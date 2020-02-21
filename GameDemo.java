/*
 *GameDemo is for demostration
 *containing main method
 *invoking methods from other classes in order
 */

import java.util.Scanner;

public class GameDemo{

    public static String title = "Game Of Life";

    //main method, invoke start()
    public static void main(String[] args){
        
        System.out.println(title);
        
        //initialize GameEngine
        GameEngine gol = new GameEngine();

        //enable to input the pattern
        Scanner input1 = new Scanner(System.in);
        System.out.print("Choose a pattern (1.Blinker 2.Block 3.Exploder 4.Glider): ");
        int input = input1.nextInt();
        System.out.println("################################################");//decoration
        ArrayPatternResources pattern;//initialize ArrayPatternResources
        if(input == 1){ //if users choose 1.Blinker, then invoke BlinkerPattern
            pattern = new BlinkerPattern();//invoke BlinkerPattern 
        }else if(input == 2){
            pattern = new BlockPattern();//initialize pattern
        }else if(input == 3){
            pattern = new ExploderPattern();//initialize pattern
        }else{
            pattern = new GliderPattern();//initialize pattern
        }
        gol.getScene().setPattern(pattern);
         
        
        gol.run();
        System.out.println("################################################");//decoration
    }
}
    