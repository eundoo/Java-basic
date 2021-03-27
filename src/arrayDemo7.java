
public class arrayDemo7 {

	public static void main(String[] args) {
		// 다차원 배열의 선언 및 생성
		/*
		 * 다차원 배열 
		 * 		1차원 배열
		 * 			int[] x = new int [3]
		 * 			int[] x = {1, 2, 3, 4, 5}
		 * 		2차원 배열
		 * 			타입[][] 변수명 = new 타입 [행의 갯수][열의 갯수];
		 * 			타입[][] 변수명 = {{값, 값, 값}, {값,값,값}}
		 * 			String[][] x = new String[2][3];
		 * 			String[][] x {{"김유신", "이순신", "강감찬"}, {"홍길동", "유관순", "안중근"}};
		 * 
		 * 
		 * 				0		1		2
		 *			|---------------------|
		 *		0	|"김유신"|"이순신"|"강감찬"|
		 *			|---------------------|
		 *		1	|"홍길동"|"유관순"|"안중근"|
		 *			|---------------------|
		 *
		 *
		 */		
		
		int[][] scores = {{70, 50, 80}, {100,80,100}};
		
		//다차원 배열의 값 출력하기
		System.out.println(scores[0][0]);	//70
		System.out.println(scores[0][1]);	//50
		System.out.println(scores[0][2]);	//80
		
		System.out.println(scores[0][3]);	//100
		System.out.println(scores[0][4]);	//80
		System.out.println(scores[0][5]);	//10

//		//for문을 사용해서 다차원 배열의 모든 값을 출력하기
//		for (int i=0; i<2; i++) {		//행의갯수
//			for (int j=0; j<3; j++) {	//열의갯수
//				System.out.println(scores[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		//.legnth 가 필요한 이유는 행은정해져있는데 열은 안정해져있는 비정방형의 배열 때문에 그렇게 써야됨 (비정방형은 흔한 경우는 아니래)
		for (int i=0; i<scores.length; i++) {		//행의갯수
			for (int j=0; j<scores[i].length; j++) {		//열의갯수
				System.out.println(scores[i][j] + " ");
		} //위에꺼가 이렇게도 가능하다고
		System.out.println();
	}
		
	}

}
