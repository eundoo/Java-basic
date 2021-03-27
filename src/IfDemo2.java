
public class IfDemo2 {

	public static void main(String[] args) {
		
		/*
		 * 91점 이상이면 'A', 81점 이상이면 'B', 71점 이상이면 'C'
		 * 61점 이상이면 'D', 60점 이하는 'F'를 출력한다.
		 * 
		 */
		
		int score = 80;
		
		if (score >= 91) {
			System.out.println("A학점");
		} else if (score >= 81) {
			System.out.println("B학점");
		} else if (score >= 71) {
			System.out.println("C학점");
		} else if (score >= 61) {
			System.out.println("D학점");
		} else {
			System.out.println("F학점");
		}
	}

}
