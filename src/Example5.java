import java.util.Scanner;
public class Example5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 학생이름, 전자계산기, 데이터베이스, 알고리즘 점수를 입력받는다.
		 * 학생이름, 각 과목점수, 총점, 평균, 합격여부를 출력한다.
		 * 평균이 60점 이상이면 합격이다.
		 * 한 과목이라도 40점 미만인 경우는 불합격이다.
		 */
		
		System.out.println("학생이름을 입력하시오");
		String name = sc.next();
		
		System.out.println("전자계산기 점수를 입력하시오");
		int cul = sc.nextInt();
		
		System.out.println("데이터베이스 점수를 입력하시오");
		int dT = sc.nextInt();
		
		System.out.println("알고리즘 점수를 입력하시오");
		int a = sc.nextInt();
		
		//총점을 계산한다.
		int total = cul + dT + a;
		//평균을 계산한다.
		int average = total/3;
		
//		String result = "";
		
		if(average >= 60) {
			if(cul < 40 || dT < 40 || a < 40) {
				System.out.println("불합격이야");
			} else {	
			System.out.println("합격이야");
			}
		} else {
			System.out.println("불합격이야");
		}
		
		System.out.println("학생이름: " + name);
		System.out.println("과목점수 전자계산기: " + cul);
		System.out.println("과목점수 데이터베이스: " + dT);
		System.out.println("과목점수 알고리즘: " + a);
		System.out.println("총점: " + total);
		System.out.println("평균: " + average);
		System.out.println("합격여부: " + );
		
		
	}

}
