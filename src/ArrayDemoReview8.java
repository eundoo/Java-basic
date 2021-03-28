
public class ArrayDemoReview8 {

	public static void main(String[] args) {
		String[][] names = new String[3][];
		
		String[] items1 = {"javascript", "python", "swift"};
		String[] items2 = {"java", "C", "C++", "C#"};
		String[] items3 = {"react", "vue.js", "angular", "Ember", "Ext JS"};
		
		names[0] = items1;
		names[1] = items2;
		names[2] = items3;
		
//		System.out.println(names.length);
//		System.out.println(names[0].length);
//		System.out.println(names[1].length);
//		System.out.println(names[2].length);
//		
//		for (int i=0; i<names.length; i++) {
//			for (int j=0; j<names[i].length; j++) {
//				System.out.println(names[i][j]);
//			}
//			System.out.println();
//		}
		
		for (String[] arr : names) {
			for (String x : arr) {
				System.out.println(x);
			}
			System.out.println();
		}
		
	}

}
