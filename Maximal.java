//Maximal product of four array inputs
//Array A[], N= int/float ranging 4 - 100000

import java.util.Scanner;
class Maximal {
	public static void main(String[] args) {
		int n, i, j;
		float temp, maxVal, A[];
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements in array: ");
		n = sc.nextInt();
		
		A = new float[n];
		
		System.out.println("Enter the "+n+" numbers:");
		for(i=0; i<n; i++) 
			A[i] = sc.nextFloat();
		
		if(n<4) {
			System.out.println("Invalid Input");
		}
		else {
			for(i=0; i<n; i++) {
				for(j=i+1; j<n; j++) {
					if(A[i] < A[j]) {
						temp = A[i];
						A[i] = A[j];
						A[j] = temp;
					}
				}
			System.out.print(A[i]+ " ");
			}
			maxVal = A[0]*A[1]*A[2]*A[3];
			System.out.print("Max mul val of four digits: "+ maxVal);
		}
	}
}