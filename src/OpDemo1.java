
public class OpDemo1 {

	public static void main(String[] args) {
		
		//���� ������
		// + - * / %
		int num1 = 3;
		int num2 = 4;
		double num3 = 3.0;
		double num4 = 4.0;
		
		
		System.out.println(num1 + num2); //7
		System.out.println(num1 - num2); //-1
		System.out.println(num1*num2); //12
		System.out.println(num1/num2); //0 		����/���� ����� ������.
		System.out.println(num3/num4); //0.75 	�Ǽ�/�Ǽ��� ����� �Ǽ���.
		System.out.println(num1%num2); //3
		
		// �Ǽ������� ������ ����� �ٸ� �������� ���� �� ����
		// �Ǽ��� 10�� ����� ���ؼ� ������ ���� �� ����� �����ϰ�, �ٽ� 10�� ����� ������.
		double num5 = 0.1;
		double num6 = 0.2;
		System.out.println(num5 + num6); //0.300000000000004
		System.out.println((num5*10 + num6*10)/10); //0.3
	}

}
