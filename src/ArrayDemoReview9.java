
public class ArrayDemoReview9 {

	public static void main(String[] args) {
		String[] names = {"김유신", "강감찬", "이순신", "유관순"};
		
		int[][] scores = { 	{100,  100,  100},
							{90,  70,  80},
							{70,  60,  40},
							{100, 80,  90}  }; // int[][] scores = int[3][2];이거를 {}를
												// 사용해서 한번에 만들어버린거지

		for (int score : scores[0]) {
			System.out.println(score);
		}
		System.out.println();
		
//		int korTotal = 0;
//		int korAverage = 0;
//		
//		for (int[] row : scores) {
//			korTotal += row[0]; 
//		}
//		
//		System.out.println(korTotal); // 여기 국어 과목의 총점과 평균계산이 이해가 안감
		
		
		
	

	}

}
