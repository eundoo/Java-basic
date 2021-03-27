import java.util.Scanner;

public class ForDemo4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//반복문 탈출하기
		//break구문을 사용하면 반복문을 탈출할 수 있다.
		//break는 반복문(for문, while문, do~while문)과 switch문 내에서만 사용할 수 있다.
		System.out.println("### 프로그램 시작");
		
		//이 포문 블록자체가 5번 똑같이 실행된다고 보면됨
		for (int i=1; i<=5; i++) {
			System.out.println("숫자를 입력하세요");
			
			//한번돌때만 유효하고 한바꾸돌면 사라짐
			int number = sc.nextInt();
			System.out.println("입력한 숫자:" + number);
			
			if(number <= 0) { //탈출조건. 사용자가 0이나 음수를 입력하면 반복문을 탈출한다.
				break;
			}
			
		}

		sc.close();
		System.out.println("### 프로그램 종료");
	}

}

		// [홍길동, 김유신, 강감찬, 이순신, 유관순, 안중근]
		/*
		 * int index = -1; -1은 배열에서 절대로 나올 수 없는 일련번호 값이다.
		 * 반복문을 다 수행했는데 -1로 되어있으면 검색하는 값이 존재하지 않음을 나타낸다.
		 * 
		 * for (int i=0; i<6; i++) {
		 * 	i번째 값 가져오기
		 * 	i번째 값이 이순신과 일치하면
		 * 	index에 i번째 값을 대입한다.
		 * 	반복문을 탈출한다. (더 이상 이순신을 찾을 필요없다)
		 * }
		 * 
		 * if (index != -1) {
		 * 	이순신은 index번째에 있음
		 * } else {
		 * 	이순신이 존재하지 않음
		 * }
		 */
