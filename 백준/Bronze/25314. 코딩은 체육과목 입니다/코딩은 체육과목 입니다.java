import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int l = n/4;	// long
		
		if(n%4 != 0) l++;
		
		for(int i=0; i < l; i++)
			System.out.print("long ");
		
		System.out.print("int");
		
	}// main
}