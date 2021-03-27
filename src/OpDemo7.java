
public class OpDemo7 {

	public static void main(String[] args) {
		// �⺻�ڷ����� ����ȯ
		// �⺻�ڷ��� Ÿ���� ���� �ٸ� Ÿ���� ������ ��ȯ�ϴ� ���̴�.
		// ���� -> �Ǽ�, �Ǽ� -> ����, ���� -> ����, ���� -> ���ڷ� ��ȯ�ϴ� �͸� �����ϴ�.
		// 
		// byte -> short -> int -> long ->float -> double
		
		
		
		// �ڵ� ����ȯ
		int a = 10;		// 4byte [00000000][00000000][00000000][00001010]
		
		long b = a;		// 8byte [00000000][00000000][00000000][00001010] -> [00000000][00000000][00000000][00000000][00000000][00000000][00000000][00001010]
		float c = a;	// 10 -> 10.0 a���� ������ �� ���� 10.0���� ��ȯ�� �� c�� ���Եȴ�.
		double d = a;	// 10 -> 10.0 a���� ������ �� ���� 10.0���� ��ȯ�� �� d�� ���Եȴ�.
		System.out.println("longŸ���� ����: " + b);
		System.out.println("floatŸ���� ����: " + c);
		System.out.println("doubleŸ���� ����: " + b);
		System.out.println("a�� ��: " + a);
		
		
		System.out.println(3/4);		// 0		<-- ����/����
		System.out.println(3.0/4.0);	// 0.75		<-- �Ǽ�/�Ǽ�
		System.out.println(3.0/4);		// 0.75		<-- 3.0/4.0 <- 3.0/4 <-�Ǽ�/����
		System.out.println(3/4.0);		// 0.75		<-- 3.0/4.0 <- 3/4.0 <-����/�Ǽ�
										//�̷��� ���̴� Ÿ���� �ٲٰ� ��Ÿ���ٰ�
		
		// ���� ����ȯ
		double x = 3.14;
		float l = (float) x;	//doubleŸ���� ���� floatŸ���� ������ ����ȯ �� 1�� �����Ѵ�.
		long m = (long) x;		//doubleŸ���� ���� longŸ���� ������ ����ȯ �� m�� �����Ѵ�.
		int n = (int) x;		//doubleŸ���� ���� intŸ���� ������ ����ȯ �� n�� �����Ѵ�.
		System.out.println("l�� ��: " + l);
		System.out.println("m�� ��: " + m);
		System.out.println("n�� ��: " + n);
		System.out.println("x�� ��: " + x);
		
		// ��� ����ϱ�
		int kor = 70;			// ��������
		int eng = 100;			// ��������
		int math = 74;			// ��������
		int subjectCount = 3;	//�����
		
		// �Ҽ��� ���� ��հ�
		int average = (kor + eng + math)/subjectCount;		// ���� <- (����+����+����)/����
															// 81
		// �Ҽ��� �ִ� ��հ�
		double average2 = (kor + eng + math)/subjectCount;	// �Ǽ� <- ���� <- (����+����+����)/����
															// 81.0 <- 81
		// �Ҽ��� �ִ� ��հ�
		double average3 = (kor + eng + math)/ (double) subjectCount;	// double�� �ٲ���ߵȴٰ�
		
		System.out.println("�Ҽ����� ���� ��հ�: " + average);
		System.out.println("�Ҽ����� �ִ� ��հ�: " + average2);
		System.out.println("�Ҽ����� �ִ� ��հ�: " + average3);
		
		// ���ڿ� �������� ����ȯ
		// int -> char
		// ���� 65�� �ش��ϴ� �����ڵ幮�ڰ� ������ ����ȴ�.
								//�����ڵ幮��		16����	10����
		char ch1 = 65;			//A <- \u0041	<-	0x41	<- 65
		char ch2 = 44032;		//�� <- \uac00	<-	0xac00	<- 44032
		System.out.println(ch1);
		System.out.println(ch2);
		
		System.out.println((char) 65); // int -> char
		System.out.println((int) 'A'); // char -> int
		
		
		
	}

}
