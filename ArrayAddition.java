import java.util.Scanner;
class ArrayAddition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,arr[], temp, rem, sum=0;
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = sc.nextInt();
        }

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
}