package advanced_03;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String line = sc.nextLine();
        String [] temp = line.split(",");
        int[] nums = new int[n];
        for(int i = 0;i<n;i++) {
            nums[i]=sc.nextInt();

        }
        String[] numStrs = new String[n];

        Arrays.sort(numStrs,
                (o1,o2)->(o1+o2).compareTo(o2+o1));
        StringBuilder sb = new StringBuilder();
        for(int i = n-1; i >= 0; -- i) {
            sb.append(numStrs[i]);
        }
        if(sb.charAt(0) == '0') System.out.println( "0");
        System.out.println(sb.toString());
    }
}
