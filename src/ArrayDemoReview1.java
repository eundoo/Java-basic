
public class ArrayDemoReview1 {

	public static void main(String[] args) {
		
		/*
		 * int[] numbers = new int[5];
		 * double[] numbers = new double[5];
		 * String[] numbers = new String[5];
		 * 
		 * 
		 */
		
//		int[] i = new int[5];
//		double[] d = new double[5];
//		String[] s = new String[5];
//	
//		int z1 = i[0];
//		int z2 = i[1];
//		
//		double x1 = d[0];
//		double x2 = d[1];
//		
//		String c1 = s[0];
//		String c2 = s[1];
//		
//		System.out.println(z1);
//		System.out.println(z2);
//		System.out.println(x1);
//		System.out.println(x2);
//		System.out.println(c1);
//		System.out.println(c2);
//		
//		
//		//값을 나열해서 배열객체 생성하기
//		int[] ii = {28, 158, 1994};
//		String[] ss = {"노래", "춤", "기타"};
//		
//		int i1 = ii[0];
//		int i2 = ii[1];
//		int i3 = ii[2];
//		
//		String s1 = ss[0];
//		String s2 = ss[1];
//		String s3 = ss[2];
//		
//		System.out.println(i1);
//		System.out.println(i2);
//		System.out.println(i3);
//		System.out.println(s1);
//		System.out.println(s2);
//		System.out.println(s3);
		

		int[] balances = new int[3];
		String[] depts = new String[3];
		String[] subjects = {"국어", "영어", "수학"};  //배열생성과 값를 동시에만듦
		
		for (int i=0; i<3; i++) {
			String deptName = depts[i];
			System.out.println("학과명: " + deptName);
		} //null값이 들어있다는걸 증명

		balances[0] = 100;
		balances[1] = 200;
		balances[2] = 300; //배열 안에 값를 넣음
		
		depts[0] = "전자공학과";
		depts[1] = "컴퓨터공학과";
		depts[2] = "통계학과"; //배열 안에 값를 넣음
		
		subjects[2] = "과학"; // 배열 안에 값을 바꿈
		
//		String s = subjects[0];
//		String s1 = subjects[1];
//		String s2 = subjects[2]; //여기서 왜 국어국어국어가 나오지??
		
		System.out.println("학과명 배열의 크기: " + depts.length);
		for (int i=0; i<depts.length; i++) {
			String deptName = depts[i]; //여기 i는 왜계속 오류 뜨는거야?? for ();이렇게 세미콜론
			System.out.println("학과명: " + deptName); //잘못 붙여서 i뒤에 오류뜸
		}
		
		System.out.println("학과명 배열의 크기: " + balances.length);
		for (int i=0; i<balances.length; i++) {
			int amount = balances[i];
			System.out.println("잔액: " + amount);
		}
		
		System.out.println("학과명 배열의 크기: " + subjects.length);
			for(int i=0; i<subjects.length; i++) {
				System.out.println("과목명: " + subjects[i]); //String을 만들 필요가 없는게
			}												//이미 배열과 값이 들어가 있으니까 
															//for문을 이용해서 [i]값이 0,1,2로바뀌는것만 필요하다.
	
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
                       