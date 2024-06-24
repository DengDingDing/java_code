public class j207 {
    public static void main(String arg[]) {
        int a = 12, b = -23, c = 34;
        int max, min, t;
        // ���������е����ֵ
        t = a > b ? a : b;
        max = t > c ? t : c;
        // ������������Сֵ
        t = a < b ? a : b;
        min = t < c ? t : c;
        // ��ʾ���
        System.out.println("max=" + max);
        System.out.println("min=" + min);
    }
}
