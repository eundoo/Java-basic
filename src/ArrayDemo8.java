
public class ArrayDemo8 {

	public static void main(String[] args) {
		// 2차원 배열을 생성할 때 열의 크기를 지정하지 않아도 된다.
		// 정방형의 크기를 만들때에만 뒤에도 숫자를 써주는데 아래 items처럼 3개 4개 5개로 다 다른것도 만들 수 있어 그럴때는 
		// 행의크기는 정하고 열의 크기는 정하지 않는거임 (각 행의 배열의 길이가 서로 다른 2차원 배열을 구성할 수 있다.
		// 3행*X열 2차원 배열 생성하기
		String[][] names = new String[3][];
		
		//위에서 정의한 배열의 0번째, 1번째, 2번째 행에 포함될 배열을 생성하기(각 배열의 크기가 서로 다름)
		String[] items1 = {"javascript", "python", "swift"};
		String[] items2 = {"java", "C", "C++", "C#"};
		String[] items3 = {"react", "vue.js", "angular", "Ember", "Ext JS"};
		
		//위에서 정의한 names배열의 0번째, 1번째, 2번째 각각의 배열을 대입시키기
		names[0] = items1;
		names[1] = items2;
		names[2] = items3;
		
		//행과 열의 크기 확인하기
		System.out.println("행의 크기:" + names.length);
		System.out.println("0번째 배열의 크기:" + names[0].length);
		System.out.println("1번째 배열의 크기:" + names[1].length);
		System.out.println("2번째 배열의 크기:" + names[2].length);
		
		// 일반 for문으로 names 배열의 모든 값 출력하기
		for (int i =0; i<names.length; i++) {
			for (int j=0; j<names[i].length; j++) {
				System.out.printf("%-15s", names[i][j]);
			}
			System.out.println();
		}
		System.out.println("======================================================================");
		
		//향상된 for문으로 names 배열의 모든 값출력하기
		//향상된 for문은 배열의 배열도 다룰 수 있는거야
		//머릿속에 배열이 어떻게 되어있는지 그려야 한다고 
		//강사님은 향상된포문을 사용하자고 하심
		//내가 인덱스가 꼭필요한 경우 1-3까지 필요한경우 이런거는 일반for문으로 하지만 전체 다 끄내는거는 향상된 for문을 쓴다.
		for (String[] arr : names) {
			for(String x : arr) {
				System.out.printf("%-15s", x);
			}
			System.out.println();
		}
		
	}

}
