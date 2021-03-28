
public class ArrayDemoReview7 {

	public static void main(String[] args) {
//		int[][] i = new int [3][3];
//		int[][] ii = {{1,1,1},{2,2,2}};

		int[][] scores = {{70,50,80}, {100,80,100}};
		
//		System.out.println(scores[0][0]);
//		System.out.println(scores[1][1]);
//		System.out.println(scores[1][2]);
		
		
//		for (int i=0; i<2; i++) { //행
//			for (int j=0; j<3; j++) { //열
//				System.out.println(scores[i][j] + " "); //2행3열짜리
		
		
		for (int i=0; i<scores.length; i++) {
			for (int j=0; j<scores[i].length; j++) { //0번째 행의길이, 1번째 행의길이가 다를 수 있기 때문에
				System.out.println(scores[i][j] + " ");
			}
		}
	
	}

}
