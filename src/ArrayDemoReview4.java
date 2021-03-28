
public class ArrayDemoReview4 {

	public static void main(String[] args) {
		
		//### 배열 만들기 
		String[] depts = new String[5];
		depts[0] = "컴퓨터공학과";
		depts[1] = "통계학과";
		depts[2] = "수학과";
		depts[3] = "전자공학과";
		depts[4] = "정보통신학과";
		
		
		
		String[] names = {"이순신", "김유신", "강감찬", "유관순"};
		
		double[] scores = {3.1, 3.0, 4.0, 4.3};
		
		
		for (int i=0; i<5; i++) {
			System.out.println(depts[i]);
		}
		
		for (String name : names) {
			System.out.println(name);
		}
		
		for (double score : scores) {
			System.out.println(score);
		}
		
		System.out.println(names[0]);
		System.out.println(scores[0]);
		//언제는 for문 안에 String name = names[i]; 이것도 있었고 어쩔때는 아니고
		//요게 헷갈림
		
		
		double total = 0.0;
		double average = 0.0;
		
		for (double score : scores) {
			total += score*10;  // 3.1 => 31 , 3.0 => 30 , 4.0 => 40, 4.3 => 43
		} //소수점 뒤에 숫자가 많이 붙으면 곱하거나 나눌생각을 해야됨
		
		System.out.println(total);
		
		total /= 10; // total = total / 10
		average = total/scores.length;
		
		System.out.println(total);
		System.out.println(average);
		
		
		
	
	}

}
