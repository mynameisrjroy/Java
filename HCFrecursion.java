import java.util.Scanner;
class HCFrecursion {
    public static int hcf(int n1, int n2) {
        if(n2!=0)
            return hcf(n2, n1%n2);
        else
            return n1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int hcf = hcf(n1, n2);

        System.out.println(hcf);
    }
}