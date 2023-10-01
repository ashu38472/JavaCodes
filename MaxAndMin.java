package arrays;

import java.util.Scanner;

public class MaxAndMin {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the number of elements");
	    int n=sc.nextInt();
	    int[] a = new int[n];
		int max=0;
		int min=0;
		System.out.println("Enter elements");
		for(int i=0;i<n;i++){
		    a[i]=sc.nextInt();
		    if(i==0){
		        max=a[i];
		        min=a[i];
		    }else{
    		    if(a[i]>max){
    		        max=a[i];
    		    }
    		    if(a[i]<min){
    		        min=a[i];
    		    }
		    }
		}
		sc.close();
		System.out.println(max+" "+min);
	}

}
