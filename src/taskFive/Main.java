package taskFive;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		int[] arr = showTwoNum(100);
		
		System.out.println( "The biggest number from which you can get palindrome are: "
							+ arr[0] + " * " + arr[1] + " = " + arr[0] * arr[1]  );

	}

	public static int[] showTwoNum( int initialNum ) {
		int[] res = new int[2];
		
		for( int i = initialNum; i <= 999; i++ ) {
			for( int j = initialNum; j <= 999; j++ ) {
				if( isPalindrom(i, j) ) {
					addToArr(res, i, j);
				}
				
			}
		}
		return res;
	}
	
	private static void addToArr(int[] array, int numOne, int numTwo) {
		array[0] = numOne;
		array[1] = numTwo;
	}

	public static boolean isPalindrom( int a, int b ) {
		int count = 0;
		char[] arr = String.valueOf( a * b ).toCharArray();
		for( int i = 0; i < arr.length/2; i++ ) {
			if( arr[i] == arr[ arr.length - i - 1 ] ) {
				count++;
			} else {
				break;
			}
		}
		
		if( count == arr.length/2 ) {
			return true;
		}
		
		return false;
	}
}
