package rejimboga;

import java.util.*;

public class rejimboga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Перше число:");
        int s1 = sc.nextInt();

        System.out.print("Друге число:");
        int s2 = sc.nextInt();

        System.out.print("Третє число:");
        int s3 = sc.nextInt();

        System.out.print("Четверте число:");
        int s4 = sc.nextInt();

        int max = s1;

        if(s2 > max) max = s2;
        if(s3 > max) max = s3;
        if(s4 > max) max = s4;
        System.out.println("Найбільше число:" + max);
    }
}