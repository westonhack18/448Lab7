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
        double inv = 0;
        
        
        try {
            //Initialize file IO
            fileRead = new FileReader(inputFile);
            bufReader = new BufferedReader(fileRead);
            fileWrite = new FileWriter(outputFile);
            bufWriter = new BufferedWriter(fileWrite);
            String line = "";
            
            //Read in size of string
            String m = bufReader.readLine();
            
            while (m != null) {
                size = Integer.parseInt(m);
                
                //Initialize 
                String[] strArr = new String[size];
                int[][] arr = new int[size][size];
                
                for (int i = 0; i < size; i++) {
                    //Read in first row of matrix
                    line = bufReader.readLine();
                    
                    //Split line into array of only values
                    strArr = line.split(" ");
                    
                    //Store row in matrix
                    for (int j = 0; j < size; j++) {
                        arr[i][j] = Integer.parseInt(strArr[j]);
                    
                    }
                
                }
                
                
            
            }
        
        
        }
        
        
        
        
        
    
    }


}
