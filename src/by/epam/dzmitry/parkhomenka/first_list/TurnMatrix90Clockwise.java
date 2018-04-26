package by.epam.dzmitry.parkhomenka.first_list;

import java.util.Arrays;
import java.util.Collections;

public class TurnMatrix90Clockwise {
	public static void main(String[] args) {
		// initializing default matrix
		int a = 3;
		int[][] b = new int[a][a];
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				b[i][j] = a * i + j;
			}
		}

		// printing default matrix
		System.out.println("Default matrix");
		System.out.println("---------------------");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.printf("%3d", b[i][j]);
			}
			System.out.println();
		}

		// reversing each row
		Collections.reverse(Arrays.asList(b));

		// transposing default matrix
		for (int i = 0; i < a; i++) {
			for (int j = i + 1; j < a; j++) {
				int temp = b[i][j];
				b[i][j] = b[j][i];
				b[j][i] = temp;
			}
		}

		// printing turned default matrix 90 degrees clockwise
		System.out.println("Turned 90 degrees clockwise matrix");
		System.out.println("---------------------");
		for (int i = 0; i < a; i++) {
			for (int j = 0; j < a; j++) {
				System.out.printf("%3d", b[i][j]);
			}
			System.out.println();
		}
	}
}
