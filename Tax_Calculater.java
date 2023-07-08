package creative;

import java.util.*;

public class Tax_Calculater {

	public static void main(String[] args) {
		
		System.out.println("Tax Calculator App");
		System.out.println("-----WELCOME-----");
		
		try{
		
		Scanner sc =new Scanner(System.in);
		Scanner sc1 =new Scanner(System.in);
				
		System.out.println("Enter total person count:");
	        int totalPerson = sc.nextInt();
	    	    
		String[] names = new String[totalPerson];		
		long[] incomes = new long[totalPerson];
		
	    for(int i=1;i<=totalPerson;i++) 
			{
				System.out.println("Enter name "+ i+":");
				names[i-1] = sc1.nextLine();
				
				System.out.println("Enter "+names[i-1]+"'s Annual Income :");
				incomes[i-1] = sc.nextLong();
			}
	    
	    sc.close();
	    sc1.close();
		
		System.out.println("Payable taxe for");
		System.out.println("-----------------------");
		for(int i=0;i<totalPerson;i++) {
			calculatTax(names[i],incomes[i]);
		}
		
		}catch(InputMismatchException e) {
			System.out.println("Enter valid input");
		}finally {
			System.out.println();
			System.out.println("Tax is back bone of country");
		}

	}
	public static void calculatTax(String names, long incomes) {
		long tax = 0;
		if(incomes>=300000) {
			tax=incomes*20/100;
		}else if(incomes>=100000) {
			tax = incomes*10/100;			
		}else {
			tax = 0;
		}
		System.out.println(names+" : "+tax);
	}

}
