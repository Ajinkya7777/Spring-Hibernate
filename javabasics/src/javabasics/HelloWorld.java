package javabasics;

public class HelloWorld {

	public static void main(String[] args) {

		System.out.println(" Hello java !");
		int[][] twodArray = new int[3][3];
		for (int i = 0; i<twodArray.length; i++) {
			for (int j = 0; j <twodArray[i].length; j++) {
				int temp = 0;
				twodArray[i][j] = temp++;
			}
		}
		for (int i = 0; i<twodArray.length; i++) {
			for (int j = 0; j <twodArray[i].length; j++) {
				System.out.print(twodArray[i][j]);
			}

			System.out.println();
		}

	}

}
