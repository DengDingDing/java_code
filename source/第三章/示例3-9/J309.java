public class J309 {
public static void main(String arg[])    {
        int i,j,sum;                   //定义变量
        for(i=1;i<1000;i++)   {
            sum=0;
            for(j=1;j<i;j++)     {
                if(i%j==0) sum=sum+j;  //因子累加
            }
            if(sum==i)                  //判定是否为完全数
            System.out.print(i+"\t");
       }
       System.out.println();
}
}
