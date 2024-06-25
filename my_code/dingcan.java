import java.util.Scanner;

public class dingcan {
    public static int wait_() {
        System.out.println("输入0继续输入");
        Scanner input = new Scanner(System.in);
        int choose = input.nextInt();
        return choose;

    }

    public static void main(String[] args) {
        // 数据定义
        Scanner input = new Scanner(System.in);
        String[] dishNames = { "红烧带鱼", "鱼香肉丝", "时令蔬菜" };
        double[] price = { 38.0, 20.5, 15 };
        int[] praiseNums = new int[3];
        // 开始定义订单，订单长度为4
        String[] names = new String[4];
        int[] times = new int[4];
        String[] dishMsg = new String[4];
        String[] address = new String[4];
        double[] sumPrices = new double[4];
        int[] status = new int[4];
        int num = 2;

        // 给第一个订单赋值
        names[0] = "张三";
        dishMsg[0] = "红烧带鱼 2份";
        times[0] = 12;
        address[0] = "黄河路133号";
        sumPrices[0] = 76;
        status[0] = 0;// 0表示订单已经预订

        // 给第二个订单赋值
        names[1] = "李四";
        dishMsg[1] = "鱼香肉丝 1份";
        times[1] = 18;
        address[1] = "ssdut";
        sumPrices[1] = 25.5;
        status[1] = 1;// 1表示订单已经完成

        while (true) {
            // 开始界面
            System.out.println("********欢迎光临餐厅********");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.完成订单");
            System.out.println("5.我要点赞");
            System.out.println("选择功能");
            int choose = input.nextInt();

            switch (choose) {
                case 1:
                    System.out.println("************我要订餐************");
                    if (num >= 4) {
                        System.out.println("对不起，餐厅已经爆满，不能再订餐了");
                        break;
                    }
                    // 显示菜名
                    System.out.printf("%-10s\t%-10s\t%-10s\t%-10s\n","序号","菜名","单价","点赞数");
                    for (int i = 0; i < dishNames.length; i++) {
                        System.out.printf("%-10d\t%-10s\t%-10.2f\t%-10d\n", (i + 1), dishNames[i], price[i], praiseNums[i]);

                    }
                    // 用户输入订餐信息
                    System.out.println("请输入订餐人姓名");
                    String name = input.next();
                    System.out.println("请选择您要点的菜品编号");
                    int chooseDish = input.nextInt();
                    System.out.println("请选择您要点的份数");
                    int number = input.nextInt();
                    System.out.println("请输入送餐时间（送餐时间是0点到24点间整点送餐）");
                    int time = input.nextInt();
                    System.out.println("请输入送餐地址");
                    String add = input.next();
                    // 计算总金额
                    double sumPrice = price[chooseDish - 1] * number;
                    sumPrice = sumPrice >= 50 ? sumPrice : sumPrice + 5;
                    // 添加到订单
                    names[num] = name;
                    dishMsg[num] = dishNames[chooseDish - 1] + " " + number + "份";
                    times[num] = time;
                    address[num] = add;
                    sumPrices[num] = sumPrice;
                    status[num] = 0;
                    num++;
                    System.out.println("订餐成功");
                    break;

                case 2:
                    System.out.println("************餐袋************");
                    System.out.printf("%-10s\t%-20s\t%-10s\t%-30s\t%-10s\t%-10s\n", "订餐用户", "菜名和份数", "送餐时间", "送餐地址",
                            "总金额",
                            "订单状态");
                    for (int i = 0; i < num; i++) {
                        // 假设names, dishMsg, times, address, sumPrices, status数组已经定义并且至少有一个元素
                        System.out.printf("%-10s\t%-20s\t%-10s\t%-30s\t%-10s\t%-10s\n", names[i], dishMsg[i], times[i],
                                address[i], sumPrices[i], status[i] == 0 ? "已预订" : "已完成");
                    }
                    break;
                case 3:
                    System.out.println("************签收订单************");
                    System.out.println("请输入要签收的订单序号");
                    int sign = input.nextInt();
                    if (status[sign] == 0) {
                        status[sign] = 1;
                        System.out.println("签收成功");
                    } else {
                        System.out.println("订单已经签收");
                    }
                    break;
                case 4:
                    System.out.println("************删除订单************");
                    System.out.println("请输入要删除的订单序号");
                    int delete = input.nextInt();
                    for (int i = delete; i < num - 1; i++) {
                        names[i] = names[i + 1];
                        dishMsg[i] = dishMsg[i + 1];
                        times[i] = times[i + 1];
                        address[i] = address[i + 1];
                        sumPrices[i] = sumPrices[i + 1];
                        status[i] = status[i + 1];
                    }
                    num--;
                    System.out.println("删除成功");
                    break;
                case 5:
                    System.out.println("************我要点赞************");
                    System.out.println("序号\t菜名\t单价\t点赞数");
                    for (int i = 0; i < dishNames.length; i++) {
                        System.out.printf("%d\t%s\t%.2f\t%d\n", (i + 1), dishNames[i], price[i], praiseNums[i]);
                    }
                    System.out.println("请选择您要点赞的菜品序号");
                    int praise = input.nextInt();
                    praiseNums[praise - 1]++;
                    System.out.println("点赞成功");
                    break;
            }
            int go = wait_();
            if(go != 0){
                break;
            }


        }
    }
}