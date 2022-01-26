import java.util.Scanner;
class HCFmultipleRecursion {
    static int calculateHCF(int a, int b) {
        if(a==0)
            return b;
        return calculateHCF(b%a, a);
    }
    public static int calculateGeneralHCF(int[] arr, int len) {
        if(len == 1) 
            return arr[0];
        return calculateHCF(calculateGeneralHCF(arr, len-1), arr[len-1]);
    }
    public static void main(String[] args) {
        int arr[];
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        arr = new int[len];
        int hcf = calculateGeneralHCF(arr, arr.length);

        for(int i=0; i<len; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("HCF: "+hcf);
    }
}