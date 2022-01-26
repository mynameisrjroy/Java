import java.util.Scanner;
class Leapyear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int year = sc.nextInt();
        boolean leap = false;

        if(year%4 == 0) {
            if(year%100 == 0) {
                if(year%400 == 0) {
                    leap = true;
                }
                else
                    leap = false;
            }
            else {
                leap = false;
            }
        }
        else {
            leap = false;
        }
        if (leap) {
            System.out.println("Leap year");
        }
        else {
            System.out.println("Not leap");
        }
    }
}