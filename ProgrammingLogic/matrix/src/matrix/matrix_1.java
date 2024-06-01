package matrix;

import java.util.Scanner;

public class matrix_1 {


	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		int n = sc.nextInt();
		int[][] mat = new int[n][n];

		
		for (int i = 0; i < mat.length; i++) { // 'mat.length' == rows range
			for (int j = 0; j < mat[i].length; j++) { // 'mat[i].length' == range of columns on mat[i] row
				mat[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Main diagonal:");
		for (int i = 0; i < mat.length; i++) { // 'mat.lenght' == rows range
			System.out.print(mat[i][i] + " ");
		}
		System.out.println();
		
		int count = 0;
		
		for (int i = 0; i < mat.length; i++) { // 'mat.length' == rows range
			for (int j = 0; j < mat[i].length; j++) { // 'mat[i].length' == range of columns on mat[i] row
				if (mat[i][j] < 0) {
					count ++;
				}
			}
		}

		System.out.println("Negative numbers: " + count);
		sc.close();
	}
}
