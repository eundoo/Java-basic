// java.util ��Ű���� ��ġ�� Scanner.class�� ����ϱ� ���ؼ� �����´�. å61p
// Scanner ���赵 (Ŭ����)�� Ű����, ���� ������ ���� �Էµ� ������ �о�� �� �ִ� ����� �����Ѵ�.
import java.util.Scanner;

public class Example1 {

	public static void main(String[] args) {
		//System.in�� ǥ���Է���ġ��.
		//�ý��ۿ��� ǥ���Է���ġ�� Ű���带 ���Ѵ�.
		//Scanner sc�� Scanner ���赵�� ���� ��ü�� �ּҰ��� ��� ���� sc�� �����Ѵ�.
		//new Scanner(System.in)�� ǥ���Է���ġ�� �Է��ϴ� ������ �о���� Scanner��ü�� �����Ѵ�.
		//Scanner sc = new Scanner(system.in)�� 
		//		ǥ���Է���ġ�� �Է��� ������ �о���� Scanner ��ü�� ������ ��,
		//		�� ��ü�� �ּҰ��� sc�� �����϶�.
		//sc�� ������ ��ü�� ������ �Ӽ��� ����� ����� �� �ʿ��� ������ ������ �����Ѵ�.
		//sc�� ���ؼ��� ������ ��ü�� ����/����� �� �ִ�.
		//sc.nextInt(); sc.next(); sc.nextDouble(); sc.nextLine() ���� ���๮���� 
		//�Էµ� ���� �о�� �� �ִ�.
		Scanner sc = new Scanner(System.in);
	
		System.out.println("�̸��� �Է��ϼ���");
		String value = sc.nextLine();
		
		System.out.println("���̸� �Է��ϼ���");
		int value2 = sc.nextInt();
		
		System.out.println("�Էµ� �̸�: " + value);
		System.out.println("�Էµ� ����: " + value2);
	}

}
