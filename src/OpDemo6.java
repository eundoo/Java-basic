
public class OpDemo6 {

	public static void main(String[] args) {
		//���� ������(3�� ������)
		//���ǽ� ? ��1 : ��2
		//���ǽ��� true�� �����Ǹ� ��1�� ��������� ��
		//���ǽ��� false�� �����Ǹ� ��2�� ��������� ��
		//��1�� ��2�� ������Ÿ���� �����ؾ� �Ѵ�.
		
		// ���輺���� 60�� �̻��̸� �հ�, �� �ܴ� ���հ��̴�.
		int score = 80;
		String result1 = score >=60 ? "�հ�" : "���հ�";
		System.out.println("������� : "+ result1);
		
		// ���űݾ��� 30���� �̻��̸� ��������Ʈ�� 3% ����, �� �ܴ� 1% �����Ѵ�.
		int orderPrice = 100000;
		double point = orderPrice >= 300000 ? orderPrice*0.03 : orderPrice*0.01;
		System.out.println("��������Ʈ: " + point);
		
		
	}	

}
