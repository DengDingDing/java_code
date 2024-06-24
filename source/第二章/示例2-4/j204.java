public class j204 {
	static int x = 5; // �������xΪ�����

	public static void main(String arg[]) {
		int y = 23; // �������yΪ�ֲ�����
		System.out.println("x=" + x);
		System.out.println("y=" + y);
		m(6); // ���÷���m����
	}

	static void m(int z) // �������zΪ��������
	{
		System.out.println("z=" + z);
		System.out.println("x=" + x);
	}
}
