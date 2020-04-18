package rejimboga;

import java.util.*;

public class rejimboga {
    static void doJob(int x) {
        x = x + 60;
    }
    static void doJob(int [] a) {
        a[0] = 777;
    }
    public static void main(String[] args){
        int x = 1;
        System.out.println("x1 =" +x);
        doJob(x);
        System.out.println("x2 =" +x);

        int[] a = new int[] {1, 2, 3};
        doJob(a);
        System.out.println(Arrays.toString(a));
    }
}