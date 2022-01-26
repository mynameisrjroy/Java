/*create a class. 
- user input elements
- Scanner obj to store data in varible
- create array
- insert values in array via loop
- declare int variable for first, last and mid postions and the item to search.
- ask user for item element for search.  
- condition to check if item == mid
- if true, then return mid.
- if false, check if it is > or < than mid and proceed. */
 
import java.util.Scanner;
class BinarySearch01 {
	public static void main(String[] args) {
		int i, first=0, last, mid, item, num,arr[], flag=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the # of elements: ");
		num = sc.nextInt();
		
		arr = new int[num];
		
		System.out.println("Enter the "+num+" elements: "); 
		for(i=0; i<num; i++) {
			arr[i] = sc.nextInt();
		}
		
		last = num-1;
		//mid = (first+last)/2;
		
		System.out.println("Enter the item for search: ");
		item = sc.nextInt();	
		
		while(first<=last) {
			mid = (first+last)/2;
			
			if(item==arr[mid]) {
				System.out.println("Item "+item+" found at "+(mid+1));
				flag=1;
				break;
			}
			else if(item<arr[mid])
				last = mid-1;
			else 
				first = mid+1;
		}
		if(flag==0) {
			System.out.println(item+" not found");
		}
	}
}