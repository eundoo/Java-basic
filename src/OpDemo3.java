
public class OpDemo3 {

	public static void main(String[] args) {
		//���� ������
		// ++ --
		int num1 = 10;
		
		num1++;
		num1++;
		num1++;
		System.out.println(num1);
		
		++num1;
		++num1;
		++num1;
		System.out.println(num1);
		
		// ���������ڸ� �ٸ� �����ڿ� ���� ����ϴ� ��� �����ڸ� ���̴� ��ġ�� ���� ������� �޶�����.
		// ���������ڸ� �ٸ� �����ڿ� ���� ������� ����. �������� ��������.
		int num2 = 100;
		int num3 = 100;
		
		int x = ++num2;		//num2�� ���� 1������Ų �� x�� �����Ѵ�.
		int y = num3++;		//num3�� ���� y�� ������ �� num3�� ���� 1 ���� ��Ų��.
		
		System.out.println(x); //101;
		System.out.println(y); //100;

		// �����İ� �ٸ� �����ڸ� �и��ؼ� �ڵ��Ѵ�.
		int num4 = 300;
		int num5 = 300;
		
		// �̰� ó��
		num4++;
		++num5;
		
		int l = num4;
		int m = num5;
		
		System.out.println(l);
		System.out.println(m);
	}

}
