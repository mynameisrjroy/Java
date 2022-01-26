import java.util.*;
import java.lang.*;
import java.io.*;
class ArraySearch {
    static int findIndex(int size, int [] list, int key) {
        for(int i=0; i<size; i++) {
            if(list[i]==key) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int size, key, list[];
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        key = sc.nextInt();
        list = new int[size];

        for(int i=0; i<size; i++) {
            list[i] = sc.nextInt();
        } 
        int result = findIndex(size,list, key);
        System.out.println(result);
    }
}