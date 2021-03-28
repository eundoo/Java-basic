
public class ArrayDemoReview5 {

	public static void main(String[] args) {
		int[] scores = {79, 88, 91, 100, 55, 95};
		
		int min = 100;
		int max = 0;
		
		System.out.println("###최소, 최대값 출력하기");
		
		for (int score : scores) { //향상된 for문은 배열 전체를 꺼낸다!!!!!
			if (score < min) {
				min = score;
			}
		}
		
		for (int score : scores) {
			if (score > max) {
				max = score;
			}
		}
		

	}

}
