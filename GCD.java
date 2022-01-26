import java.util.Scanner;
class GCD{
    static int gcd(int a, int b) {
        if(a==0) 
            return b;
        return gcd(b%a, a);
    }
    static int findGCD(int arr[], int n) {
        int result = arr[0];
        for(int i=1; i<n; i++) {
            result = arr[0];
            for(i=1; i<n; i++) {
                result = gcd(arr[i], result);
            }
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[], n;
        n = sc.nextInt();
        arr = new int[n];

        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
            n = arr.length/arr[0];
        System.out.println("GCD: " + findGCD(arr, n));
    }
}