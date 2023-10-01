package arrays;

import java.util.Scanner;

public class Max_sum_in_next_three_elements {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements :");
		int n=sc.nextInt();
		int a[] = new int[n];
		System.out.println("Enter array elements");
		for(int i=0;i<n;i++)
			a[i]=sc.nextInt();
		sc.close();
		int sum=0,count=0,max=a[0];
		for(int i=0;i<n;i++) {
			count++;
			sum+=a[i];
			if(count==3) {
				if(max<sum)
					max=sum;
				sum=0;
				count=0;
				i-=2;
			}
		}
		System.out.println(max);

	}

	
}
