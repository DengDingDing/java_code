public class j206
{
	 public static void main(String arg[])
	  {
          int x=1,y=2;
          int num1=5,num2=5,num3=5,num4=5;
          boolean r1,r2,r3,r4;
          r1=x>y & num1++==5;         //���߱��ʽ������
          r2=x>y && num2++==5;       //ֻ������߱��ʽ
          r3=x<y | num3++==5;         //���߱��ʽ������
          r4=x<y || num4++==5;        //ֻ������߱��ʽ
          System.out.println("�߼�ֵ��r1="+r1+","+"num1="+num1);
          System.out.println("�߼�ֵ��r2="+r2+","+"num2="+num2);
          System.out.println("�߼�ֵ��r3="+r3+","+"num3="+num3);
          System.out.println("�߼�ֵ��r4="+r4+","+"num4="+num4);
        }
}
