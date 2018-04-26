package by.epam.dzmitry.parkhomenka.second_list.second_task;

import java.util.HashMap;
import java.util.Map;

public class HashMapSpeedCheck {
	Map<Integer, Integer> hashmap = new HashMap<Integer, Integer>();

	public Map<Integer, Integer> getHashmap() {
		return hashmap;
	}

	// adding
	public static void addToArray(Map<Integer, Integer> hashmap) {
		long startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			hashmap.put(i, i);
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Add time to HashMap " + estimatedTime);
	}

	// removing
	public static void removeFromArray(Map<Integer, Integer> hashmap) {

		long startTime = System.nanoTime();

		hashmap.remove(5600);

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Remove time from HashMap " + estimatedTime);
	}

	// searching
	public static void searchInArray(Map<Integer, Integer> hashmap) {
		long startTime = System.nanoTime();

		for (int temp : hashmap.keySet()) {
			if (temp == 564) {
			}
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Search time in HashMap " + estimatedTime);
	}
}
