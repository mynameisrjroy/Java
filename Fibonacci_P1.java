import java.util.Scanner;
class Fibonacci_P1 {
	public static void main(String[] args) {
		int num, num1=0, num2=1, num3;
		
		System.out.println("Enter the number of elements: ");
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		int i;
		for(i=0; i<num; i++) {
			System.out.print(num1+" ");
			num3 = num1+num2;
			num1 = num2;
			num2 = num3;
		}
	}
}