
public class OpDemo4 {

	public static void main(String[] args) {
		// �� ������
		// > >= < <= == !=
		int x = 3;
		int y = 4;
		
		System.out.println(x > y);		// x�� ���� y�� ������ ū��?			false
		System.out.println(x >= y);		// x�� ���� y�� ������ ũ�ų� ������?	false
		System.out.println(x < y);		// x�� ���� y�� ������ ������?		true
		System.out.println(x <= y);		// x�� ���� y�� ������ �۰ų� ������?	true
		System.out.println(x == y);		// x�� ���� y�� ���� ������?			false
		System.out.println(x != y);		// x�� ���� y�� ���� ���� ������?		true
		
		int a = 4000;
		// a�� ���� 1000�̻� 5000�����ΰ�?
		// System.out.printLn(1000 <= a <= 5000); // ����
		 System.out.println(1000 <= a && a <= 5000);
		
		 // ������� ���θ� Ȯ���غ���
		 // ����Ÿ��� 10�� km �̻� ��� ������� �Ѵ�.
		 // ���Ⱓ�� 3�� �̻��� ��� ������� �Ѵ�.
		 // 2���� ���� �� �ϳ��� �����Ǹ� ������� �Ѵ�.
		 
		 int distance = 50000;
		 int usedYear = 4;
		 
		 // ����Ÿ��� �����Ÿ� �̻��ΰ�?
		 // ���Ⱓ�� �����Ⱓ �̻��ΰ�?
		 boolean result1 = distance >= 100000;
		 boolean result2 = usedYear >= 3;
		 System.out.println(result1);
		 System.out.println(result2);
		 System.out.println("���� ����");
		 System.out.println(result1 || result2);
		 
		 
		 
	}

}
