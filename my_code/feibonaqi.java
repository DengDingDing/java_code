public class feibonaqi{
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 0; i < 10; i++) {
            int temp = a;
            a = b;
            b = temp + b;
            System.out.println(b);
        }
    }
}