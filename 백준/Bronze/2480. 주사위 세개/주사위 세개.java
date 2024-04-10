import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = a;	// 주사위 눈 다 다를 때 비교
		
		if(a == b) {
			if(b == c) System.out.println(10000 + (a*1000));
			else System.out.println(1000 + (a*100));
		}else if(a == c || b == c) System.out.println(1000 + c*100);
		else {
			if(max < b) max = b;
			if(max < c) max = c;
			System.out.println(max*100);
		}
		
	}// main
}