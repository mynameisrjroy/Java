import java.util.Scanner;
class Factorial {
	public static void main(String[] args) {
		int i, f=0, a;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		a = sc.nextInt();
		
		for(i=0; i<a; i++) {
			f = f + (a*a-1);
		}
		
		System.out.println("Factorial: "+f);
	}
}