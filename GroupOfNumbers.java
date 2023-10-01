package arrays;

import java.util.Scanner;

public class GroupOfNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();
		int arr[] = new int[N];
		for(int i=0;i<N;i++) {
			arr[i] = sc.nextInt();
		}
		sc.close();
		System.out.println(MaxSize(K));
	}

	private static int MaxSize(int k) {
		// TODO Auto-generated method stub
		
		return 0;
	}	

}
