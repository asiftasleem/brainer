/**
 * 
 */
package io.github.asiftasleem.brainer.arrays;

import java.util.Arrays;

/**
 * @author Muhammad Asif Tasleem (asiftasleem@gmail.com)
 *
 */
public class TwoDSpiral {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*
		[ 1,  2,  3,  4,  5,  6,  7,  8], 
		[28, 29, 30, 31, 32, 33, 34,  9], 
		[27, 48, 49, 50, 51, 52, 35, 10], 
		[26, 47, 60, 61, 62, 53, 36, 11], 
		[25, 46, 59, 64, 63, 54, 37, 12], 
		[24, 45, 58, 57, 56, 55, 38, 13], 
		[23, 44, 43, 42, 41, 40, 39, 14], 
		[22, 21, 20, 19, 18, 17, 16, 15]
		 */
				
		int[][] spiral = spiral(10);
		
		System.out.println(Arrays.deepToString(spiral));

	}
	
	
	public static int[][] spiral(int n){
		
		//First thing first, create a 2D array that is n x n
		int[][] spiral2D = new int[n][n];
		
		int index = 1;
		
		int x = 0;
		int y = 0;
		int total = n*n;
		
		int top = -1, left = -1, right = n, bottom = n;
		
		while(index <=total) {
			x = left+1;
			y = top+1;
			while(y < right) {
				spiral2D[x][y] = index++;
				y++;
			}
			y--;
			x++;
			while(x < bottom) {
				spiral2D[x][y] = index++;
				x++;
			}
			x--;
			y--;
			while(y > left ) {
				spiral2D[x][y] = index++;
				y--;
			}
			y++;
			x--;
			while(x > top + 1) {
				
				spiral2D[x][y] = index++;
				x--;
			}
			
			left++;
			top++;
			right--;
			bottom--;
		}
		
		
		return spiral2D;		
	}

}
