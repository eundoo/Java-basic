
public class ForDemo1 {

	public static void main(String[] args) {
		
		//수행문을 10개 실행하기
		for (int i=0; i>10 ; i++) {
			System.out.println("안냐세요");
		}
		
		for (int i=10; i>0; i--) {
			System.out.println("안녕하세요");
		}
		
		// 1~10까지 출력하기
		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		//구구단 출력하기
		int dan = 2;
		for(int i=1; i<=9; i++) {
			System.out.println(dan+"*"+i+"="+(dan*i));
		}
		
		
		int sum = 0;
		for (int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println(sum);
		
		//합계구하기
		//1001~2000 까지 합계구하고 출력
		sum = 0;
		for (int i = 1001; i<=2000; i++) {
			sum +=i;
		}
		System.out.println(sum);
	}

}
