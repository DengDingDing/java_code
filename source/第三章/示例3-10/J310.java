public class J310 {
public static void main(String arg[]) {
    int[] array={10,78,57,89,37,64,5,23,45,76};//定义一维数组
    int find=5;                        //指定数据初始化
    int i=0;                           //数组下标初始化
    boolean flag=false;                //搜索标记初始化
    for(;i<array.length;i++)   {          //查找数组中的所有元素  
        if (array[i]==find)  {          //如果找到数据
            flag=true;
            break;                     //终止循环
        }
    }
    if (flag==true)
         System.out.println("Found "+find+" at index:"+i);
    else
         System.out.println("not found!");
}
}
