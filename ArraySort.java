import java.util.Scanner;
public class ArraySort {
	public static void main(String[] args) {
		int count, temp;
		
		//User inputs in array size
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter # of elements you want in array: ");
		count = scan.nextInt();
		
		int num[] = new int[count];
		System.out.println("Enter array elements: ");
		
		for (int i=0; i<count; i++) {
			num[i] = scan.nextInt();
		}
		scan.close();
		
		for(int i=0; i<count; i++) {
			for(int j=i; j<count; j++) {
				if (num[i] > num[j]) {
					temp = num[i];
					num[i] = num[j];
					num[j] = temp;
				}
			}
		}
		System.out.println("Array in Ascendimg order: ");
		for(int i=0; i<count-1; i++) {
			System.out.print(num[i] + ", ");
		}
		System.out.print(num[count-1]);
	}
}