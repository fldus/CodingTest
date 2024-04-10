import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();	// 현재 시
		int m = sc.nextInt();	// 현재 분
		int t = sc.nextInt();	// 걸리는 시간
		int n = m+t;
		
		if(n < 60) {
			System.out.println(h+" "+n);
		}else {
			if(h+(n/60) > 23) h = (h+(n/60)) - 24;
			else h += n/60;
			System.out.println(h+" "+(n%60));	
		}
		
	}// main
}