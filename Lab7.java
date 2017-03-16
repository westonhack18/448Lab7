//Weston hack
//EECS 448
//Lab 7
//March 16, 2017
//Main class


import java.io.FileReader;
import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Lab7 {


    //Main class
    public static void main(String[] args) {
    
        //If not enough arguments are given as input
        if (args.length < 3) {
            System.out.println("Error - Expected usage: ./main input.txt output.txt");
            return;
        
        }
        
        //Get input and output file names
        String inputFile = args[0];
        String outputFile = args[1];
        
        FileReader fileRead = null;
        BufferedReader bufReader = null;
        FileWriter fileWrite = null;
        BufferedWriter bufWriter = null;
        
        int size = 0;
        double det = 0;
        double inv = 0
        
        
        
        
        
    
    }


}
