package rejimboga;

import java.util.*;

public class rejimboga {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Перше число:");
        String s1 = sc.nextLine();
        int a = Integer.parseInt(s1);

        System.out.print("Друге число:");
        String s2 = sc.nextLine();
        int b = Integer.parseInt(s2);

        System.out.print("Третє число:");
        String s3 = sc.nextLine();
        int c = Integer.parseInt(s3);

        System.out.print("Четверте число:");
        String s4 = sc.nextLine();
        int d = Integer.parseInt(s4);

        if(a > b && a > c && a > d) {
            System.out.println("Найбільше число:" + s1);
        }
        if(b > a && b > c && b > d){
            System.out.println("Найбільше число:" + s2);
        }
        if(c > a && c > b && c > d){
            System.out.println("Найбільше число:" + s3);
        }
        if(d > a && d > b && d > c){
            System.out.println("Найбільше число:" + s4);
        }
    }
}