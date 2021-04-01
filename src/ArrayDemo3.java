
public class ArrayDemo3 {

	public static void main(String[] args) {
		//배열의 활용
		String[] names = {"김유신", "이순신", "홍길동"};
		int[] korScores = {100, 80, 30};
		int[] engScores = {80, 100, 50};
		int[] mathScores = {80, 100, 20};
		
		// 이번에 수업에 참여한 모든 학생의 이름을 출력하시오
		System.out.println("###수강신청 학생 목록###");
		for (String x : names) {
			System.out.println(x);
		}
		// 김유신 학생의 성적을 전부 출력하시오.
		System.out.println("###김유신 학생의 국어, 영어, 수학, 점수###");
		System.out.println(names[0] + korScores[0] + "," + engScores[0] + "," + mathScores[0]);
		
		System.out.println("###국어점수의 총점과 평균###");
		// 국어 점수의 평균을 출력하시오
		//		국어점수의 총합을 계산한다.
		//		평균은 국어점수의 총합을 3으로 나누어서 계산한다.
		int korTotal = 0;
		int korAverage = 0;
		for (int kor : korScores) {
			korTotal += kor; // korTotal += 100, korTotal +=80; korTotal += 30;이 실행
			
		}
		korAverage = korTotal/korScores.length;	//korAverage = korTotal/korScores.length;
		System.out.println("국어점수 총점: " + korTotal);
		System.out.println("국어점수 총점: " + korAverage);

		/*for (int kor : korScores) {
		 		korTotal += kor;
		}
		위에서 정의한 향상된 for문의 실행...
		int[] korScores = {100,80,30};
		
		int korTotal = 0;
		for(int kor = 100 : korScores) { //첫번째 값 100이 kor에 대입되고 수행문이 실행됨
			KorTotal += kor;		//korTotal => 100;
		}	 
		for(int kor = 80 : korScores) {	//두째 값 80이 kor에 대입되고 수행문이 실행됨
			korTotal += kor;		//korTotal => 180;}
		}
		for(int kor = 30 korScores) {	//세째 값 30이 kor에 대입되고 수행문이 실행됨
			korTotal += kor;		//korTotal => 210;
		}
		*/
	
		
		/*String[] names = {"김유신", "이순신", "홍길동"};
		int[] korScores = {100, 80, 30};
		int[] engScores = {80, 100, 50};
		int[] mathScores = {80, 100, 20};
		*/
		
		System.out.println("### 수학점수의 총점과 평균###");
		// 수학 점수의 평균을 출력하시오.
		int mathTotal = 0;
		int mathAverage = 0;
		for (int math : mathScores) {
			mathTotal += math;
		}
		mathAverage = mathTotal/mathScores.length;
		System.out.println("수학점수 총점: " + mathTotal);
		System.out.println("수학점수 평균: " + mathAverage);
		
		System.out.println("### 영어점수의 총점과 평균###");
		// 영어 점수의 평균을 출력하시오.
		int engTotal = 0;
		int engAverage = 0;
		for (int eng : engScores) {
			engTotal += eng;
		}
		
		engAverage = engTotal / engScores.length;
		System.out.println("영어점수 총점: " + engTotal);
		System.out.println("영어점수 평균: " + engAverage);
		
		// 각 학생별 학생이름, 국어, 영어, 수학점수, 총점, 평균점수를 출력하시오.
		
		/*String[] names = {"김유신", "이순신", "홍길동"};
		int[] korScores = {100, 80, 30};
		int[] engScores = {80, 100, 50};
		int[] mathScores = {80, 100, 20};
		*/
		
		System.out.println("### 전체 학생 성적정보 출력###");
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
