import java.util.Arrays;

public class ArrayDemoReview6 {

	public static void main(String[] args) {
		
		int[] lotto = new int[6];
		
		int position = 0;
		while(true) {
			if(position == 6) {
				break;
			}
			
			int number = (int) (Math.random()*45) + 1;
			
			boolean isExist = false;
			for (int no : lotto) {
				if (no == number) {
					isExist = true;
					break;
				}
			}

			if (!isExist) {
				lotto[position] = number;
				position++;
			}
			
			lotto[position] = number;
			position++;
		}
		
		Arrays.sort(lotto);
		
		for (int x : lotto) {
			System.out.print(x + " ");
		}
		
	}

}
