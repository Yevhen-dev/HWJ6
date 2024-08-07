package taskTwo;

public class Main {

	public static void main(String[] args) {
		
		drawRect(5, 5);

	}
	
	public static void drawRect( int w, int h ) {
		
		for( int i = 0; i < h; i++ ) {
			for( int j = 0; j < w; j++ ) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
