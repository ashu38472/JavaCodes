package arrays;

import java.util.Scanner;

public class ArrayMultplication {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter rows of first matrix");
		int rows1 = sc.nextInt();
		
		System.out.println("Enter columns of first matrix");
		int cols1 = sc.nextInt();
		
		System.out.println("Enter rows of second matrix");
		int rows2 = sc.nextInt();
		
		System.out.println("Enter columns of second matrix");
		int cols2 = sc.nextInt();
		
		if(cols1 != rows2) {
			System.out.println("Matrixs can not be multiplied");
		}
		else {
			int a[][] = new int[rows1][cols1];
			int b[][] = new int[rows2][cols2];
			int sum = 0;
			int k;
			System.out.println("Enter the elements of first matrix");
			for(int i=0;i<rows1;i++) {
				for(int j=0;j<cols1;j++) {
					a[i][j] = sc.nextInt();
				}
			}	
			System.out.println("Enter the elements of second matrix");
			for(int i=0;i<rows2;i++) {
				for(int j=0;j<cols2;j++) {
					b[i][j] = sc.nextInt();
				}
			}
			sc.close();
			int c[][] = new int[rows1][cols2]; 
			for(int i=0;i<rows1;i++) {
				for( k=0;k<cols2;k++) {
					for(int j=0;j<rows2;j++) {
						sum += a[i][j]*b[j][i];
					}
				c[i][k]=sum;
				sum =0;
				}
			}
			System.out.println("Product of both matrix :");
			for(int i=0;i<rows1;i++) {
				for(int j=0;j<cols2;j++) {
					System.out.print(c[i][j]+" ");
					}
			System.out.println(" ");
			}
		}		
	}

}
