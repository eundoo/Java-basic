import java.util.Scanner;

public class Example3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 제품명, 가격, 구매수량을 입력받는다.
		 * 출력내용은 제품명, 가격, 구매수량, 총구매가격, 적립포인트이다.
		 * 적립포인트는 총 구매가격의 1%다.
		 */
		
		// 제품명을 입력하라는 메세지를 화면에 출력한다.
		System.out.println("제품명을 입력하세요");
		// 제품명을 입력받아서 변수에 저장한다.
		String productName = sc.next();
		
		// 가격을 입력하라는 메세지를 화면에 출력한다.
		System.out.println("가격을 입력하세요");
		// 가격을 입력받아서 변수에 저장한다.
		int price = sc.nextInt();
		
		// 구매수량을 입력하라는 메세지를 화면에 출력한다.
		System.out.println("구매수량을 입력하세요");
		// 구매수량을 입력받아서 변수에 저장한다.
		int orderAmount = sc.nextInt();
		
		// 가격과 구매수량을 곱해서 총 구매가격을 계산하고 변수에 저장한다.
		int totalOrderPrice = price * orderAmount;
		//총 구매가격에 적립률을 곱해서 적립포인트를 계산하고 변수에 저장한다.
		int point = (int) (totalOrderPrice * 0.01); // double을 강제형변환 int로 한거야
		// 변수에 저장된 모든 값(제품명, 가격, 구매수량, 총 구매가격, 적립포인트)를 출력한다.
		System.out.println("======================");
		System.out.println("제품명: " + productName);
		System.out.println("가격: " + price);
		System.out.println("구매수량: " + orderAmount);
		System.out.println("총 구매가격: " + totalOrderPrice);
		System.out.println("적립포인트: " + point);
		System.out.println("======================");
		
		
		
		
//		// 은혜가 한거
//		System.out.println("제품명을 입력하세요");
//		String product = sc.next();
//		
//		System.out.println("가격을 입력하세요");
//		int price = sc.nextInt();
//		
//		System.out.println("구매수량을 입력하세요");
//		int number = sc.nextInt();
//		
//		int totalPrice = price*number;
//		double point = totalPrice*0.01; //정수하고 실수니까 최종적으로 실수가 나오잖어 double이 더 크니까
//		
//		System.out.println("제품명 " + product);
//		System.out.println("가격 " + price);
//		System.out.println("구매수량 " + number);
//		System.out.println("총 구매가격 " + totalPrice);
//		System.out.println("적립포인트 " + point);
	}

}
