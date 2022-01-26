import java.util.Scanner;
class MaxMinDif {
	public static void main(String[] args) {
		int a, b[], sum;
		Scanner sc = new Scanner(System.in);
		
		a = sc.nextInt();
		b = new int[a];
		
		for(int i=0; i<a; i++) {
			b[i] = sc.nextInt();
		}
		
		MaxMinDif mm = new MaxMinDif();
		sum = mm.findLargeSmallDifference(a, b);
		
		System.out.println(sum);
	}
	public int findLargeSmallDifference(int a, int b[]) {
		int sum=0, max=0, min=0;
		for(int j=0; j<a; j++) {
			if(b[j] > max) {
				max = b[j];
			}
		}
		min = max;
		for(int k=0; k<a; k++) {
			if(min > b[k]) {
				min = b[k];
			}
		}
		sum = (max-min);
		return sum;
	}
}