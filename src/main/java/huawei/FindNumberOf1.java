package huawei;

import java.util.Scanner;

/**
查找输入整数二进制中1的个数
*/
public class FindNumberOf1 {
    public static void main(String[] args) {
        // System.out.println("Test");
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()) {
            int a = scan.nextInt();
            System.out.println(findNumberOf1(a));
        }
    }

    public static int findNumberOf1(int num) {
        int counter = 0;
        String aString = Integer.toBinaryString(num); //转为二进制字符串
        for (int i = 0; i < aString.length(); i++) {
            if(aString.charAt(i) == '1') {
                counter++;
            }
        }
        return counter;
    }
}
