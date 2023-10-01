package arrays;

import java.util.Scanner;

public class ReverseOfAnArrya {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of arrays");
		int t =sc.nextInt();
		System.out.println("Enter the size of array");
		int n =sc.nextInt();
		int arr[][] = new int[t][n];
		for(int i=0;i<t;i++) {			
		    for(int j=0;j<n;j++) {
		    	arr[i][j]=sc.nextInt();
		    }
		}
		sc.close();
		for(int i=0;i<t;i++) {			
		    for(int j=n-1;j>=0;j--) {
		    	System.out.print(arr[i][j]+" ");
		    }
		    System.out.println();
		}

	}

}
