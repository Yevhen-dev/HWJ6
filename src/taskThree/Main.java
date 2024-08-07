package taskThree;

public class Main {

	public static void main(String[] args) {
	
		int[] numbers = new int[] {2, 5, 7, 10, 15, 22, 43, 56, 22, 75};
		
		System.out.println( findElemInArr(numbers, 22) );
		

	}
	
	public static int findElemInArr( int[] arr, int n ) {
		
		int index = -1;
		
		for( int i = 0; i < arr.length; i++ ) {
			if( arr[i] == n ) {
				return i;
			}
		}
		
		return index;
	}

}
