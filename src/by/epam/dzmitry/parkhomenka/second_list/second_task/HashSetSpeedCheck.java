package by.epam.dzmitry.parkhomenka.second_list.second_task;

import java.util.HashSet;
import java.util.Set;

public class HashSetSpeedCheck {
	Set<Integer> hashset = new HashSet<Integer>();

	public Set<Integer> getHashset() {
		return hashset;
	}

	// adding
	public static void addToArray(Set<Integer> hashset) {
		long startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			hashset.add(i);
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Add time to HashSet " + estimatedTime);
	}

	// removing
	public static void removeFromArray(Set<Integer> hashset) {

		long startTime = System.nanoTime();

		hashset.remove(5600);

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Remove time from HashSet " + estimatedTime);
	}

	// searching
	public static void searchInArray(Set<Integer> hashset) {
		long startTime = System.nanoTime();

		for (int temp : hashset) {
			if (temp == 564) {
			}
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Search time in HashSet " + estimatedTime);
	}
}
