import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(100>= num && num >=90) System.out.println("A");
		else if(90> num && num >=80) System.out.println("B");
		else if(80> num && num >=70) System.out.println("C");
		else if(70> num && num >=60) System.out.println("D");
		else System.out.println("F");

	}

}