
public class VarDemo2 {

	public static void main(String[] args) {
		// ���� ��74512321210.0
		int a = 1000000;
		int b = 1_000_000; // _�� �̿��ؼ� �ڸ����� ǥ���� �� �ִ�.
		int c = 010; //0���� �����ϸ� 8���� 10�̴�. 010�� 8�̴�.
		int d = 0x10; //0x�� �����ϸ� 16���� 10�̴�. 0x10�� 16�̴�.
		long e = 100000000L; // intŸ���� ���� ������ -21�� ~21���̴�. int������ �Ѿ�� 
		//���� long Ÿ���� ������ ��´�. ���̻� L�� ���δ�.
		
		// ���� ���ͷ�
		char ch1 ='A';
		char ch2 ='��';
		char ch3 = '��';
		char ch4 = '0'; //���� ���ͷ��� �ݵ�� �� ���ڸ� ������ �־�� �Ѵ�.
		char ch5 = ' '; //���鵵 �� �����̴�.
		char ch6 = '\t'; //�� ����
		char ch7 = '\n'; //�� �ٲ� ����
		char ch8 = '\''; // '
		char ch9 = '\"'; // "
		char ch10 = '\\'; // \
		// �����ڵ�� ���ڸ� ǥ���ϱ�
		char ch11 = '\u0076';
		System.out.println('\uac00');
		System.out.println('\uac01');
		System.out.println('\uac02');
		
		String st1 = "";
		String st2 = "�����ٶ�";
		String st3 = "����� ���α� ����� 10�� 105 ��Ƹ� ���� 402ȣ";
		String st4 = "������\n������\n�̼���\n\uac00\uac00\uac00";
		System.out.println(st4);

		//�Ǽ� ���ͷ�
		double d1 = 3.14;
		double d2 = 3.;
		double d3 = 3.0e4;
		System.out.println(d1);
		System.out.println(d2);
		System.out.println(d3);
		
		float f1 = 3.14f; // �Ǽ��� floatŸ���� ������ ������ ���� f�� ���̻�� ���δ�.
		float f2 = 3.f;
		float f3 = 5.0e4f;
		
		//�Ҹ��� ���ͷ�
		boolean b1 = true; // booleanŸ���� ���� ���� true, false �� ���� ���̴�.
		boolean b2 = false;
		
	}

}