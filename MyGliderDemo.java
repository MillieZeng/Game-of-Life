//Create a class that creates an instance of MyGliderHW. 
//Implement the countNeighbors method in the MyGliderHW class

public class MyGliderDemo{
    public static void main(String[] args){
        MyGliderHW myGliderHW = new MyGliderHW();
        System.out.println(myGliderHW.countNeighbors(1,1));
        System.out.println(myGliderHW.countNeighbors(0,0));
        System.out.println(myGliderHW.countNeighbors(0,2));
    }
}
