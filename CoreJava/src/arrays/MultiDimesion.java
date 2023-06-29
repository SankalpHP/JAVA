package arrays;

public class MultiDimesion {

	public static void main(String[] args) {
		
		int [] [] MyNumbers = {{1,2,3,4} , {5,6,7}};
		
		
		for(int a = 0 ; a < MyNumbers.length ; a++) {
			for(int b = 0 ; b < MyNumbers[a].length ; b++) {
				System.out.println(MyNumbers[a][b]);
			}
		}
	}
}
