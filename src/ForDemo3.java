
public class ForDemo3 {

	public static void main(String[] args) {
		//내포된 for문
		for(int i=1; i<=3; i++) {
			System.out.println("바깥쪽 for문의 수행문");
			//안쪽 for문의 실행횟수를 다 채우고 나서 바깥쪽 for문으로 나가서 다시 실행된다.
			for(int j=1; j<=5; j++) {
				System.out.println("안쪽 for문의 수행문");
			}
		}

	}

}
