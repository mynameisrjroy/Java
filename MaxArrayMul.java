import java.util.Scanner;

class MaxArrayMul {
	public static void main(String [] args) {
		int num, i, j, temp, mul =1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter # of integers to sort: ");
		num = sc.nextInt();
		
		int array[] = new int[num];
		System.out.println("Enter " + num + " integers: ");
		
		for(i = 0; i<num; i++) 
			array[i] = sc.nextInt();
			
		for(i = 0; i<(num-1); i++) {
			for(j = 0; j<num - i - 1; j++) {
				if (array[j] < array[j+1]) {
					temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
		
		/* System.out.println("Sorted list of integers: ");
		
		for(i=0; i<num; i++)
			System.out.println(array[i]); */
		
		
		for(i=0; i<4; i++)
			mul = mul * array[i];
			System.out.println("Max Array Multiplication is:" + mul);
	}
}