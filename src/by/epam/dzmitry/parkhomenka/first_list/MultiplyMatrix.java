package by.epam.dzmitry.parkhomenka.first_list;

public class MultiplyMatrix {
	public static void main(String[] args) {
		// initializing first matrix
		int a = 3;
		int[][] b = new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				b[i][j] = a * i + j;
			}
		}

		// initializing second matrix
		int[][] c = new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				c[i][j] = a * i + j;
			}
		}

		// initializing third matrix, that will contain multiplication result later
		int[][] d = new int[a][a];
		for (int i=0; i<a; i++) {
			for (int j=0; j<a; j++) {
				d[i][j] = 0;
			}
		}
		
		// printing first matrix
		System.out.println("First matrix");
		System.out.println("---------------------");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.printf("%3d", b[i][j]);
			}
			System.out.println();
		}

		// printing second matrix
		System.out.println("Second matrix");
		System.out.println("---------------------");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.printf("%3d", c[i][j]);
			}
			System.out.println();
		}

		// multiplying matrices
		for (int i = 0; i < b.length; i++) {
			for (int j = 0; j < c[0].length; j++) {
				for (int k = 0; k < b[0].length; k++) {
					d[i][j] += b[i][k] * c[k][j];
				}
			}
		}
		
		// printing matrix with multiplication result
		System.out.println("Multiplication result");
		System.out.println("---------------------");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.printf("%4d", d[i][j]);
			}
			System.out.println();
		}
	}
}
