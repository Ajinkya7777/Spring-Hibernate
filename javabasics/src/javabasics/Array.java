package javabasics;

public class Array {
	
	public static void main(String[] args) {
		
		
		int[][] array = new int[2][2];
		
		System.out.println(" Hello java !");
		//int[][] array = new int[3][3];
		for (int i = 0; i<array.length; i++) {
			for (int j = 0; j <array[i].length; j++) {
				int temp = 0;
				array[i][j] = temp++;
			}
		}
		for (int i = 0; i<array.length; i++) {
			for (int j = 0; j <array[i].length; j++) {
				System.out.print(array[i][j]);
			}
			
			System.out.println();
	}

}
}