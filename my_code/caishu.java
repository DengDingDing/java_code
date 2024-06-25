import java.util.Random;
import java.util.Scanner;

public class caishu {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100);

        int input = -1;
        int count = 0;
        Scanner scanner = new Scanner(System.in);
        while (input != randomNumber) {
            System.out.println("输入一个数字");
            input = scanner.nextInt();
            if (input > randomNumber) {
                System.out.println("大了");
                count++;
            } else if (input < randomNumber) {
                System.out.println("小了");
                count++;

            } else {
                System.out.println("猜对了");
                count++;
                System.out.println("你一共猜了" + count + "次");
            }

        }
        if (count == 1) {
            System.out.println("你太聪明了");
        } else if (count < 5) {
            System.out.println("不错不错，再接再厉");

        } else {
            System.out.println("要努力了");
        }

    }
}
