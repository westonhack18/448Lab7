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
    
    //Method that returns the determinant of the matrix
    public double determinant() {
    
        double det = 0.0;
        
        if (size == 1) {
            det = mdata[0][0];
        
        }
        else if (size == 2) {
            det = mdata[0][0] * mdata[1][1] - mdata[0][1] * mdata[1][0];
        
        }
        else {
            for (int i = 0; i < size; i++) {
                det += Math.pow(-1.0, (double)i) * mdata[0][i] * getSubMatrix(0,i).determinant();
            }
        
        }
        
        return det;
        



}


//Method that returns a specified sub matrix
public Matrix getSubMatrix(int r, int c) {
    //Initialize submatrix
    Matrix sub = new Matrix(size - 1);

    //Keep track of row in submatrix
    int row = 0;
    for (int i = 0; i < size; i++) {
        if (i == r) continue;
        
        //Keep track of column in submatrix
        int col = 0;
        for (int j = 0; j < size; j++) {
            if (j == c) continue;
            
            //If you are in correct row and column, copy data from matrix into new submatrix
            sub.mdata[row][col] = mdata[i][j];
            col++;
        
        }
        row++;
    
    }
    
    return sub;

}



