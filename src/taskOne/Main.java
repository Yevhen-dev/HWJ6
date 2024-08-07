package taskOne;

public class Main {

	public static void main(String[] args) {
		
		int[] nums = new int[] { -2, 3, 7, 54, 5, 2, 9 };
		int big = showBigestNum(nums);
		System.out.println(big);

	}

	public static int showBigestNum( int[] arr ) {
		int num = arr[0];
		
		for( int i = 0; i < arr.length; i++ ) {
			if( arr[i] > num ) {
				num = arr[i];
			}
		}
		
		return num;
	}
}
