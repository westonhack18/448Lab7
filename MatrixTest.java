//Weston Hack
//EECS 448
//Lab 7
//March 16, 2017
//MatrixTest.java

import static org.junit.Assert.*;
import org.junit.Test;

public class MatrixTest {
	
	@Test
	public void testGetDeterminant() {
		//Create 2d array of values to be stored in matrix
		int[][] matrix = new int[3][3];
		
		//insert values into array
		matrix[0][0] = 7;
		matrix[0][1] = 3;
		matrix[0][2] = 1;
		matrix[1][0] = 4;
		matrix[1][1] = 9;
		matrix[1][2] = 6;
		matrix[2][0] = 11;
		matrix[2][1] = 2;
		matrix[2][2] = 7;
		
		Matrix m = new Matrix(3, matrix);
		
		//test if determinant = 152
		assertEquals(152, m.determinant(), 0.001);
		
	}
	
	@Test
	public void testGetInverse() {
		//Create 2d array of values to be stored in matrix
		int[][] matrix = new int[2][2];
		double[][] matrixInv = new double[2][2];
		
		//insert values into array
		matrix[0][0] = 7;
		matrix[0][1] = 2;
		matrix[1][0] = 1;
		matrix[1][1] = 2;
		
		//fill in values of inverse matrix
		matrixInv[0][0] = (1/6);
		matrixInv[0][1] = (-1/6);
		matrixInv[1][0] = (-1/12);
		matrixInv[1][1] = (7/12);
		
		//Create new matrix and get its inverse
		Matrix m = new Matrix(2, matrix);
		Matrix mInv = m.getInverse();
		
		//Test each element
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				assertEquals(matrixInv[i][j], mInv.mdata[i][j], 0.001);
			}
			
		}
		
		
	}
	
	@Test
	public void testGetSubMatrix() {
		//Create 2d array of values to be stored in matrix
		int[][] matrix = new int[3][3];
		int[][] subMatrix = new int[2][2];
		
		//Insert values into array
		matrix[0][0] = 7;
		matrix[0][1] = 3;
		matrix[0][2] = 1;
		matrix[1][0] = 4;
		matrix[1][1] = 9;
		matrix[1][2] = 6;
		matrix[2][0] = 11;
		matrix[2][1] = 2;
		matrix[2][2] = 7;
		
		//Insert corresponding values into 2x2 submatrix
		subMatrix[0][0] = 9;
		subMatrix[0][1] = 6;
		subMatrix[1][0] = 2;
		subMatrix[1][1] = 7;
		
		//Create new matrix and get its submatrix
		Matrix m = new Matrix(3, matrix);
		Matrix mSub = m.getSubMatrix(0,0);
		
		//check values
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0;  j < matrix[i].length; j++) {
				assertEquals(subMatrix[i][j], mSub.mdata[i][j], 0.001);
			}
			
		}
		
	}
	
	
	
}