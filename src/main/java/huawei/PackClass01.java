package huawei;

public class PackClass01 {
    public static void main(String[] args) {
        Integer x1 = 1;
        Integer x2 = 1;
        Integer x3 = new Integer(1);
        Integer x4 = new Integer(x1);
        System.out.println(x1 == x2);
        System.out.println(x1 == x3);
        System.out.println(x3 == x4);
        System.out.println(x1.equals(x4));
        System.out.println(x1 == x4);
        System.out.println(x4 == 1);
    }
}
