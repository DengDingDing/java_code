import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class J304 {
    public static void main(String[] arg) throws IOException{
        int x;
        String str;
        BufferedReader buf;
        buf = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("请输入一个数：");
        str = buf.readLine();
        x = Integer.parseInt(str);
        System.out.println("x的平方根为：" + Math.sqrt(x));
    }
}