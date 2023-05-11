package string;

import java.util.Scanner;

public class MoreOptimizedAnagramCode {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter two string to chack they are anagram or not");
		
		String a = sc.nextLine();
		String b = sc.nextLine();	
		
		boolean isAnagram = true;
		
		int al[] = new int[256];
		
		for(char c: a.toCharArray()) {
			int index = (int) c;
			al[index]++;			
		}
		for(char c: b.toCharArray()) {
			int index = (int) c;
			al[index]--;			
		}
		for(int i=0;i<256;i++) {
			if(al[i]!=0) {
				isAnagram=false;
				break;
			}
		}
		if(isAnagram) {
			System.out.println("The string is anagram");
		}else {
			System.out.println("The string is not anagram");
		}

	}

}
