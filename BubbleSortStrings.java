import java.util.Scanner;
public class BubbleSortStrings {
	public static void main(String[] args) {
		//String str[] = {"Raj", "Mike", "Brock", "Steve"};
		String temp;
		int k, num;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter # of elements: ");
		//num = sc.nextInt();
		num = Integer.parseInt(sc.nextLine()); //For string
		
		String[] str = new String[num]; 
		
		//System.out.println("Enter the " + num + " elements: ");
		for(k=0; k<str.length; k++) {
			str[k] = sc.nextLine();
		}
		
		System.out.println("Strings in sorted order: ");
		for (int j=0; j<str.length; j++) {
			for(int i=j+1; i<str.length; i++) {
				//comparing adjacent strings
				if (str[i].compareTo(str[j]) < 0) {
					temp = str[j];
					str[j] = str[i];
					str[i] = temp;
				}
			}
			System.out.println(str[j]);
		}
	}
}