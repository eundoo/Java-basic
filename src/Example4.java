import java.util.Scanner;

public class Example4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 * 고객이름, 고객등급(1,2,3 중 하나다), 누적구매횟수, 당일 총 구매금액을 입력받는다.
		 * 고객이름, 고객등급, 누적구매횟수, 당일 총 구매금액, 적립포인트, 사은품지급여부를 출력한다.
		 * 적립포인트는 1등급고객의 경우 당일구매금액의 3%이고, 나머지는 1%이다.
		 * 사은품 지급여부는 등급이 1등급이거나, 누적구매횟수가 5회 이상이거나, 당일 총 구매금액이 30만원 이상이면
		 * 사은품 지급 대상이다. (사은품 지급 여부는 "지급대상임", "지급대상이아님"으로 출력한다.)
		 * 
		 * 적립포인트와 사은품 지급여부를 계산할 때는 조건식 ? 값1 : 값2 조건 연산자를 사용한다.
		 * 조건 연산자의 조건식은 true/false를 최종 연산결과로 나오는 비교연산자, 논리연산자를 사용한다.
		 */
		
		//고객이름을 입력하세요를 출력한다.
		System.out.println("고객이름을 입력하세요");
		//고객이름을 읽어서 변수에 저장한다.
		String customerName = sc.next();
		
		//고객등급을 입력하세요를 출력한다.
		System.out.println("고객등급을 입력하세요");
		//고객등급을 읽어서 변수에 저장한다.
		int customerGrade = sc.nextInt();
		
		//누적구매횟수를 입력하세요를 출력한다.
		System.out.println("누적 구매횟수를 입력하세요");
		//누적구매횟수를 읽어서 변수에 저장한다.
		int totalOrderCount = sc.nextInt();
		
		//당일 총 구매금액을 입력하세요를 출력한다.
		System.out.println("당일 총 구매금액을 입력하세요");
		//당일 총 구매금액을 읽어서 변수에 저장한다.
		int totalOrderPrice = sc.nextInt();
		
		//당일 총 구매금액과 적립률로 포인트를 계산해서 변수에 저장한다.
		//포인트는 1등급인 경우와 아닌 경우로 구분해서 계산한 다음 변수에 저장한다.
		double point = (customerGrade == 1 ? totalOrderPrice * 0.03 : totalOrderPrice * 0.01);

		//사은품지급대상인지 여부를 판정해서 변수에 저장한다.
		//위에서 제시한 사은품 지급대상일 경우만 "지급대상"임을, 아닌 경우에는 "지급대상아님"이 변수에 저장된다.
		boolean result = customerGrade == 1 || totalOrderCount >=5 || totalOrderPrice >= 300000;
		String gift = result ? "지급대상임" : "지급대상아님";
		
		//모든내용을 출력한다.
		System.out.println("========================");
		System.out.println("고객명 : " + customerName);
		System.out.println("고객등급 : " + customerGrade);
		System.out.println("방문횟수 : " + totalOrderCount);
		System.out.println("포인트 : " + point);
		System.out.println("사은품 : " + gift);
		System.out.println("========================");
		
		
//		//은혜가한고
//		System.out.println("고객이름을 입력하세요");
//		String customerName = sc.next();
//		
//		System.out.println("고객등급을 입력하세요");
//		String customerGrade = sc.next();
//		
//		System.out.println("누적구매횟수를 입력하세요");
//		int totalAmount = sc.nextInt();
//		
//		System.out.println("당일 총 구매금액을 입력하세요");
//		int todayTotalPrice = sc.nextInt();
//		
//		int point = customerGrade == 1 ? todayTotalPrice*0.03 : todayTotalPrice*0.01;
//		
//		int gifts = customerGrade == 1 || totalAmount >=5 ||  todayTotalPrice >=300000 ? "지급대상" : "지급대상아님";
//		
//		System.out.println("고객이름 :"+ customerName);
//		System.out.println("고객등급 :"+ customerGrade);
//		System.out.println("누적구매횟수 :"+ totalAmount);
//		System.out.println("당일 총 구매금액 :"+ todayTotalPrice);
//		System.out.println("사은품 :"+ gifts );
		
	}

}
