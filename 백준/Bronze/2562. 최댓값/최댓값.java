import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max=0, index=1;
		
		for(int i=0; i<9; i++) {
			int num = sc.nextInt();
			if(i == 0) max = num;
			if(max < num) {
				max = num;
				index = i+1;
			}
		}
		
		System.out.println(max + "\n" + index);
		
	}// main
}