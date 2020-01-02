package huawei;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String str1 = str.substring(0, str.length() - 1);
        String str2 = str.substring(str.length() - 1);
        String[] reverse = str1.split(" ");
        System.out.print(str2);
        for (int i = reverse.length - 1; i >= 0; i--) {
            System.out.print(reverse[i] + " ");
        }
    }
}
