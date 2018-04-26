package by.epam.dzmitry.parkhomenka.second_list.second_task;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapSpeedCheck {
	Map<Integer, Integer> treemap = new TreeMap<Integer, Integer>();

	public Map<Integer, Integer> getTreemap() {
		return treemap;
	}

	// adding
	public static void addToArray(Map<Integer, Integer> treemap) {
		long startTime = System.nanoTime();

		for (int i = 0; i < 100000; i++) {
			treemap.put(i, i);
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Add time to TreeMap " + estimatedTime);
	}

	// removing
	public static void removeFromArray(Map<Integer, Integer> treemap) {

		long startTime = System.nanoTime();

		treemap.remove(5600);

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Remove time from TreeMap " + estimatedTime);
	}

	// searching
	public static void searchInArray(Map<Integer, Integer> treemap) {
		long startTime = System.nanoTime();

		for (int temp : treemap.keySet()) {
			if (temp == 564) {
			}
		}

		long estimatedTime = System.nanoTime() - startTime;

		System.out.println("Search time in TreeMap " + estimatedTime);
	}
}
