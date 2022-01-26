//Program to perform binary search on a list of integer numbers

//To search an element in given list of elements in an array

import java.util.Scanner;
class BinarySearch {
	public static void main(String[] args) {
		int counter, num, item, array[], first, last, middle;
		
		//To capture user input, we define Scanner object
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number of elements: ");
		num = input.nextInt();
		
		//creating array to store the element numbers
		array = new int[num];
		
		System.out.println("Enter the "+num+" integers: ");
		//Loop to store the numbers in array
		for(counter=0; counter<num; counter++)
			array[counter] = input.nextInt();
			
		System.out.println("Enter the value to search: ");
		item = input.nextInt();
		first = 0;
		last = num-1;
		middle = (first+last)/2;
		
		while(first <= last) {
			if(array[middle] < item) 
				first = middle+1;
			
			else if (array[middle] == item) {
				System.out.println(item+" found at location " + (middle+1) + ".");
				break;
			}
			else {
				last = middle-1;
			}
			middle = (first + last)/2;
		}
		if(first>last) 
			System.out.println(item+" is not found.\n");
	}
}