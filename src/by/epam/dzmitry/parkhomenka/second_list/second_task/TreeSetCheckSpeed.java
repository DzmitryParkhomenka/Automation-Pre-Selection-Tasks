package by.epam.dzmitry.parkhomenka.second_list.second_task;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetCheckSpeed {
	Set<Integer> treeset = new TreeSet<Integer>();

	public Set<Integer> getTreeset() {
		return treeset;
	}

	// adding
	public static void addToArray(Set<Integer> treeset) {
		long startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			treeset.add(i);
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Add time to TreeSet " + estimatedTime);
	}

	// removing
	public static void removeFromArray(Set<Integer> treeset) {

		long startTime = System.nanoTime();

		treeset.remove(5600);

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Remove time from TreeSet " + estimatedTime);
	}

	// searching
	public static void searchInArray(Set<Integer> treeset) {
		long startTime = System.nanoTime();

		for (int temp : treeset) {
			if (temp == 564) {
			}
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Search time in TreeSet " + estimatedTime);
	}
}
