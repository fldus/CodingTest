import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int won = sc.nextInt();	// 영수증
		int n = sc.nextInt();
		int sum=0;	// 구매 합
		
		for(int i=0; i<n ;i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			sum += a*b;
		}
		
		if (won == sum) System.out.println("Yes");
		else System.out.println("No");
		
	}// main
}