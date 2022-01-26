import java.util.Scanner;
class ArrayElemination {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[], i, j, k, arrSize;
        arrSize = sc.nextInt();
        arr = new int[arrSize];

        for(i=0; i<arrSize; i++) 
            arr[i] = sc.nextInt();

        for(i=0; i<arrSize; i++) {
            for(j=i+1; j<arrSize;) {
                if(arr[j] == arr[i]) {
                    for(k=j; k<arrSize; k++) {
                        arr[k] = arr[k+1];
                        arrSize--;
                    }
                }
                else {
                    j++;
                }
            }
        }
        for(i=0; i<arrSize; i++) {
            System.out.print(arr[i]);
        }
    }
}