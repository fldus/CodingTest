import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		
		int[] num_list = new int[num1];
		for(int i=0; i<num1; i++)	 num_list[i]= sc.nextInt();
		
		int num2 = sc.nextInt();
		int sum=0;
		for(int i=0; i<num1; i++)
			if(num2 == num_list[i]) sum++;
		
		System.out.println(sum);
			
		
	}// main
}