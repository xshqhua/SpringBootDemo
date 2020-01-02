package huawei;

import java.util.Scanner;
/**
  正整数A和正整数B 的最小公倍数是指 能被A和B整除的最小的正整数值，
  设计一个算法，求输入A和B的最小公倍数。
*/
public class Minimum {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int min = Math.min(n, m);
            int max = Math.max(n, m);
            for (int i = 1; i <= min; i++) {
                if(max * i % min == 0) {
                    System.out.println(max * i);
                    break;
                }
            }
        }
    }
}
