import java.util.Scanner;
class ArrayAddition1 {
    public static void ArraySum(int arr[], int n) {
        int temp, rem, sum=0;
        
        for(int i=0; i<n; i++) {
            temp = arr[i];
            while(temp != 0) {
                rem = temp%10;
                sum = sum+rem;
                temp = temp/10;           
            }
            System.out.print(sum+" ");
            sum = 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,arr[];
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }
        ArraySum(arr, n);
    }
}