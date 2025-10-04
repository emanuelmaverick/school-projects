package Chapter2;

public class Unary3 {
    public static void main(String []args) {
        char ch = '7';
        System.out.println(ch + 1);
        System.out.println((char)(ch + 1));
        System.out.println(ch);
        System.out.println((char)(ch));
        System.out.println((int)(ch));
        System.out.println(ch - 1);
        System.out.println((int)(ch - '0'));
    }
}

