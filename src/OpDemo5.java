
public class OpDemo5 {

	public static void main(String[] args) {
		// �� ������ 
		// && || ! 
		// �� �̻��� �� ���� ����� ���ļ� ���� ����� ȹ���� �� ���Ǵ� �����ڴ�. (!�� �˿�)
		// ���������� ����/���׿��� �Ҹ����� ���ų�, ���� �������� �Ҹ����� �͸� ��ġ�� �� �ֽ��ϴ�.
		
		// �ڵ��� ����ó�� �����ϱ�
		// ����Ÿ��� 10�� km �̻��̰ų� ���Ⱓ�� 3�� �̻��� ������ ������� ����̴�.
		// ����
		int distance = 50000;
		int usedYear = 2;
		
		boolean result1 = distance >= 100000 || usedYear >= 3;
		System.out.println("������� ���� �������");
		System.out.println(result1);
		
		// ����ǰ ���� ����
		// ���� ���(1,2,3����� ����)�� 2��� ���� ���ų� ����, ���űݾ��� 10���� �̻��� ��� ����ǰ ���� ����̴�.
		// ����
		int grade = 3;
		int orderPrice = 500000;
		
		boolean result2 = grade <=2 && orderPrice >=100000;
		System.out.println("����ǰ ���� ���� �������");
		System.out.println(result2);
		
		// ���б� ���� ����
		// ����, ����, ���������� ����� 90�� �̻��̰�, ���������� 95�� �̻��� ��� ���б� ���� ����̴�. 
		// ������ kor, eng, math, result3
		int kor = 90;
		int eng = 80;
		int math = 70;
		int average = 80;
		
		boolean result3 = average >= 90 && kor >= 95;
		System.out.println("���б� ����");
		System.out.println(result3);
		
		// ����Ʈ ���� ����
		// ����Ƚ���� 10ȸ �̻��̰ų�, ���� ���űݾ��� 100���� �̻��� ��� ����Ʈ ���� ����̴�.
		// ������ orderCount, orderPrice, result4
		int orderCount = 11;
		int orderPrice2 = 1000000;
		
		boolean result4 = orderCount >=10 || orderPrice2 >= 1000000;
		System.out.println("����Ʈ ���޿��� �������");
		System.out.println(result4);
		
		
		
		
		
		
		
		

		
		
		
		
		
		
		
	}

}
