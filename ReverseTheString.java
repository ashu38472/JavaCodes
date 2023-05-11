package string;

public class ReverseTheString {

	public static void main(String[] args) {
		String a = "I love java , the coffee";
		String split[] = a.split(" ");
		System.out.println(split.length);
		int n = split.length;
		String r[] = new String[n] ;
		for(int i=0;i<n;i++) {
			 r[i] = split[n-i-1];
		}		
		for(String x: r) {
			System.out.print(x+" ");
		}

	}

}
