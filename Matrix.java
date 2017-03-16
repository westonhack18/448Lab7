//Weston Hack
//EECS 448
//Lab 7
//March 16, 2017
//Matrix.Java

import java.lang.Math.*;

public class Matrix {

    int size;
    double[][] mdata = null;
    
    
    //Constructor that reads in size of matrix and 2D array holding values of matrix
    public Matrix(int s, int[][] arr) {
        size = s;
        mdata = new double[size][size];
        
        //Store data from 2D array as doubles in matrix
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mdata[i][j] = (double)arr[i][j];
            
            }
        
        }
    
    
    }



}
