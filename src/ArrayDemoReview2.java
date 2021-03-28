
public class ArrayDemoReview2 {

	public static void main(String[] args) {
		String[] names = {"김유신", "강감찬", "이순신"};
		int[] scores = {100, 90, 50, 70, 60};
		double[] rates = {0.03, 0.1, 0.05};
		
		for (int i=0; i<names.length; i++) {
			String x = names[i];
			System.out.println(x);
		}
		
		for (int i=0; i<scores.length; i++) {
			int y = scores[i];
			System.out.println(y);
		}
		
		for (int i=0; i<rates.length; i++) {
			double z = rates[i];
			System.out.println(z);
		}

		
		//향상된 for문은 (타입 (스페이스) 내가 새로만들 변수명 입력 : 배열을 받아올 변수명)
		for (String a : names) {
			System.out.println(a);
		}
		
		for (int b : scores) {
			System.out.println(b);
		}
		
		for (double c : rates) {
			System.out.println(c);
		}
		
	}

}
