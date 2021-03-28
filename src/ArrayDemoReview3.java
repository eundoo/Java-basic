
public class ArrayDemoReview3 {

	public static void main(String[] args) {
		
		String[] names = {"김유신","이순신","홍길동"};
		int[] korScores = {100, 80, 30};
		int[] engScores = {80, 100, 50};
		int[] mathScores = {80, 100, 20};
		
		System.out.println("####수강신청 학생 목록####");
		for (String x : names) {
			System.out.println(x);
		}
		
		System.out.println("####김유신 학생의 국어 영어 수학 점수####");
		System.out.println(names[0] + korScores[0] + "," + engScores[0] + "," + mathScores[0]);
		//간단배열에서는 이렇게 원하는 인덱스 + 원하는 인덱스 + ... 해서 출력할 수 있네
		System.out.println("####국어 점수의 총점과 평균####");
		
		int korTotal = 0;
		int korAverage = 0;
		
		for (int kor : korScores) {
			korTotal += kor; // kor는 for문이 한번씩 실행 될때마다 100, 80, 30으로 변한다. 
		}
		
		korAverage = korTotal/korScores.length;
		System.out.println("국어점수 총점: " + korTotal);
		System.out.println("국어점수 평균: " + korAverage);

		
		
		
		System.out.println("####수학점수의 총점과 평균####");
		int mathTotal = 0;
		int mathAverage = 0;
		
		for(int math : mathScores) { // mathScores의 값은 그냥 챤챤챤 숫자만 배열의 인덱스대로
			mathTotal += math;			// 바뀌는거고 실질적으로 값이 입력되는 것은 왼쪽의 math라고
		}
		mathAverage = mathTotal/mathScores.length;
		System.out.println("수학점수 총점: " + mathTotal);
		System.out.println("수학점수 평균: " + mathAverage);
		
		System.out.println("####영어점수의 총점과 평균####");
		int engTotal = 0;
		int engAverage = 0;
		
		for(int eng : engScores) {
			engTotal += eng;
		}
		engAverage = engTotal/engScores.length;
		System.out.println("영어점수 총점: " + engTotal);
		System.out.println("영어점수 평균: " + engAverage);
		
		
		System.out.println("####전체 학생 성적정보 출력####");
		
		for (int i=0; i<3; i++) {
			String studentName = names[i]; 
			int kor = korScores[i];
			int eng = engScores[i];
			int math = mathScores[i];
			
			int total = kor + eng + math;
			int average = total/3;
			System.out.println(studentName +"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+average);
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
