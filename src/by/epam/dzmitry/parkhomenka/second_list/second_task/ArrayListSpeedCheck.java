package by.epam.dzmitry.parkhomenka.second_list.second_task;

import java.util.ArrayList;
import java.util.List;

public class ArrayListSpeedCheck {
	List<Integer> arraylist = new ArrayList<Integer>();
		
	public List<Integer> getArraylist() {
		return arraylist;
	}

	// adding
	public static void addToArray(List<Integer> arraylist) {
		long startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			arraylist.add(i);
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Add time to ArrayList " + estimatedTime);
	}

	// removing
	public static void removeFromArray(List<Integer> arraylist) {

		long startTime = System.nanoTime();

		arraylist.remove(5600);

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Remove time from ArrayList " + estimatedTime);
	}

	// searching
	public static void searchInArray(List<Integer> arraylist) {
		long startTime = System.nanoTime();

		for (int temp : arraylist) {
			if (temp == 564) {
			}
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Search time in ArrayList " + estimatedTime);
	}
}
